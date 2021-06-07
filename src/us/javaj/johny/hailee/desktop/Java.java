package us.javaj.johny.hailee.desktop;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.StringTokenizer;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Java extends JFrame implements ActionListener {

	ImageIcon s[];
	JLabel l;
	JButton b1, b2;
	int i, l1;
	JPanel p;
	public List<String> fileList;

	public Java(List<String> fileList ) {
		this.fileList=fileList;
		setLayout(new BorderLayout());
		setSize(800, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		JPanel p = new JPanel(new FlowLayout());
		b1 = new JButton("<<");
		b2 = new JButton(">>");
		p.add(b1);
		p.add(b2);
		add(p, BorderLayout.SOUTH);
		b1.addActionListener(this);
		b2.addActionListener(this);
		s = new ImageIcon[2];
		s[0] = new ImageIcon(fileList.get(0));
		s[1] = new ImageIcon(fileList.get(1));
		l = new JLabel("", JLabel.CENTER);
		add(l, BorderLayout.CENTER);
		l.setIcon(s[0]);

	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == b1) {
			if (i == 0) {
				JOptionPane.showMessageDialog(null, "This is First Image");
			} else {
				i = i - 1;
				s[i] = new ImageIcon(fileList.get(i));
				l.setIcon(s[i]);
			}
		}
		if (e.getSource() == b2) {
			if (i == s.length - 1) {
				JOptionPane.showMessageDialog(null, "This is LastImage");
			} else {
				i = i + 1;
				s[i] = s[i] = new ImageIcon(fileList.get(i));
				l.setIcon(s[i]);
			}
		}

	}

	public static void main(String[] args) throws Exception {

		File file = new File("E:\\Hailee-Johny\\Hailee_Stienfeld_Johny_S\\Desktop");

		List<String> fileList = new ArrayList<>();

		if (file.isDirectory()) {

			Arrays.asList(file.list()).forEach(fileName -> fileList.add(file.getPath() + "\\" + fileName));

		}
		Java obj = new Java(fileList);
		fileList.forEach(System.out::println);
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

}
