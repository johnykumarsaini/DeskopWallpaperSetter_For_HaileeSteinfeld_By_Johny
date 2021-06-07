package us.javaj.johny.hailee.desktop;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class PhotoSlider extends JFrame implements ActionListener {

	List<ImageIcon> imageIconList;
	JLabel Jlabel;
	JButton back;
	JButton  next;
	int index, l1;
	
	public List<String> fileList;

	public PhotoSlider(List<String> fileList) {
		this.fileList = fileList;
		setLayout(new BorderLayout());
		setSize(1200, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		JPanel jPanel = new JPanel(new FlowLayout());
		jPanel.setName("Hailee Stienfeld Johny S");
		back = new JButton("<<");
		next = new JButton(">>");
		
		jPanel.add(back);
		jPanel.add(next);
		add(jPanel,BorderLayout.SOUTH);
		back.addActionListener(this);
		next.addActionListener(this);
		imageIconList = new ArrayList<>(fileList.size());
		imageIconList.add(new ImageIcon(fileList.get(0)));
		imageIconList.add(new ImageIcon(fileList.get(1)));
		Jlabel = new JLabel("", JLabel.CENTER);
		Jlabel.setIcon(new ImageIcon(fileList.get(0)));
		add(Jlabel, BorderLayout.CENTER);
		
		setSize(1200, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

	public PhotoSlider() {

	}

	@Override
	public void actionPerformed(ActionEvent actionEvent) {
		
		
		
		if(actionEvent.getSource()==next) {
			
			if(index<fileList.size()) {
			ImageIcon imageIcon = new ImageIcon(fileList.get(index));
			Jlabel.setIcon(imageIcon);
			index = index + 1;
			}else {
				
				System.out.println("No File End");
			}
			
		}
		
      
		if(actionEvent.getSource()==back) {
			
			if(index>=0) {
			index = index -1;
			ImageIcon imageIcon = new ImageIcon(fileList.get(index));
			Jlabel.setIcon(imageIcon);
			}
			else {
				
				System.out.println("No File First");
			}
			
			
		}

	}
	
	public static void main(String[] args) {
		
		
		
		File file = new File("E:\\Hailee-Johny\\Hailee_Stienfeld_Johny_S\\Desktop");

		List<String> fileList = new ArrayList<>();

		if (file.isDirectory()) {

			Arrays.asList(file.list()).forEach(fileName -> fileList.add(file.getPath() + "\\" + fileName));

		}
		
		PhotoSlider  photoSlider = new  PhotoSlider(fileList);
		
	}

}
