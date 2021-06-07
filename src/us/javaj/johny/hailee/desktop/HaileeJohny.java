package us.javaj.johny.hailee.desktop;

import java.awt.Canvas;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ActionMap;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import com.sun.jna.Native;
import com.sun.jna.platform.win32.Advapi32Util;
import com.sun.jna.platform.win32.WinReg;
import com.sun.jna.win32.StdCallLibrary;

public class HaileeJohny extends JFrame {

	JLabel jLabel = new JLabel();
	final List<String> fileList=null;

	public HaileeJohny() {

		setName("Hailee Stienfeld Johny S");
		setSize(1000, 1200);
		setVisible(Boolean.TRUE);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLayout(null);
		setContentPane(new JLabel(new ImageIcon("E:\\Hailee-Johny\\Hailee_Stienfeld_Johny_S\\Hailee-Love-11.jpg")));

		jLabel.setFont(new Font(Font.DIALOG, Font.BOLD, 17));
		jLabel.setText("Hailee Stienfeld Johny S");
		jLabel.setBounds(300, 10, 300, 21);
		add(jLabel);
		
       
		
		

	}

	public static void main(String[] args) throws IOException {

		HaileeJohny jFrame = new HaileeJohny();

		// jPanel.setSize(200, 200);

		// JLabel jLabelTime = new JLabel();
		// jLabelTime.setText(" Time Remaining To Change Desktop Wallpaper : ");
		// // jLabelTime.setBounds(30, 120, 300, 110);
		// // jFrame.add(jLabelTime);
		// // jFrame.add(jLabelTime);
		// // jFrame.add(jLabel);
		// // jFrame.add(jPanel);
		//
		// final Timer timer1 = new Timer();
		//
		// TimerTask task = new TimerTask() {
		//
		// int second = 60;
		// int minute = 30;
		// JLabel jLabelSecond = new JLabel();
		//
		// @Override
		// public void run() {
		//
		// if (second == 1) {
		//
		// minute--;
		// second = 0;
		//
		// }
		//
		// second--;
		//
		// String timeMinute = Integer.toString(minute);
		//
		// // jPanel.add(jLabelTime);
		//
		// // jLabelSecond.setText(Integer.toString(second));
		// // jLabelSecond.setBounds(310, 100, 100, 100);
		// String timeSecond = Integer.toString(second);
		// String time = timeMinute + " : " + timeSecond;
		// jLabelSecond.setText(time);
		//
		// // jFrame.add(jLabelSecond);
		// // jPanel.add(jLabelSecond);
		// // jFrame.add(jPanel);
		// System.out.println(minute + ":" + second);
		//
		// Console console = System.console();
		//
		// }
		// };
		// System.out.println("Timer :: ");
		// int scheduleTime = 3000;// 30 mintute
		// // timer.schedule(task, 0, scheduleTime);
		//
		final Timer timer = new Timer();

		TimerTask changeDeskTop = new TimerTask() {

			@Override
			public void run() {

				HaileeJohny.changeDesktopWallpaper(jFrame);

			}
		};
		System.out.println("Timer :: ");
		int scheduleTime1 = 1800000;// 30 mintute
		timer.schedule(changeDeskTop, 0, scheduleTime1);

	}

	private interface MyUser32 extends StdCallLibrary {

		MyUser32 INSTANCE = (MyUser32) Native.loadLibrary("user32", MyUser32.class);

		boolean SystemParametersInfoA(int uiAction, int uiParam, String fnm, int fWinIni);
	}

