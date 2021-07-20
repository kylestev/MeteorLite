package meteor.ui.controllers;

import com.jfoenix.controls.JFXToggleButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import net.runelite.rs.Reflection;
import org.sponge.util.Logger;
import meteor.Plugin;
import meteor.MeteorLite;
import meteor.plugins.stretchedmode.StretchedModePlugin;

import java.io.IOException;

public class PluginsFXMLController {
    Logger logger = new Logger("PluginsFXMLController");
    @FXML private JFXToggleButton reflectionEnabled;

    @FXML protected void toggleStretchedMode(ActionEvent event) {
        StretchedModePlugin.enabled = !StretchedModePlugin.enabled;
        for (Plugin p : MeteorLite.plugins)
        {
            if (p instanceof StretchedModePlugin)
            {
                p.client.setStretchedEnabled(StretchedModePlugin.enabled);
                ((StretchedModePlugin) p).updateConfig();
            }
        }
    }

    @FXML protected void configureStretchedMode(ActionEvent event) throws IOException {
        StretchedModePlugin.showConfig();
    }

    @FXML
    public void initialize() {
        reflectionEnabled.setSelected(Reflection.printDebugMessages);
    }

}