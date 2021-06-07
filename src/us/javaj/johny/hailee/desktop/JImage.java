package us.javaj.johny.hailee.desktop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import us.johny.hailee.HaileeJohnyDesktopWallpaper;

public class JImage {

	public JImage() {

	}

	public static void main(String[] args) {

		final Timer timer = new Timer();

		TimerTask changeDeskTop = new TimerTask() {
			
			int index = 0;
			int top10WallpaperIndex = 0;


			@Override
			public void run() {

				top10WallpaperIndex++;
				index++;
				System.out.println("Index :: " + index);
				System.out.println("Top 10 Wallpaper Index :: " + top10WallpaperIndex);

			}

		};
		System.out.println("Timer :: ");
		int scheduleTime1 = 1800000;// 30 mintute
		scheduleTime1 = 20 * 1000;
		timer.schedule(changeDeskTop, 0, scheduleTime1);
		
		
		Date date1 = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat();
		String date11 = dateFormat.format(date1);
		String timeType = date11.substring(date11.length() - 2, date11.length());
		String[] token = date11.split(" ");
		String timeToken = token[1];
		System.out.println("Time Token :: " + timeToken);
		String timeToken11 = "Time Token   " + timeToken;

	
		// jFrame.add(jLabel3);

		String[] token1 = timeToken.split(":");

		String timeToken1 = token1[0];

		int timeNumber = Integer.parseInt(timeToken1);

		String timeToken2 = token1[1];

		int timeNumber2 = Integer.parseInt(timeToken2);

		System.out.println("Time Number  In Minute :: " + timeToken2);


		System.out.println(timeToken1);
		System.out.println("Time Number In Hour :: " + timeToken1);

	


		int time = 60;

		int timeDivisar = 2;

		System.out.println(time / timeDivisar);

		int time1 = 12;
		int time2 = 11;

		PhotoManager wallpaperManager = new PhotoManager();
		Wallpaper wallpaper = wallpaperManager.findAllPhotoWithType(Constants.GOOD_NIGHT_TIME);
		List<Wallpaper> top10WallpaperList = wallpaperManager.findTop10Wallpaper();
		List<Wallpaper> wallpaperList = wallpaperManager.findAllPhoto();

		// 2 ---- 1
		// 4----- 2
		// 6----- 3
		// 8------4
		// 10---- 5

	}
}