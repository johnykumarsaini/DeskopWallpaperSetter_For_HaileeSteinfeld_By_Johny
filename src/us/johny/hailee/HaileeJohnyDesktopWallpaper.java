package us.johny.hailee;

import java.awt.Canvas;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import com.sun.jna.Native;
import com.sun.jna.platform.win32.Advapi32Util;
import com.sun.jna.platform.win32.WinReg;
import com.sun.jna.win32.StdCallLibrary;

import us.javaj.johny.hailee.desktop.Constants;
import us.javaj.johny.hailee.desktop.DesktopSetting;
import us.javaj.johny.hailee.desktop.PhotoManager;
import us.javaj.johny.hailee.desktop.Wallpaper;

public class HaileeJohnyDesktopWallpaper extends JFrame implements ActionListener {

	JLabel jLabel = new JLabel();
	final List<String> fileList = null;
	List<Wallpaper> wallpaperList = null;
	private JMenuBar jMenuBar;
	private JMenuItem jMenuItem;
	private JMenu addPhoto;
	private JMenu addFolder;
	private JMenu addTop10Folder;
	private JMenu help;

	static boolean nightWallpaperStatus = Boolean.TRUE;
	static boolean wallpaperListStatus = Boolean.FALSE;
	static boolean top10WallpaperListStatus = Boolean.FALSE;
	static boolean nightSweetTimeFlag = Boolean.FALSE;
	static long nightSweetTimeCounter = 0;
	static int top10WallpaperIndex = 0;
	static int index = 0;

	public HaileeJohnyDesktopWallpaper() {

		setName("Hailee Stienfeld Johny S");
		setSize(1000, 1200);
		setVisible(Boolean.TRUE);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLayout(null);
		setContentPane(new JLabel(new ImageIcon("E:\\Hailee-Johny\\Hailee_Stienfeld_Johny_S\\Hailee-Love-11.jpg")));

		jMenuBar = new JMenuBar();
		jMenuBar.setBounds(25, 25, 100, 100);

		addPhoto = new JMenu("Add Photo");

		jMenuItem = new JMenuItem("Set Break Fast Time Photo");
		jMenuItem.addActionListener(this);

		addPhoto.add(jMenuItem);
		jMenuItem = new JMenuItem("Set After Noon Food Break Time Photo");
		jMenuItem.addActionListener(this);
		addPhoto.add(jMenuItem);
		jMenuBar.add(addPhoto);
		jMenuItem = new JMenuItem("Set Snack  Break Time Photo");
		jMenuItem.addActionListener(this);
		addPhoto.add(jMenuItem);
		jMenuItem = new JMenuItem("Set Dinner Time Photo");
		jMenuItem.addActionListener(this);
		addPhoto.add(jMenuItem);
		jMenuBar.add(addPhoto);

		jMenuItem = new JMenuItem("Set Good Night Time Photo");
		jMenuItem.addActionListener(this);
		addPhoto.add(jMenuItem);
		jMenuBar.add(addPhoto);

		addFolder = new JMenu("Add Wallpaper Folder");
		jMenuItem = new JMenuItem("Add Wallpaper Folder");
		jMenuItem.addActionListener(this);
		addFolder.add(jMenuItem);
		jMenuBar.add(addFolder);

		addTop10Folder = new JMenu("Top 10 Wallpaper Folder");
		jMenuItem = new JMenuItem("Top 10 Wallpaper Folder");
		jMenuItem.addActionListener(this);
		addTop10Folder.add(jMenuItem);
		jMenuBar.add(addTop10Folder);

		help = new JMenu("Help");
		jMenuItem = new JMenuItem("1");
		jMenuItem.addActionListener(this);
		help.add(jMenuItem);
		jMenuBar.add(help);

		setJMenuBar(jMenuBar);

		jLabel.setFont(new Font(Font.DIALOG, Font.BOLD, 17));
		jLabel.setText("Hailee Stienfeld Johny S");
		jLabel.setBounds(300, 10, 300, 21);
		add(jLabel);

		PhotoManager photoManager = new PhotoManager();
		this.wallpaperList = photoManager.findAllPhoto();

	}