	public static void changeDesktopWallpaper(JFrame jFrame) {

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

		JLabel imageLabel = new JLabel(new ImageIcon("E:\\Hailee-Johny\\Hailee_Stienfeld_Johny_S\\Hailee11.jpg"));

		imageLabel.setBounds(800, 800, 400, 400);

		jFrame.add(imageLabel);

		JPanel imagePanel = new JPanel() {

			public void paint(java.awt.Graphics g) {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				Image image = toolkit.getImage("E:\\Hailee-Johny\\Hailee_Stienfeld_Johny_S\\Desktop\\Hailee11.jpg");
				g.drawImage(image, 10, 10, this);
				// g.drawImage(image, 0, 0, 100, 100, 0, 0, 100, 100,null);
			};
		};

		imagePanel.setBounds(800, 800, 400, 400);
		jFrame.add(imagePanel);

		Date date1 = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat();
		String date11 = dateFormat.format(date1);
		String timeType = date11.substring(date11.length() - 2, date11.length());
		String[] token = date11.split(" ");
		String timeToken = token[1];
		System.out.println("Time Token :: " + timeToken);
		String timeToken11 = "Time Token   " + timeToken;

		// JLabel jLabel3 = new JLabel();
		// jLabel3.setText("Time Token ");
		// jLabel3.setBounds(100, 70, 500, 20);
		// jFrame.add(jLabel3);

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

		if ((timeNumber <= 7 || timeNumber >= 12) && "AM".equalsIgnoreCase(timeType)
				|| timeNumber >= 11 && "PM".equalsIgnoreCase(timeType)) {

			System.out.println("Sweet Dream Time :: ");
			jLabel6.setText("Sweet Dream Time :: ");

			// jFrame.add(jLabel6);
			sweetDreamTime = Boolean.TRUE;
		}

		System.out.println("Time Type :: " + timeType);

		jLabel7.setText("Time Type :: " + timeType);

		// jFrame.add(jLabel7);

		if ("AM".equalsIgnoreCase(timeType)) {

			File file = null;
			switch (timeNumber) {
			case 8:
				filePath = "E:\\Hailee-Johny\\Hailee_Stienfeld_Johny_S\\Desktop\\Hailee.jpg";
				System.out.println("Current Desktop Images :: " + filePath);
				file = new File(filePath);
				directoryPath = HaileeJohny.findFilePath(filePath);
				jLabe8.setText("File  Path  =   " + directoryPath);
				jLabe9.setText("Image Name  =   " + file.getName());
				// setImage(jFrame);
				HaileeJohny.setWallpaper(filePath);
				break;

			case 9:
				filePath = "E:\\Hailee-Johny\\Hailee_Stienfeld_Johny_S\\Desktop\\Hailee10.PNG";
				System.out.println("Current Desktop Images :: " + filePath);
				file = new File(filePath);
				directoryPath = HaileeJohny.findFilePath(filePath);
				jLabe8.setText("File  Path  =   " + directoryPath);
				jLabe9.setText("Image Name  =   " + file.getName());
				HaileeJohny.setWallpaper(filePath);
				break;

			case 10:
				if (timeNumber2 > 31) {

					filePath = "E:\\Hailee-Johny\\Hailee_Stienfeld_Johny_S\\Desktop\\Hailee_ Stienfeld_Johny_Saini 11.jpg";
					System.out.println("Current Desktop Images :: " + filePath);
					file = new File(filePath);
					directoryPath = HaileeJohny.findFilePath(filePath);
					jLabe8.setText("File  Path  =   " + directoryPath);
					jLabe9.setText("Image Name  =   " + file.getName());
					HaileeJohny.setWallpaper(filePath);

				} else {
					filePath = "E:\\Hailee-Johny\\Hailee_Stienfeld_Johny_S\\Desktop\\Hailee.jpg";
					System.out.println("Current Desktop Images :: " + filePath);
					file = new File(filePath);
					directoryPath = HaileeJohny.findFilePath(filePath);
					jLabe8.setText("File  Path  =   " + directoryPath);
					jLabe9.setText("Image Name  =   " + file.getName());
					HaileeJohny.setWallpaper(filePath);
				}
				break;

			case 11:

				if (timeNumber2 > 31) {
					filePath = "E:\\Hailee-Johny\\Hailee_Stienfeld_Johny_S\\Desktop\\HaileeStienfeldJohnyS11.jpg";
					System.out.println("Current Desktop Images :: " + filePath);
					file = new File(filePath);
					directoryPath = HaileeJohny.findFilePath(filePath);
					jLabe8.setText("File  Path  =   " + directoryPath);
					jLabe9.setText("Image Name  =   " + file.getName());
					HaileeJohny.setWallpaper(filePath);

				} else {

					filePath = "E:\\Hailee-Johny\\Hailee_Stienfeld_Johny_S\\Desktop\\Hailee.jpg";
					System.out.println("Current Desktop Images :: " + filePath);
					file = new File(filePath);
					directoryPath = HaileeJohny.findFilePath(filePath);
					jLabe8.setText("File  Path  =   " + directoryPath);
					jLabe9.setText("Image Name  =   " + file.getName());
					HaileeJohny.setWallpaper(filePath);

				}

				break;

			default:

				System.out.println("No Photo On time ::  " + timeNumber + "" + timeType);
				break;
			}

		}

		else {

			File file = null;

			if (timeNumber <= 2 && "PM".equalsIgnoreCase(timeType)) {

				System.out.println("Hailee 11 ");
				filePath = "E:\\Hailee-Johny\\Hailee_Stienfeld_Johny_S\\Desktop\\Hailee11.jpg";
				System.out.println("Current Desktop Images :: " + filePath);
				file = new File(filePath);
				directoryPath = HaileeJohny.findFilePath(filePath);
				jLabe8.setText("File  Path  =   " + directoryPath);
				jLabe9.setText("Image Name  =   " + file.getName());
				HaileeJohny.setWallpaper(filePath);

			}

			if (timeNumber >= 2 && timeNumber <= 7 && "PM".equalsIgnoreCase(timeType)) {
				// System.out.println("timeNumber>=2 && timeNumber<=7 && \"PM\"");

				if (timeNumber2 <= 31) {

					filePath = "E:\\Hailee-Johny\\Hailee_Stienfeld_Johny_S\\Desktop\\JohnySHaileeStienfeld11.PNG";
					System.out.println("Current Desktop Images :: " + filePath);
					HaileeJohny.setWallpaper(filePath);
					file = new File(filePath);
					directoryPath = HaileeJohny.findFilePath(filePath);
					jLabe8.setText("File  Path  =   " + directoryPath);
					jLabe9.setText("Image Name  =   " + file.getName());

				} else {

					switch (timeNumber) {
					case 2:

						filePath = "E:\\Hailee-Johny\\Hailee_Stienfeld_Johny_S\\Desktop\\Hailee2.jpg";
						System.out.println("Current Desktop Images :: " + filePath);
						file = new File(filePath);
						directoryPath = HaileeJohny.findFilePath(filePath);
						jLabe8.setText("File  Path  =   " + directoryPath);
						jLabe9.setText("Image Name  =   " + file.getName());
						HaileeJohny.setWallpaper(filePath);

						break;

					case 3:

						filePath = "E:\\Hailee-Johny\\Hailee_Stienfeld_Johny_S\\Desktop\\Hailee1.jpg";
						System.out.println("Current Desktop Images :: " + filePath);
						file = new File(filePath);
						directoryPath = HaileeJohny.findFilePath(filePath);
						jLabe8.setText("File  Path  =   " + directoryPath);
						jLabe9.setText("Image Name  =   " + file.getName());
						HaileeJohny.setWallpaper(filePath);

						break;

					case 4:

						filePath = "E:\\Hailee-Johny\\Hailee_Stienfeld_Johny_S\\Desktop\\Hailee3.jpg";
						System.out.println("Current Desktop Images :: " + filePath);
						file = new File(filePath);
						directoryPath = HaileeJohny.findFilePath(filePath);
						jLabe8.setText("File  Path  =   " + directoryPath);
						jLabe9.setText("Image Name  =   " + file.getName());
						HaileeJohny.setWallpaper(filePath);
						break;

					case 5:

						filePath = "E:\\Hailee-Johny\\Hailee_Stienfeld_Johny_S\\Desktop\\Hailee10.PNG";
						System.out.println("Current Desktop Images :: " + filePath);
						file = new File(filePath);
						directoryPath = HaileeJohny.findFilePath(filePath);
						jLabe8.setText("File  Path  =   " + directoryPath);
						jLabe9.setText("Image Name  =   " + file.getName());
						HaileeJohny.setWallpaper(filePath);
						break;

					case 6:

						filePath = "E:\\Hailee-Johny\\Hailee_Stienfeld_Johny_S\\Desktop\\Hailee4.PNG";
						System.out.println("Current Desktop Images :: " + filePath);
						file = new File(filePath);
						directoryPath = HaileeJohny.findFilePath(filePath);
						jLabe8.setText("File  Path  =   " + directoryPath);
						jLabe9.setText("Image Name  =   " + file.getName());
						HaileeJohny.setWallpaper(filePath);
						break;

					case 7:

						filePath = "E:\\Hailee-Johny\\Hailee_Stienfeld_Johny_S\\Desktop\\Johny-Hailee.jpg";
						System.out.println("Current Desktop Images :: " + filePath);
						file = new File(filePath);
						directoryPath = HaileeJohny.findFilePath(filePath);
						jLabe8.setText("File  Path  =   " + directoryPath);
						jLabe9.setText("Image Name  =   " + file.getName());
						HaileeJohny.setWallpaper(filePath);
						break;

					default:
						System.out.println("No Photo On time ::  " + timeNumber + "" + timeType);
						break;
					}
				}

			}

			if (timeNumber >= 8 && timeNumber <= 10 && "PM".equalsIgnoreCase(timeType)) {

				filePath = "E:\\Hailee-Johny\\Hailee_Stienfeld_Johny_S\\Desktop\\Hailee710.PNG";
				System.out.println("Current Desktop Images :: " + filePath);
				file = new File(filePath);
				directoryPath = HaileeJohny.findFilePath(filePath);
				jLabe8.setText("File  Path  =   " + directoryPath);
				jLabe9.setText("Image Name  =   " + file.getName());
				HaileeJohny.setWallpaper(filePath);

			}

		}

		if (sweetDreamTime) {

			filePath = "E:\\Hailee-Johny\\Hailee_Stienfeld_Johny_S\\Desktop\\Hailee7.PNG";
			System.out.println("Current Desktop Images :: " + filePath);
			File file = new File(filePath);
			directoryPath = HaileeJohny.findFilePath(filePath);
			jLabe8.setText("File  Path  =   " + directoryPath);
			jLabe9.setText("Image Name  =   " + file.getName());
			HaileeJohny.setWallpaper(filePath);

		}

		if (timeNumber >= 10 && timeNumber <= 11 && "PM".equalsIgnoreCase(timeType)) {

			filePath = "E:\\Hailee-Johny\\Hailee_Stienfeld_Johny_S\\Desktop\\Hailee_Steinfeld_Johny_11.jpg";
			System.out.println("Current Desktop Images :: " + filePath);
			File file = new File(filePath);
			directoryPath = HaileeJohny.findFilePath(filePath);
			jLabe8.setText("File  Path  =   " + directoryPath);
			jLabe9.setText("Image Name  =   " + file.getName());
			HaileeJohny.setWallpaper(filePath);

		}

		// setImage(jFrame,filePath);

		// JPanel imagePanel = new JPanel() {
		// @Override
		// public void paint(java.awt.Graphics g) {
		// Toolkit toolkit = Toolkit.getDefaultToolkit();
		// Image image =
		// toolkit.getImage("E:\\Hailee-Johny\\Hailee_Stienfeld_Johny_S\\Desktop\\Hailee.jpg");
		// g.drawImage(image, 10, 10, this);
		// // g.drawImage(image, 0, 0, 100, 100, 0, 0, 100, 100,null);
		// };
		// };

		System.out.println("Image Label Set Succussfully ");
		// jFrame.add(imagePanel);

		//
		jFrame.setSize(1000, 1200);

		final String currentImagePath = filePath;

		jButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				JFrame jFrame = new JFrame();
				jFrame.setName("Hailee Stienfeld Johny S");

				jFrame.setVisible(Boolean.TRUE);
				jFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
				jFrame.setLayout(null);
				jFrame.setResizable(Boolean.TRUE);

				Toolkit toolkit = Toolkit.getDefaultToolkit();

				ImageIcon imageIcon = new ImageIcon(currentImagePath);
				Image image = toolkit.getImage(currentImagePath);

				int width = imageIcon.getIconWidth();
				int hight = imageIcon.getIconHeight();

				System.out.println("width " + width);

				JPanel imagePanel = new JPanel() {
					@Override
					public void paint(java.awt.Graphics g) {

						g.drawImage(image, 0, 0, this);

					};
				};
				imagePanel.setBounds(21, 21, 1000, 1000);

				jFrame.add(imagePanel);

				jFrame.setSize(width + 50, hight + 90);

			}
		});

		jButton1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				File file = new File("E:\\Hailee-Johny\\Hailee_Stienfeld_Johny_S\\Desktop");
				
				final List<String> fileList1 = new ArrayList<>();
				
				if(file.isDirectory()) {
					
					Arrays.asList(file.list()).forEach(fileName->fileList1.add(file.getPath()+"\\"+fileName));
					
				}
				
				
				PhotoSlider photoSlider = new PhotoSlider(fileList1);
				
			}
		});
			

				
					
				
				
				

//				imagePanel.setBounds(165, 21, 1000, 1200);
//               jFrame.add(imagePanel);
//               
//               
//               jFrame.setSize(1800, 1800);
//
//			}
//		});

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

	// public static void setImage(JFrame jFrame, String filePath) {
	//
	// JPanel imagePanel = new JPanel() {
	//
	// @Override
	// public void paint(java.awt.Graphics g) {
	// Toolkit toolkit = Toolkit.getDefaultToolkit();
	// Image image = toolkit
	// .getImage("E:\\Hailee-Johny\\Hailee_Stienfeld_Johny_S\\Desktop\\Hailee_Steinfeld_Johny_11.jpg");
	// image = toolkit.getImage(filePath);
	//
	// g.drawImage(image, 10, 10, this);
	// // g.drawImage(image, 0, 0, 100, 100, 0, 0, 100, 100,null);
	// };
	// };
	//
	// imagePanel.setBounds(21, 200, 1000, 700);
	//
	// jFrame.add(imagePanel);

	// }

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
