package us.javaj.johny.hailee.desktop;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.io.Closeable;
import java.io.Console;
import java.time.Clock;
import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class TimeClock {
	
	public static void main(String[] args) {
		
		
		Clock clock = null;
		
		 
		JFrame jFrame = new JFrame("Hailee");
		
		jFrame.setSize(700, 500);
		jFrame.setVisible(Boolean.TRUE);
        jFrame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		
        JLabel jLabel = new JLabel();
        jLabel.setText("Hailee");
        jLabel.setBounds(10, 10, 10, 10);
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout());
       
        jPanel.add(jLabel);
        
        JLabel jLabelTime = new JLabel();
    	jLabelTime.setText(" Time Remaining To Change Desktop Wallpaper  : ");
		jLabelTime.setBounds(30, 120, 300, 110);
        
		
		jPanel.add(jLabelTime);
		//jFrame.add(jLabelTime);
        //jFrame.add(jLabel);
        
       //jFrame.add(jPanel);
        
     
		
		final Timer timer = new Timer();

		TimerTask task = new TimerTask() {
   
			int second = 60;
			int minute = 30;
		    JLabel jLabelSecond = new JLabel();
		 
		    
		    
			
			@Override
			public void run() {

				if(second==1) {
					
					minute--;
					second=0;
					
				}
				
				second--;
				
				String timeMinute = Integer.toString(minute);
				
			
		        //jPanel.add(jLabelTime);
		        
		        //jLabelSecond.setText(Integer.toString(second));
		        jLabelSecond.setBounds(310, 100, 100, 100);
		        String timeSecond = Integer.toString(second);
		        String time = timeMinute+" : "+timeSecond;
		        jLabelSecond.setText(time);
		       
		       
		        //jFrame.add(jLabelSecond);
		        jPanel.add(jLabelSecond);
				jFrame.add(jPanel);
				System.out.println(minute+":"+second);
				
				Console console = System.console();
				
				

			}
		};
		System.out.println("Timer :: ");
		int scheduleTime = 3000;// 30 mintute
		timer.schedule(task, 0, scheduleTime);

	}
		
	}


