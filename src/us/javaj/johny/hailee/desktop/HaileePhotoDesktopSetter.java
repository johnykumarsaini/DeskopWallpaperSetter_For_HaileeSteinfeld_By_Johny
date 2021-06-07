package us.javaj.johny.hailee.desktop;

import java.io.File;

import com.sun.jna.Native;
import com.sun.jna.platform.win32.Advapi32Util;
import com.sun.jna.platform.win32.WinReg;
import com.sun.jna.win32.StdCallLibrary;

public class HaileePhotoDesktopSetter {

	public static void main(String[] args) {

		HaileePhotoDesktopSetter.changeDesktopWallpaper();

	}

	private interface MyUser32 extends StdCallLibrary {

		MyUser32 INSTANCE = (MyUser32) Native.loadLibrary("user32", MyUser32.class);

		boolean SystemParametersInfoA(int uiAction, int uiParam, String fnm, int fWinIni);
	}

	public static void changeDesktopWallpaper() {

		// -----------------------------------

		String johny = "Johny Invoke the Desktop Background Setter with Love in Hailee Stienfeld ::";
		System.out.println();
		System.out.println("-------------------------------- Hailee Johny --------------------------------------");
		System.out.println();
		System.out.println(johny);
		System.out.println();

		String filePath = "E:\\Hailee-Johny\\Hailee_Stienfeld_Johny_S\\Desktop\\Hailee.jpg";
		//filePath = "E:\\Hailee-Johny\\The-Hailee\\HaileeStienfeldJohny11.jpg";
		
		File file =new File(filePath);
		
     File file1 =new File("E:\\Hailee-Johny\\The-Hailee");
		
     if(file1.isDirectory()) {
    	 
    	// file1.list().length;
    	 
    	 System.out.println();
    	 
    	 
    	String [] files = file1.list();
    	
    	for (String fileName : files) {
    		
    		System.out.println(fileName);
			
		}
     }
		
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getName());
		
		setWallpaper(filePath);
		System.out.println("Desktop Images Set Succussfully ");
		System.out.println("Image File Path :: "+filePath);

	}

	public static void setWallpaper(String filePath) {

		Advapi32Util.registrySetStringValue(WinReg.HKEY_CURRENT_USER, "Control Panel\\Desktop", "CenterWallpaper",
				filePath);
		// WallpaperStyle = 10 (Fill), 6 (Fit), 2 (Stretch), 0 (Tile), 0 (Center)
		// For windows XP, change to 0
		int SPI_SETDESKWALLPAPER = 0x14;
		int SPIF_UPDATEINIFILE = 0x01;
		int SPIF_SENDWININICHANGE = 0x01;
		// User32.System
		boolean result = MyUser32.INSTANCE.SystemParametersInfoA(SPI_SETDESKWALLPAPER, 10, filePath,
				SPIF_UPDATEINIFILE | SPIF_SENDWININICHANGE);
	}

}