	public static void main(String[] args) throws IOException {

		HaileeJohnyDesktopWallpaper jFrame = new HaileeJohnyDesktopWallpaper();

		final Timer timer = new Timer();

		TimerTask changeDeskTop = new TimerTask() {

			HaileeJohnyDesktopWallpaper haileeJohnyDesktopWallpaper = new HaileeJohnyDesktopWallpaper();

			@Override
			public void run() {

				

				haileeJohnyDesktopWallpaper.changeDesktopWallpaper(jFrame, index, top10WallpaperIndex,
						nightWallpaperStatus, wallpaperListStatus, top10WallpaperListStatus);

				
				
				System.out.println("Index :: " + index);
				System.out.println("Top 10 Wallpaper Index :: " + top10WallpaperIndex);
				System.out.println("nightWwallpaperStatus :: " + nightWallpaperStatus);
				System.out.println("wallpaperListStatus :: " + wallpaperListStatus);
				System.out.println("top10WallpaperListStatus :: " + top10WallpaperListStatus);
				
				try {
					
					for (int index = 0; index < 90; index++) {
						
						if(nightSweetTimeFlag) {
							nightSweetTimeCounter++;
						}
						
						Thread.sleep(1000);
						
					}
					
					
					
				} catch (Exception e) {
					// TODO: handle exception
				}
				

			}

		};
		System.out.println("Timer :: ");
		int scheduleTime1 = 1800000;// 30 mintute
		scheduleTime1 = 10 * 1000;
		timer.schedule(changeDeskTop, 0, scheduleTime1);

	}

	private interface MyUser32 extends StdCallLibrary {

		MyUser32 INSTANCE = (MyUser32) Native.loadLibrary("user32", MyUser32.class);

		boolean SystemParametersInfoA(int uiAction, int uiParam, String fnm, int fWinIni);
	}

