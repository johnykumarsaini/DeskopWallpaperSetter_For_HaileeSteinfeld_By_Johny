package us.javaj.johny.hailee.desktop;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyImage // extends Canvas

{

	public MyImage() {
		JFrame f = new JFrame();
		//f.add(this);
		f.setSize(400, 400);
		//f.setVisible(true);
	}

	// public void paint(Graphics g) {
	//
	// Toolkit toolkit=Toolkit.getDefaultToolkit();
	// Image
	// image=toolkit.getImage("E:\\Hailee-Johny\\Hailee_Stienfeld_Johny_S\\Desktop\\Hailee_Steinfeld_Johny_11.jpg");
	// g.drawImage(image, 10,10,this);
	//
	// }
	public static void main(String[] args) {
		MyImage m = new MyImage();
		JFrame f = new JFrame();

		JPanel imagePanel = new JPanel() {
			@Override
			public void paint(java.awt.Graphics g) {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				Image image = toolkit.getImage("E:\\Hailee-Johny\\Hailee_Stienfeld_Johny_S\\Desktop\\HaileeStienfeldJohny11.jpg");
				g.drawImage(image, 10, 10, this);
				//g.drawImage(image, 0, 0, 100, 100, 0, 0, 100, 100,null);
			};
		};

		f.add(imagePanel);
		f.setSize(1080, 1334);
		f.setVisible(true);
		
		
	}

}