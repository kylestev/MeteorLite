package osrs;

import java.io.EOFException;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nf")
@Implements("BufferedFile")
public class BufferedFile {
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Lnm;"
   )
   @Export("accessFile")
   AccessFile accessFile;
   @ObfuscatedName("f")
   @Export("readBuffer")
   byte[] readBuffer;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      longValue = 4024474701341933375L
   )
   @Export("readBufferOffset")
   long readBufferOffset = -1L;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = -1725800063
   )
   @Export("readBufferLength")
   int readBufferLength;
   @ObfuscatedName("j")
   @Export("writeBuffer")
   byte[] writeBuffer;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      longValue = 8737860925507049089L
   )
   @Export("writeBufferOffset")
   long writeBufferOffset = -1L;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = -97062741
   )
   @Export("writeBufferLength")
   int writeBufferLength = 0;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      longValue = -3326324260793149209L
   )
   @Export("offset")
   long offset;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      longValue = -6829996619110357721L
   )
   @Export("fileLength")
   long fileLength;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      longValue = 3454228653685997387L
   )
   @Export("length")
   long length;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      longValue = 1780782613106431365L
   )
   @Export("fileOffset")
   long fileOffset;

   @ObfuscatedSignature(
      descriptor = "(Lnm;II)V"
   )
   public BufferedFile(AccessFile var1, int var2, int var3) throws IOException {
      this.accessFile = var1;
      this.length = this.fileLength = var1.length();
      this.readBuffer = new byte[var2];
      this.writeBuffer = new byte[var3];
      this.offset = 0L;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "116"
   )
   @Export("close")
   public void close() throws IOException {
      this.flush();
      this.accessFile.close();
   }

   @ObfuscatedName("n")
   @Export("seek")
   public void seek(long var1) throws IOException {
      if (var1 < 0L) {
         throw new IOException("");
      } else {
         this.offset = var1;
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(B)J",
      garbageValue = "17"
   )
   @Export("length")
   public long length() {
      return this.length;
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "([BB)V",
      garbageValue = "-4"
   )
   @Export("readFully")
   public void readFully(byte[] var1) throws IOException {
      this.read(var1, 0, var1.length);
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "([BIII)V",
      garbageValue = "1635241805"
   )
   @Export("read")
   public void read(byte[] var1, int var2, int var3) throws IOException {
      try {
         if (var3 + var2 > var1.length) {
            throw new ArrayIndexOutOfBoundsException(var3 + var2 - var1.length);
         }

         if (this.writeBufferOffset != -1L && this.offset >= this.writeBufferOffset && (long)var3 + this.offset <= (long)this.writeBufferLength + this.writeBufferOffset) {
            System.arraycopy(this.writeBuffer, (int)(this.offset - this.writeBufferOffset), var1, var2, var3);
            this.offset += (long)var3;
            return;
         }

         long var4 = this.offset;
         int var6 = var3;
         int var7;
         if (this.offset >= this.readBufferOffset && this.offset < this.readBufferOffset + (long)this.readBufferLength) {
            var7 = (int)((long)this.readBufferLength - (this.offset - this.readBufferOffset));
            if (var7 > var3) {
               var7 = var3;
            }

            System.arraycopy(this.readBuffer, (int)(this.offset - this.readBufferOffset), var1, var2, var7);
            this.offset += (long)var7;
            var2 += var7;
            var3 -= var7;
         }

         if (var3 > this.readBuffer.length) {
            this.accessFile.seek(this.offset);

            for(this.fileOffset = this.offset; var3 > 0; var3 -= var7) {
               var7 = this.accessFile.read(var1, var2, var3);
               if (var7 == -1) {
                  break;
               }

               this.fileOffset += (long)var7;
               this.offset += (long)var7;
               var2 += var7;
            }
         } else if (var3 > 0) {
            this.load();
            var7 = var3;
            if (var3 > this.readBufferLength) {
               var7 = this.readBufferLength;
            }

            System.arraycopy(this.readBuffer, 0, var1, var2, var7);
            var2 += var7;
            var3 -= var7;
            this.offset += (long)var7;
         }

         if (-1L != this.writeBufferOffset) {
            if (this.writeBufferOffset > this.offset && var3 > 0) {
               var7 = var2 + (int)(this.writeBufferOffset - this.offset);
               if (var7 > var3 + var2) {
                  var7 = var3 + var2;
               }

               while(var2 < var7) {
                  var1[var2++] = 0;
                  --var3;
                  ++this.offset;
               }
            }

            long var8 = -1L;
            long var10 = -1L;
            if (this.writeBufferOffset >= var4 && this.writeBufferOffset < (long)var6 + var4) {
               var8 = this.writeBufferOffset;
            } else if (var4 >= this.writeBufferOffset && var4 < this.writeBufferOffset + (long)this.writeBufferLength) {
               var8 = var4;
            }

            if ((long)this.writeBufferLength + this.writeBufferOffset > var4 && this.writeBufferOffset + (long)this.writeBufferLength <= (long)var6 + var4) {
               var10 = this.writeBufferOffset + (long)this.writeBufferLength;
            } else if (var4 + (long)var6 > this.writeBufferOffset && (long)var6 + var4 <= (long)this.writeBufferLength + this.writeBufferOffset) {
               var10 = var4 + (long)var6;
            }

            if (var8 > -1L && var10 > var8) {
               int var12 = (int)(var10 - var8);
               System.arraycopy(this.writeBuffer, (int)(var8 - this.writeBufferOffset), var1, (int)(var8 - var4) + var2, var12);
               if (var10 > this.offset) {
                  var3 = (int)((long)var3 - (var10 - this.offset));
                  this.offset = var10;
               }
            }
         }
      } catch (IOException var13) {
         this.fileOffset = -1L;
         throw var13;
      }

      if (var3 > 0) {
         throw new EOFException();
      }
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "104"
   )
   @Export("load")
   void load() throws IOException {
      this.readBufferLength = 0;
      if (this.offset != this.fileOffset) {
         this.accessFile.seek(this.offset);
         this.fileOffset = this.offset;
      }

      int var1;
      for(this.readBufferOffset = this.offset; this.readBufferLength < this.readBuffer.length; this.readBufferLength += var1) {
         int var2 = this.readBuffer.length - this.readBufferLength;
         if (var2 > 200000000) {
            var2 = 200000000;
         }

         var1 = this.accessFile.read(this.readBuffer, this.readBufferLength, var2);
         if (var1 == -1) {
            break;
         }

         this.fileOffset += (long)var1;
      }

   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "([BIII)V",
      garbageValue = "231162903"
   )
   @Export("write")
   public void write(byte[] var1, int var2, int var3) throws IOException {
      try {
         if ((long)var3 + this.offset > this.length) {
            this.length = (long)var3 + this.offset;
         }

         if (this.writeBufferOffset != -1L && (this.offset < this.writeBufferOffset || this.offset > this.writeBufferOffset + (long)this.writeBufferLength)) {
            this.flush();
         }

         if (this.writeBufferOffset != -1L && this.offset + (long)var3 > (long)this.writeBuffer.length + this.writeBufferOffset) {
            int var4 = (int)((long)this.writeBuffer.length - (this.offset - this.writeBufferOffset));
            System.arraycopy(var1, var2, this.writeBuffer, (int)(this.offset - this.writeBufferOffset), var4);
            this.offset += (long)var4;
            var2 += var4;
            var3 -= var4;
            this.writeBufferLength = this.writeBuffer.length;
            this.flush();
         }

         if (var3 <= this.writeBuffer.length) {
            if (var3 > 0) {
               if (-1L == this.writeBufferOffset) {
                  this.writeBufferOffset = this.offset;
               }

               System.arraycopy(var1, var2, this.writeBuffer, (int)(this.offset - this.writeBufferOffset), var3);
               this.offset += (long)var3;
               if (this.offset - this.writeBufferOffset > (long)this.writeBufferLength) {
                  this.writeBufferLength = (int)(this.offset - this.writeBufferOffset);
               }
            }
         } else {
            if (this.fileOffset != this.offset) {
               this.accessFile.seek(this.offset);
               this.fileOffset = this.offset;
            }

            this.accessFile.write(var1, var2, var3);
            this.fileOffset += (long)var3;
            if (this.fileOffset > this.fileLength) {
               this.fileLength = this.fileOffset;
            }

            long var10 = -1L;
            long var6 = -1L;
            if (this.offset >= this.readBufferOffset && this.offset < this.readBufferOffset + (long)this.readBufferLength) {
               var10 = this.offset;
            } else if (this.readBufferOffset >= this.offset && this.readBufferOffset < this.offset + (long)var3) {
               var10 = this.readBufferOffset;
            }

            if (this.offset + (long)var3 > this.readBufferOffset && this.offset + (long)var3 <= (long)this.readBufferLength + this.readBufferOffset) {
               var6 = this.offset + (long)var3;
            } else if ((long)this.readBufferLength + this.readBufferOffset > this.offset && (long)this.readBufferLength + this.readBufferOffset <= (long)var3 + this.offset) {
               var6 = this.readBufferOffset + (long)this.readBufferLength;
            }

            if (var10 > -1L && var6 > var10) {
               int var8 = (int)(var6 - var10);
               System.arraycopy(var1, (int)(var10 + (long)var2 - this.offset), this.readBuffer, (int)(var10 - this.readBufferOffset), var8);
            }

            this.offset += (long)var3;
         }

      } catch (IOException var9) {
         this.fileOffset = -1L;
         throw var9;
      }
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1231168990"
   )
   @Export("flush")
   void flush() throws IOException {
      if (this.writeBufferOffset != -1L) {
         if (this.fileOffset != this.writeBufferOffset) {
            this.accessFile.seek(this.writeBufferOffset);
            this.fileOffset = this.writeBufferOffset;
         }

         this.accessFile.write(this.writeBuffer, 0, this.writeBufferLength);
         this.fileOffset += (long)this.writeBufferLength * -27464314403160063L;
         if (this.fileOffset > this.fileLength) {
            this.fileLength = this.fileOffset;
         }

         long var1 = -1L;
         long var3 = -1L;
         if (this.writeBufferOffset >= this.readBufferOffset && this.writeBufferOffset < this.readBufferOffset + (long)this.readBufferLength) {
            var1 = this.writeBufferOffset;
         } else if (this.readBufferOffset >= this.writeBufferOffset && this.readBufferOffset < (long)this.writeBufferLength + this.writeBufferOffset) {
            var1 = this.readBufferOffset;
         }

         if ((long)this.writeBufferLength + this.writeBufferOffset > this.readBufferOffset && (long)this.writeBufferLength + this.writeBufferOffset <= this.readBufferOffset + (long)this.readBufferLength) {
            var3 = this.writeBufferOffset + (long)this.writeBufferLength;
         } else if ((long)this.readBufferLength + this.readBufferOffset > this.writeBufferOffset && this.readBufferOffset + (long)this.readBufferLength <= this.writeBufferOffset + (long)this.writeBufferLength) {
            var3 = (long)this.readBufferLength + this.readBufferOffset;
         }

         if (var1 > -1L && var3 > var1) {
            int var5 = (int)(var3 - var1);
            System.arraycopy(this.writeBuffer, (int)(var1 - this.writeBufferOffset), this.readBuffer, (int)(var1 - this.readBufferOffset), var5);
         }

         this.writeBufferOffset = -1L;
         this.writeBufferLength = 0;
      }

   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)I",
      garbageValue = "-387323412"
   )
   public static int method6418(String var0) {
      return var0.length() + 2;
   }
}