	public void changeDesktopWallpaper(JFrame jFrame, int index, int top10WallpaperIndex, boolean nightWallpaperStatus,
			boolean wallpaperListStatus, boolean top10WallpaperListStatus) {

		// -----------------------------------

		// JFrame jFrame = new JFrame();

		String directoryPath = "";
		String filePath = "";

		String johny = "Johny Invoke the Desktop Background Setter with Love in Hailee Stienfeld ::";
		System.out.println();
		System.out.println("-------------------------------- Hailee Johny --------------------------------------");
		System.out.println();
		System.out.println(johny);
		System.out.println();

		JLabel jLabel1 = new JLabel();
		jLabel1.setText("Johny Invoke the Desktop Background Setter with Love in Hailee Stienfeld ::");
		jLabel1.setBounds(200, 45, 500, 20);
		jFrame.add(jLabel1);

		JLabel jLabel2 = new JLabel();
		jLabel2.setText("--------------------- Hailee Johny ---------------------");
		jLabel2.setBounds(300, 60, 500, 20);
		jFrame.add(jLabel2);

		JLabel jLabel22 = new JLabel();
		jLabel22.setText("--------------------- Hailee Johny ---------------------");
		jLabel22.setBounds(300, 75, 500, 20);
		// jFrame.add(jLabel22);

		JLabel jLabel3 = new JLabel();
		jLabel3.setBounds(450, 90, 500, 20);
		jLabel3.setText("Time Token ");
		jFrame.add(jLabel3);

		JLabel jLabel4 = new JLabel();
		jLabel4.setBounds(450, 105, 500, 20);
		jFrame.add(jLabel4);

		JLabel jLabel5 = new JLabel();
		jLabel5.setBounds(450, 120, 500, 20);
		jFrame.add(jLabel5);

		JLabel jLabel6 = new JLabel();
		jLabel6.setBounds(450, 135, 500, 20);
		jFrame.add(jLabel6);

		JLabel jLabel7 = new JLabel();
		jLabel7.setBounds(450, 150, 500, 20);
		jFrame.add(jLabel7);

		JLabel jLabe8 = new JLabel();
		jLabe8.setBounds(450, 165, 800, 20);
		jLabe8.setText("Image Name Johny");
		jFrame.add(jLabe8);

		JLabel jLabe9 = new JLabel();
		jLabe9.setBounds(450, 180, 800, 20);
		jLabe9.setText("Image Name Johny");
		jFrame.add(jLabe9);

		JLabel jLabe11 = new JLabel();
		jLabe11.setBounds(450, 200, 800, 20);
		jLabe11.setText("Image Name Johny");
		jFrame.add(jLabe11);

		JButton jButton = new JButton();
		jButton.setBounds(650, 620, 200, 20);
		jButton.setText("View Current Desktop Photo");
		jFrame.add(jButton);

		JButton jButton1 = new JButton();
		jButton1.setBounds(650, 650, 200, 20);
		jButton1.setText("View All Desktop Photo");
		jFrame.add(jButton1);

		// JLabel imageLabel = new JLabel(new
		// ImageIcon("E:\\Hailee-Johny\\Hailee_Stienfeld_Johny_S\\Hailee11.jpg"));
		//
		// imageLabel.setBounds(800, 800, 400, 400);
		//
		// jFrame.add(imageLabel);
		//
		// JPanel imagePanel = new JPanel() {
		//
		// public void paint(java.awt.Graphics g) {
		// Toolkit toolkit = Toolkit.getDefaultToolkit();
		// Image image =
		// toolkit.getImage("E:\\Hailee-Johny\\Hailee_Stienfeld_Johny_S\\Desktop\\Hailee11.jpg");
		// g.drawImage(image, 10, 10, this);
		// // g.drawImage(image, 0, 0, 100, 100, 0, 0, 100, 100,null);
		// };
		// };
		//
		// imagePanel.setBounds(800, 800, 400, 400);
		// jFrame.add(imagePanel);

		Date date1 = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat();
		String date11 = dateFormat.format(date1);
		String timeType = date11.substring(date11.length() - 2, date11.length());
		String[] token = date11.split(" ");
		String timeToken = token[1];
		System.out.println("Time Token :: " + timeToken);
		String timeToken11 = "Time Token   " + timeToken;

		jLabel3.setText(timeToken11);
		// jFrame.add(jLabel3);

		String[] token1 = timeToken.split(":");

		String timeToken1 = token1[0];

		int timeNumber = Integer.parseInt(timeToken1);

		String timeToken2 = token1[1];

		int timeNumber2 = Integer.parseInt(timeToken2);

		System.out.println("Time Number  In Minute :: " + timeToken2);
		jLabel4.setText("Time Number  In Minute  " + timeToken2);

		System.out.println(timeToken1);
		System.out.println("Time Number In Hour :: " + timeToken1);

		jLabel5.setText("Time Number In Hour      " + timeToken1);

		// jFrame.add(jLabel5);

		boolean sweetDreamTime = Boolean.FALSE;

		// wallpapers
		PhotoManager photoManager = new PhotoManager();
		// this.wallpaperList = photoManager.findAllPhoto();

		timeNumber = 10;
		timeType = "AM";

		if ((timeNumber <= 7 || timeNumber >= 12) && "AM".equalsIgnoreCase(timeType)
				|| timeNumber >= 11 && "PM".equalsIgnoreCase(timeType)) {

			System.out.println("Sweet Dream Time :: ");
			jLabel6.setText("Sweet Dream Time :: ");

			// jFrame.add(jLabel6);
			sweetDreamTime = Boolean.TRUE;
			nightSweetTimeFlag =Boolean.TRUE;

		}

		System.out.println("Time Type :: " + timeType);

		jLabel7.setText("Time Type :: " + timeType);

		if ("AM".equalsIgnoreCase(timeType) && (timeNumber >= 8 || timeNumber <= 9)) {

			System.out.println("AM :: Time ");

			if (timeNumber2 >= 15 && timeNumber2 <= 45) {

				Wallpaper wallpaper = photoManager.findAllPhotoWithType("BREAKFASTTIME");
				System.out.println("::wallpaper ::" + wallpaper);

				if (wallpaper != null) {

					filePath = wallpaper.getImageURL();

				} else {

					filePath = "E:\\Hailee-Johny\\Hailee_Stienfeld_Johny_S\\Desktop\\Hailee11.jpg";
					System.out.println("No Break Fast Wallpaper Set  :: " + filePath);
				}

				File file1 = new File(filePath);
				directoryPath = HaileeJohnyDesktopWallpaper.findFilePath(filePath);
				jLabe8.setText("File  Path  =   " + directoryPath);
				jLabe9.setText("Image Name  =   " + file1.getName());
				HaileeJohnyDesktopWallpaper.setWallpaper(filePath);

			}

		}

		if ("PM".equalsIgnoreCase(timeType) && (timeNumber >= 1 || timeNumber <= 2)) {

			System.out.println("AM :: Time ");
			Wallpaper wallpaper = photoManager.findAllPhotoWithType("AFTERNOONFOODBREAK");
			System.out.println("::wallpaper ::" + wallpaper);

			if (wallpaper != null) {

				filePath = wallpaper.getImageURL();

			} else {

				filePath = "E:\\Hailee-Johny\\Hailee_Stienfeld_Johny_S\\Desktop\\Hailee11.jpg";
				System.out.println("No AFTER NOON FOOD BREAK Fast Wallpaper Set  :: " + filePath);
			}

			File file1 = new File(filePath);
			directoryPath = HaileeJohnyDesktopWallpaper.findFilePath(filePath);
			jLabe8.setText("File  Path  =   " + directoryPath);
			jLabe9.setText("Image Name  =   " + file1.getName());
			HaileeJohnyDesktopWallpaper.setWallpaper(filePath);

		}

		if ("PM".equalsIgnoreCase(timeType) && (timeNumber >= 4 && timeNumber <= 5)) {

			System.out.println("PM :: Time ");
			Wallpaper wallpaper = photoManager.findAllPhotoWithType(Constants.SNACK_TIME);
			System.out.println("::wallpaper ::" + wallpaper);

			if (wallpaper != null) {

				filePath = wallpaper.getImageURL();

			} else {

				filePath = "E:\\Hailee-Johny\\Hailee_Stienfeld_Johny_S\\Desktop\\Hailee11.jpg";
				System.out.println("No Snack Time  Wallpaper Set  :: " + filePath);
			}

			File file1 = new File(filePath);
			directoryPath = HaileeJohnyDesktopWallpaper.findFilePath(filePath);
			jLabe8.setText("File  Path  =   " + directoryPath);
			jLabe9.setText("Image Name  =   " + file1.getName());
			HaileeJohnyDesktopWallpaper.setWallpaper(filePath);

		}

		// Dinner Time

		if ("PM".equalsIgnoreCase(timeType) && (timeNumber >= 8 && timeNumber <= 9)) {

			if (timeNumber2 <= 45) {
				System.out.println("PM :: Time ");
				Wallpaper wallpaper = photoManager.findAllPhotoWithType(Constants.DINNER_TIME);
				System.out.println("::wallpaper ::" + wallpaper);

				if (wallpaper != null) {

					filePath = wallpaper.getImageURL();

				} else {

					filePath = "E:\\Hailee-Johny\\Hailee_Stienfeld_Johny_S\\Desktop\\Hailee11.jpg";
					System.out.println("No Snack Time  Wallpaper Set  :: " + filePath);
				}

				File file1 = new File(filePath);
				directoryPath = HaileeJohnyDesktopWallpaper.findFilePath(filePath);
				jLabe8.setText("File  Path  =   " + directoryPath);
				jLabe9.setText("Image Name  =   " + file1.getName());
				HaileeJohnyDesktopWallpaper.setWallpaper(filePath);
			}

		}

		if ("PM".equalsIgnoreCase(timeType) && (timeNumber >= 10 && timeNumber <= 11)) {

			System.out.println("PM :: Time ");
			Wallpaper wallpaper = photoManager.findAllPhotoWithType(Constants.GOOD_NIGHT_TIME);
			System.out.println("::wallpaper ::" + wallpaper);

			if (wallpaper != null) {

				filePath = wallpaper.getImageURL();

			} else {

				filePath = "E:\\Hailee-Johny\\Hailee_Stienfeld_Johny_S\\Desktop\\Hailee11.jpg";
				System.out.println("No Snack Time  Wallpaper Set  :: " + filePath);
			}

			File file1 = new File(filePath);
			directoryPath = HaileeJohnyDesktopWallpaper.findFilePath(filePath);
			jLabe8.setText("File  Path  =   " + directoryPath);
			jLabe9.setText("Image Name  =   " + file1.getName());
			HaileeJohnyDesktopWallpaper.setWallpaper(filePath);

		}

		// ----------------------------------------------------------------------------

		if (sweetDreamTime)

		{
			Wallpaper wallpaper = null;
			PhotoManager wallpaperManager = new PhotoManager();

			List<Wallpaper> top10WallpaperList = wallpaperManager.findTop10Wallpaper();
			List<Wallpaper> wallpaperList = wallpaperManager.findAllPhoto();

			if (nightSweetTimeCounter==30) {

				filePath = "E:\\Hailee-Johny\\Hailee_Stienfeld_Johny_S\\Desktop\\Hailee7.PNG";
				wallpaper = wallpaperManager.findAllPhotoWithType(Constants.GOOD_NIGHT_TIME);
				filePath = wallpaper.getImageURL();
				top10WallpaperListStatus = Boolean.TRUE;
				wallpaperListStatus = Boolean.FALSE;
				nightWallpaperStatus = Boolean.FALSE;
				top10WallpaperIndex++;

			}

			if (nightSweetTimeCounter==60) {

				filePath = "E:\\Hailee-Johny\\Hailee_Stienfeld_Johny_S\\Desktop\\Hailee7.PNG";
				wallpaper = top10WallpaperList.get(top10WallpaperIndex);
				filePath = wallpaper.getImageURL();
				top10WallpaperListStatus = Boolean.FALSE;
				wallpaperListStatus = Boolean.TRUE;
				nightWallpaperStatus = Boolean.FALSE;
				index++;

			}

			if (wallpaperListStatus) {

				filePath = "E:\\Hailee-Johny\\Hailee_Stienfeld_Johny_S\\Desktop\\Hailee7.PNG";
				wallpaper = top10WallpaperList.get(index);
				filePath = wallpaper.getImageURL();
				top10WallpaperListStatus = Boolean.FALSE;
				wallpaperListStatus = Boolean.FALSE;
				nightWallpaperStatus = Boolean.FALSE;

			}

			if (top10WallpaperList != null && top10WallpaperList.size() == top10WallpaperIndex) {
				top10WallpaperIndex = 0;
			}

			if (wallpaperList != null && wallpaperList.size() == index) {
				index = 0;
			}
			System.out.println("Current Desktop Images :: " + filePath);
			File file1 = new File(filePath);
			directoryPath = HaileeJohnyDesktopWallpaper.findFilePath(filePath);
			jLabe8.setText("File  Path  =   " + directoryPath);
			jLabe9.setText("Image Name  =   " + file1.getName());
			HaileeJohnyDesktopWallpaper.setWallpaper(filePath);

		}

	}

