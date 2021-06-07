package us.javaj.johny.hailee.desktop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class WallPaperWithTimeInterval {
	
	
	public List<Wallpaper> findWallPapeListrWithTimeInterval(int timeInterval) {
		
		String timeStamp1 = "";
		String timeStamp2 = "";

		int initialTime = 00;
		//int timeInterval = 30;

		int indexEnd = 60 / timeInterval;

		List<Wallpaper> timeStampList = new ArrayList<Wallpaper>();

		List<String> timeStampList1 = new ArrayList<String>();

		for (int index = 1; index < 12; index++) {

			for (int time = 1; time <= indexEnd; time++) {

				timeStamp1 = timeStamp1 + index + ":" + initialTime + "-PM";
				timeStamp2 = timeStamp2 + index + ":" + initialTime + "-PM";
				// System.out.println(time);

				System.out.println(timeStamp1);
				timeStampList1.add(timeStamp1);
				timeStamp1 = "";

				if (time == indexEnd) {
					// System.out.println(time==indexEnd);
					timeStamp1 = timeStamp1 + (index + 1) + ":" + 00 + "-PM";
					System.out.println(timeStamp1);
					timeStampList1.add(timeStamp1);
				} else {

					initialTime = initialTime + timeInterval;
					if (initialTime == 60) {
						// System.out.println("-- "+timeStamp1);
						initialTime = 00;
						timeStamp1 = "";
					}
				}

			}

			Wallpaper wallpaper = new Wallpaper();
			wallpaper.setStartTime(timeStamp1);
			wallpaper.setEndTime(timeStamp2);
			wallpaper.setImageURL("Johny");
			// timeStampList.add(wallpaper);

			timeStamp1 = "";
			timeStamp2 = "";
			wallpaper = null;
			// initialTime = 30;

			// timeStamp1 = (index+1) + ":" + initialTime + "-PM";
			// System.out.println(timeStamp1);
			System.out.println();
			timeStamp1 = "";
			initialTime = 00;

		}

		// timeStampList1.forEach(System.out::println);

		Collections.sort(timeStampList1);

		// timeStampList1.forEach(System.out::println);

		for (int index = 0; index < timeStampList1.size() - 1; index++) {

			Wallpaper wallpaper = new Wallpaper();
			wallpaper.setStartTime(timeStampList1.get(index));
			wallpaper.setEndTime(timeStampList1.get(index + 1));

			wallpaper.setImageURL("Johny");
			if (!timeStampList1.get(index).equals(timeStampList1.get(index + 1))) {
				timeStampList.add(wallpaper);
			}
			{

				System.out.println("Match");
			}
		}

		timeStampList.forEach(System.out::println);
		
		return timeStampList;
		
	}
	
	public static void main(String[] args) {
		
		WallPaperWithTimeInterval wallPaperWithTimeInterval = new WallPaperWithTimeInterval();
		List<Wallpaper> timeStampList =wallPaperWithTimeInterval.findWallPapeListrWithTimeInterval(30);
	}

}
