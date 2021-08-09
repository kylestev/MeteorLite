/*
 * Copyright (c) 2017, Seth <Sethtroll3@gmail.com>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package meteor.plugins.woodcutting;

import net.runelite.api.Client;
import net.runelite.api.Skill;
import meteor.ui.overlay.OverlayMenuEntry;
import meteor.ui.overlay.OverlayPanel;
import meteor.ui.overlay.OverlayPosition;
import meteor.ui.overlay.components.LineComponent;
import meteor.ui.overlay.components.TitleComponent;

import javax.inject.Inject;
import java.awt.*;

import static net.runelite.api.MenuAction.RUNELITE_OVERLAY;
import static net.runelite.api.MenuAction.RUNELITE_OVERLAY_CONFIG;
import static meteor.ui.overlay.OverlayManager.OPTION_CONFIGURE;

class WoodcuttingOverlay extends OverlayPanel
{
	static final String WOODCUTTING_RESET = "Reset";

	private final Client client;
	private final WoodcuttingPlugin plugin;
	private final WoodcuttingConfig config;

	@Inject
	private WoodcuttingOverlay(Client client, WoodcuttingPlugin plugin, WoodcuttingConfig config)
	{
		super(plugin);
		setPosition(OverlayPosition.TOP_LEFT);
		this.client = client;
		this.plugin = plugin;
		this.config = config;
		getMenuEntries().add(new OverlayMenuEntry(RUNELITE_OVERLAY_CONFIG, OPTION_CONFIGURE, "Woodcutting overlay"));
		getMenuEntries().add(new OverlayMenuEntry(RUNELITE_OVERLAY, WOODCUTTING_RESET, "Woodcutting overlay"));
	}

	@Override
	public Dimension render(Graphics2D graphics)
	{
		if (!config.showWoodcuttingStats())
		{
			return null;
		}

		WoodcuttingSession session = plugin.getSession();
		if (session == null)
		{
			return null;
		}

		Axe axe = plugin.getAxe();
		if (axe != null && axe.matchesChoppingAnimation(client.getLocalPlayer()))
		{
			panelComponent.getChildren().add(TitleComponent.builder()
				.text("Woodcutting")
				.color(Color.GREEN)
				.build());
		}
		else
		{
			panelComponent.getChildren().add(TitleComponent.builder()
				.text("NOT woodcutting")
				.color(Color.RED)
				.build());
		}
		return super.render(graphics);
	}

}