	public static void setWallpaper(String filePath) {

		Advapi32Util.registrySetStringValue(WinReg.HKEY_CURRENT_USER, "Control Panel\\Desktop", "FitWallpaper",
				filePath);
		// WallpaperStyle = 10 (Fill), 6 (Fit), 2 (Stretch), 0 (Tile), 0 (Center)
		// For windows XP, change to 0
		int SPI_SETDESKWALLPAPER = 0x14;
		int SPIF_UPDATEINIFILE = 0x01;
		int SPIF_SENDWININICHANGE = 0x02;
		// User32.System
		boolean result = MyUser32.INSTANCE.SystemParametersInfoA(SPI_SETDESKWALLPAPER, 0, filePath,
				SPIF_UPDATEINIFILE | SPIF_SENDWININICHANGE);
	}

	public static String findFilePath(String filePath) {

		StringTokenizer stringTokenizer = new StringTokenizer(filePath, "\\");
		List<String> list = new ArrayList<String>();
		while (stringTokenizer.hasMoreTokens()) {

			String token = stringTokenizer.nextToken();
			list.add(token);

		}

		list.remove(list.size() - 1);
		StringJoiner path = new StringJoiner("\\");
		for (String token : list) {
			path.add(token);
		}

		return path.toString();

	}

	@Override
	public void actionPerformed(ActionEvent actionEvent) {

		jMenuItem = new JMenuItem("Set Break Fast Time Photo");
		jMenuItem.addActionListener(this);

		addPhoto.add(jMenuItem);
		jMenuItem = new JMenuItem("Set After Noon Food Break Time Photo");
		jMenuItem.addActionListener(this);
		addPhoto.add(jMenuItem);
		jMenuBar.add(addPhoto);
		jMenuItem = new JMenuItem("Set Snack  Break Time Photo");
		jMenuItem.addActionListener(this);
		addPhoto.add(jMenuItem);

		jMenuItem = new JMenuItem("Set Dinner Time Photo");
		jMenuItem.addActionListener(this);
		addPhoto.add(jMenuItem);
		jMenuBar.add(addPhoto);

		jMenuItem = new JMenuItem("Set Good Night Photo");
		jMenuItem.addActionListener(this);
		addPhoto.add(jMenuItem);
		jMenuBar.add(addPhoto);

		// addFolder = new JMenu("Add Wallpaper Folder");
		// jMenuItem = new JMenuItem("Add Wallpaper Folder");
		// jMenuItem.addActionListener(this);
		// jMenuBar.add(addFolder);

		addTop10Folder = new JMenu("Top 10 Wallpaper Folder");
		jMenuItem = new JMenuItem("Top 10 Wallpaper Folder");
		jMenuItem.addActionListener(this);
		jMenuBar.add(addTop10Folder);

		String action = null;
		JMenuItem jMenuItemText = (JMenuItem) actionEvent.getSource();
		String menuText = jMenuItemText.getText();

		if (menuText.equals("Set Break Fast Time Photo")) {

			action = "Set Break Fast Time Photo";

		}

		if (menuText.equals("Set After Noon Food Break Time Photo")) {

			action = "Set After Noon Food Break Time Photo";

		}
		if (menuText.equals("Set Snack  Break Time Photo")) {

			action = "Set Snack  Break Time Photo";

		}
		if (menuText.equals("Set Dinner Time Photo")) {

			action = "Set Dinner Time Photo";
		}

		if (menuText.equals("Set Good Night Time Photo")) {

			action = "Set Good Night Time Photo";

		}

		if (menuText.equals("Add Wallpaper Folder")) {

			action = "Add Wallpaper Folder";
		}

		System.out
				.println(menuText.equals("Top 10 Wallpaper Folder") + " " + menuText.equals("Top 10 Wallpaper Folder"));
		if (menuText.equals("Top 10 Wallpaper Folder")) {

			action = "Top 10 Wallpaper Folder";
		}

		DesktopSetting desktopSetting = new DesktopSetting(action);

	}

}

class MyCanvas extends Canvas {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;
	private String imageURL;

	public void paint(Graphics g) {

		Toolkit t = Toolkit.getDefaultToolkit();
		System.out.println("=== " + imageURL);
		Image i = t.getImage("E:\\Hailee-Johny\\Hailee_Stienfeld_Johny_S\\Desktop\\Hailee_Steinfeld_Johny_11.jpg");
		g.drawImage(i, 800, 200, this);

	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		System.out.println("=== " + imageURL);
		this.imageURL = imageURL;
	}

}
