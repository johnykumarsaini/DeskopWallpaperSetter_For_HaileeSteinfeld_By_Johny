package us.javaj.johny.hailee.desktop;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

enum WallpaperType {
	BREAKFASTTIME, AFTERNOONFOODBREAK, SNACKTIMEBREAK, DINNERTIME, INTERVALTIME
}

public class DesktopSetting extends JFrame implements ActionListener {

	List<ImageIcon> imageIconList;
	JLabel Jlabel;
	JButton back;
	JButton next;
	JButton breakFastTime;
	JButton afterNoonFoodBreak;
	JButton snackTimeBreak;
	JButton dinnerTimeBreak;
	JButton goodNightTimeBreak;
	JButton addFolder;
	JButton top10WallpaperFolder;
	JButton save;
	JList<String> jlist;
	JComboBox<String> defaultComboModel;
	JComboBox<String> defaultComboLabel;

	JLabel filePathWithName;
	JLabel fileName;

	JLabel timeLabel;

	Wallpaper wallpaper;
	int index, l1;
	public List<String> fileList;

	public DesktopSetting(String action) {

		this.fileList = fileList;
		setLayout(null);
		setSize(800, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		boolean folderTypeStatus=Boolean.FALSE;

		setName("Hailee Stienfeld Johny S");
		back = new JButton("<<");
		next = new JButton(">>");

		if (action.equals("Set Break Fast Time Photo")) {

			System.out.println(action);
			breakFastTime = new JButton("Select a  Break Fast Time Photo");
			breakFastTime.setBounds(250, 10, 250, 25);
			add(breakFastTime);
			breakFastTime.addActionListener(this);

		}

		if (action.equals("Set After Noon Food Break Time Photo")) {

			System.out.println(action);
			afterNoonFoodBreak = new JButton("Select a After Noon Food Break Time Photo");
			afterNoonFoodBreak.setBounds(250, 10, 250, 25);
			add(afterNoonFoodBreak);
			afterNoonFoodBreak.addActionListener(this);

		}

		if (action.equals("Set Snack  Break Time Photo")) {

			System.out.println(action);
			snackTimeBreak = new JButton("Set Snack  Break Time Photo");
			snackTimeBreak.setBounds(250, 10, 250, 25);
			add(snackTimeBreak);
			snackTimeBreak.addActionListener(this);

		}

		if (action.equals("Set Dinner Time Photo")) {

			System.out.println(action);
			dinnerTimeBreak = new JButton("Set Dinner Time Photo");
			dinnerTimeBreak.setBounds(250, 10, 250, 25);
			add(dinnerTimeBreak);
			dinnerTimeBreak.addActionListener(this);

		}

		if (action.equals("Set Good Night Time Photo")) {

			System.out.println(action);
			goodNightTimeBreak = new JButton("Set Good Night Time Photo");
			goodNightTimeBreak.setBounds(250, 10, 250, 25);
			add(goodNightTimeBreak);
			goodNightTimeBreak.addActionListener(this);

		}
		
		System.out.println(action.equals("Add Wallpaper Folder")+" = True");
		
		if (action.equals("Add Wallpaper Folder")) {

			System.out.println(action);
			addFolder = new JButton("Add Wallpaper Folder");
			addFolder.setBounds(250, 10, 250, 25);
			add(addFolder);
			addFolder.addActionListener(this);
			folderTypeStatus =Boolean.TRUE;

		}
		
		System.out.println(action.equals("Top 10 Wallpaper Folder"));
		if (action.equals("Top 10 Wallpaper Folder")) {

			System.out.println(action);
			top10WallpaperFolder = new JButton("Top 10 Wallpaper Folder");
			top10WallpaperFolder.setBounds(250, 10, 250, 25);
			add(top10WallpaperFolder);
			top10WallpaperFolder.addActionListener(this);
			folderTypeStatus =Boolean.TRUE;

		}

		filePathWithName = new JLabel();
		filePathWithName.setBounds(325, 50, 300, 25);
		fileName = new JLabel();
		fileName.setBounds(250, 50, 300, 25);
		add(fileName);
		add(filePathWithName);

		if(!folderTypeStatus) {
		timeLabel = new JLabel();
		timeLabel.setText(" Select Time Details of Wallpaper ");
		timeLabel.setBounds(250, 71, 300, 25);
		add(timeLabel);

		String[] time = WallpaperUtility.findWallpaperTime();
		defaultComboModel = new JComboBox<>(time);
		defaultComboModel.setBounds(225, 100, 300, 25);
		add(defaultComboModel);

		String[] timeLabel = WallpaperUtility.findWallpaperTimeLabel();
		defaultComboLabel = new JComboBox<>(timeLabel);
		defaultComboLabel.setBounds(225, 150, 300, 25);
		add(defaultComboLabel);
		
		}

		save = new JButton();
		save.setText("Save");
		save.setBounds(295, 210, 100, 21);
		add(save);
		save.addActionListener(this);

	
		//
		setSize(800, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

	public DesktopSetting() {

		this.fileList = fileList;
		setLayout(new BorderLayout());
		setSize(1200, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		JPanel jPanel = new JPanel(new FlowLayout());
		jPanel.setName("Hailee Stienfeld Johny S");

		breakFastTime = new JButton("Set Break Fast Time Photo");
		breakFastTime.setBounds(10, 10, 100, 50);
		afterNoonFoodBreak = new JButton("Set After Noon Food Break Time Photo");
		afterNoonFoodBreak.setBounds(10, 10, 100, 50);
		snackTimeBreak = new JButton("Set Snack  Break Time Photo");
		snackTimeBreak.setBounds(10, 10, 100, 50);
		dinnerTimeBreak = new JButton("Set Dinner Time Photo");
		dinnerTimeBreak.setBounds(10, 10, 100, 50);

		addFolder = new JButton("Add A Folder");
		addFolder.setBounds(10, 10, 200, 50);

		jPanel.add(addFolder);
		jPanel.add(breakFastTime);
		jPanel.add(afterNoonFoodBreak);
		jPanel.add(snackTimeBreak);
		jPanel.add(dinnerTimeBreak);
		add(jPanel);

		back.addActionListener(this);
		next.addActionListener(this);
		breakFastTime.addActionListener(this);
		afterNoonFoodBreak.addActionListener(this);
		snackTimeBreak.addActionListener(this);
		dinnerTimeBreak.addActionListener(this);
		addFolder.addActionListener(this);

		setSize(1200, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent actionEvent) {
		
		
		JFileChooser jFileChooser =null;

		if (actionEvent.getSource() == breakFastTime) {

			 jFileChooser = new JFileChooser();
			int i = jFileChooser.showOpenDialog(this);
			if (i == JFileChooser.APPROVE_OPTION) {
				File file = jFileChooser.getSelectedFile();
				String filepath = file.getPath();
				System.out.println("File path :: " + filepath);

				wallpaper = new Wallpaper();
				WallpaperType wallpaperType = WallpaperType.BREAKFASTTIME;
				wallpaper.setType(wallpaperType.BREAKFASTTIME.toString());
				wallpaper.setImageURL(filepath);
				filePathWithName.setText(filepath);
				fileName.setText("File Name ");
				// PhotoManager photoManager = new PhotoManager();
				// photoManager.addPhoto(wallpaper);

			}

		}

		if (actionEvent.getSource() == snackTimeBreak) {

			 jFileChooser = new JFileChooser();
			int i = jFileChooser.showOpenDialog(this);
			if (i == JFileChooser.APPROVE_OPTION) {
				File file = jFileChooser.getSelectedFile();
				String filepath = file.getPath();
				System.out.println("File path :: " + filepath);

				wallpaper = new Wallpaper();

				wallpaper.setType(Constants.SNACK_TIME);
				wallpaper.setImageURL(filepath);
				filePathWithName.setText(filepath);
				fileName.setText("File Name ");
				// PhotoManager photoManager = new PhotoManager();
				// photoManager.addPhoto(wallpaper);

			}

		}

		if (actionEvent.getSource() == afterNoonFoodBreak)

		{

			 jFileChooser = new JFileChooser();
			int index = jFileChooser.showOpenDialog(this);
			if (index == JFileChooser.APPROVE_OPTION) {
				File file = jFileChooser.getSelectedFile();
				String filepath = file.getPath();
				System.out.println("File path :: " + filepath);

				wallpaper = new Wallpaper();
				WallpaperType wallpaperType = WallpaperType.AFTERNOONFOODBREAK;
				wallpaper.setType(wallpaperType.AFTERNOONFOODBREAK.toString());

				wallpaper.setImageURL(filepath);
				filePathWithName.setText(filepath);
				fileName.setText("File Name ");

			}

		}

		if (actionEvent.getSource() == dinnerTimeBreak)

		{

			 jFileChooser = new JFileChooser();
			int index = jFileChooser.showOpenDialog(this);
			if (index == JFileChooser.APPROVE_OPTION) {
				File file = jFileChooser.getSelectedFile();
				String filepath = file.getPath();
				System.out.println("File path :: " + filepath);

				wallpaper = new Wallpaper();

				wallpaper.setType(Constants.DINNER_TIME);

				wallpaper.setImageURL(filepath);
				filePathWithName.setText(filepath);
				fileName.setText("File Name ");

			}

		}

		if (actionEvent.getSource() == goodNightTimeBreak)

		{

			 jFileChooser = new JFileChooser();
			int index = jFileChooser.showOpenDialog(this);
			if (index == JFileChooser.APPROVE_OPTION) {
				File file = jFileChooser.getSelectedFile();
				String filepath = file.getPath();
				System.out.println("File path :: " + filepath);

				wallpaper = new Wallpaper();

				wallpaper.setType(Constants.GOOD_NIGHT_TIME);

				wallpaper.setImageURL(filepath);
				filePathWithName.setText(filepath);
				fileName.setText("File Name ");

			}

		}
		
		if (actionEvent.getSource() == addFolder) {

			 jFileChooser = new JFileChooser();
			int i = jFileChooser.showOpenDialog(this);
			if (i == JFileChooser.APPROVE_OPTION) {
				File file = jFileChooser.getSelectedFile();
				String filepath = file.getPath();
				System.out.println("File path :: " + filepath);
				File fileDirtory = jFileChooser.getCurrentDirectory();

				if (fileDirtory.isDirectory()) {

					String fileDirtoryPath = fileDirtory.getPath();
					PhotoManager photoManager = new PhotoManager();
					photoManager.saveFileDirectory(fileDirtoryPath);

					 JOptionPane.showMessageDialog(null, "Wallpaper Folder Added Succussfully .");
					 this.dispose();

				}

				// PhotoManager photoManager = new PhotoManager();
				// photoManager.saveFileDirectory(fileDirtoryPath);
				// .addAllPhoto(timeStampList);

			}

		}
		
		
		if (actionEvent.getSource() == top10WallpaperFolder) {

			 jFileChooser = new JFileChooser();
			int i = jFileChooser.showOpenDialog(this);
			if (i == JFileChooser.APPROVE_OPTION) {
				File file = jFileChooser.getSelectedFile();
				String filepath = file.getPath();
				System.out.println("File path :: " + filepath);
				File fileDirtory = jFileChooser.getCurrentDirectory();

				if (fileDirtory.isDirectory()) {

					String fileDirtoryPath = fileDirtory.getPath();
					
					Wallpaper wallpaper =null;
					 List<String> fileList = Arrays.asList(fileDirtory.list());
					
					 List<Wallpaper> top10WallpaperList = new ArrayList<>();
					
					 for (int index = 0; index < fileList.size(); index++) {
					
						 wallpaper = new Wallpaper();
					 wallpaper.setImageURL(fileDirtoryPath+"//"+fileList.get(index));
					 wallpaper.setType("Top 10 Wallpaper");
					 top10WallpaperList.add(wallpaper);
					 

				}
					 
					 PhotoManager photoManager = new PhotoManager();
					 photoManager.saveTop10Wallpaper(top10WallpaperList);
					 
					 JOptionPane.showMessageDialog(null, "Top 10 Wallpaper Added Succussfully .");
					 
					 this.dispose();

				// PhotoManager photoManager = new PhotoManager();
				// photoManager.saveFileDirectory(fileDirtoryPath);
				// .addAllPhoto(timeStampList);

			}

		}

		if (actionEvent.getSource() == save) {

			System.out.println(filePathWithName.getText().equals(""));

			System.out.println(filePathWithName.getText());
			System.out.println(filePathWithName.getText().length());
			System.out.println(jlist);

			if (filePathWithName.getText().equals("") || filePathWithName == null) {

				System.out.println("No File Seleted ");
				JOptionPane.showMessageDialog(getParent(), "Please Select a File");

			}

			if (defaultComboModel.getSelectedItem().toString().equals("") || jlist == null) {
				System.out.println("Time not  Seleted ");
				JOptionPane.showMessageDialog(getParent(), "Please Select a Time");
				
				this.dispose();

			}

			String[] timeToken = defaultComboModel.getSelectedItem().toString().split("-");

			PhotoManager photoManager = new PhotoManager();

			String timeType = defaultComboLabel.getSelectedItem().toString();

			if ("Break Fast Time".equals(timeType)) {

				wallpaper.setType(WallpaperType.BREAKFASTTIME.toString());

			}

			if ("Launch Time".equals(timeType)) {

				wallpaper.setType("AFTERNOONFOODBREAK");

			}

			if ("Snack Time".equals(timeType)) {

				wallpaper.setType(Constants.SNACK_TIME);

			}
			
			if ("Dinner Time".equals(timeType)) {

				wallpaper.setType(Constants.DINNER_TIME);

			}
			
			
			if ("Good Night Time".equals(timeType)) {

				wallpaper.setType(Constants.GOOD_NIGHT_TIME);

			}

			try {
				photoManager.addPhoto(wallpaper);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(wallpaper);

			JOptionPane.showMessageDialog(getParent(), "Save Succussfully ");

		}

		if (actionEvent.getSource() == snackTimeBreak) {

			 jFileChooser = new JFileChooser();
			int index = jFileChooser.showOpenDialog(this);
			if (index == JFileChooser.APPROVE_OPTION) {
				File file = jFileChooser.getSelectedFile();
				String filepath = file.getPath();
				System.out.println("File path :: " + filepath);

				Wallpaper wallpaper = new Wallpaper();
				WallpaperType wallpaperType = WallpaperType.SNACKTIMEBREAK;
				wallpaper.setType(wallpaperType.SNACKTIMEBREAK.toString());
				wallpaper.setStartTime("8:15-PM");
				wallpaper.setEndTime("8:45-PM");
				wallpaper.setImageURL(filepath);
				PhotoManager photoManager = new PhotoManager();
				try {
					photoManager.addPhoto(wallpaper);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}

		if (actionEvent.getSource() == dinnerTimeBreak) {

			 jFileChooser = new JFileChooser();
			int index = jFileChooser.showOpenDialog(this);
			if (index == JFileChooser.APPROVE_OPTION) {
				File file = jFileChooser.getSelectedFile();
				String filepath = file.getPath();
				System.out.println("File path :: " + filepath);

				Wallpaper wallpaper = new Wallpaper();
				WallpaperType wallpaperType = WallpaperType.BREAKFASTTIME;
				wallpaper.setType(wallpaperType.BREAKFASTTIME.toString());
				wallpaper.setStartTime("8:15-PM");
				wallpaper.setEndTime("8:45-PM");
				wallpaper.setImageURL(filepath);
				PhotoManager photoManager = new PhotoManager();
				try {
					photoManager.addPhoto(wallpaper);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}
		}

		

	}

	public static void main(String[] args) {

		DesktopSetting desktopSetting = new DesktopSetting("Set Break Fast Time Photo");

	}
}
