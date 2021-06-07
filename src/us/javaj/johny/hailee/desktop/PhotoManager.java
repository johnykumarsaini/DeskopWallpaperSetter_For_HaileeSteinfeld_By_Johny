package us.javaj.johny.hailee.desktop;

import java.awt.dnd.DnDConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PhotoManager {

	public void addPhoto(Wallpaper wallpaper) throws IOException {

		List<Wallpaper> wallpapers = findAllPhoto();
		FileOutputStream fout = null;
		ObjectOutputStream out = null;

		System.out.println("wallpaper.getType() " + wallpaper.getType());

		if ("BREAKFASTTIME".equals(wallpaper.getType())) {
			fout = new FileOutputStream(
					"E:\\Hailee-Johny\\Hailee_Stienfeld_Johny_S\\Desktop\\wallpapers\\breakfast.txt");

			out = new ObjectOutputStream(fout);
			out.writeObject(wallpaper);
		}

		if ("AFTERNOONFOODBREAK".equals(wallpaper.getType())) {

			fout = new FileOutputStream("E:\\Hailee-Johny\\Hailee_Stienfeld_Johny_S\\Desktop\\wallpapers\\launch.txt");

			out = new ObjectOutputStream(fout);
			out.writeObject(wallpaper);

		}

		if (Constants.SNACK_TIME.equals(wallpaper.getType())) {

			fout = new FileOutputStream("E:\\Hailee-Johny\\Hailee_Stienfeld_Johny_S\\Desktop\\wallpapers\\snack.txt");

			out = new ObjectOutputStream(fout);
			out.writeObject(wallpaper);

		}

		if (Constants.DINNER_TIME.equals(wallpaper.getType())) {

			fout = new FileOutputStream("E:\\Hailee-Johny\\Hailee_Stienfeld_Johny_S\\Desktop\\wallpapers\\dinner.txt");

			out = new ObjectOutputStream(fout);
			out.writeObject(wallpaper);

		}
		
		if (Constants.GOOD_NIGHT_TIME.equals(wallpaper.getType())) {

			fout = new FileOutputStream("E:\\Hailee-Johny\\Hailee_Stienfeld_Johny_S\\Desktop\\wallpapers\\goodnight.txt");

			out = new ObjectOutputStream(fout);
			out.writeObject(wallpaper);

		}


		try {

			out.flush();
			// closing the stream
			out.close();
			System.out.println("Wallpaper Added ");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public Wallpaper findAllPhotoWithType(String wallpaperType) {
		Wallpaper wallpaper = null;

		if ("BREAKFASTTIME".equals(wallpaperType)) {

			try {

				FileInputStream fileInputStream = new FileInputStream(
						"E:\\Hailee-Johny\\Hailee_Stienfeld_Johny_S\\Desktop\\wallpapers\\breakfast.txt");
				ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
				wallpaper = (Wallpaper) objectInputStream.readObject();
				objectInputStream.close();
				System.out.println("File Path Fetch Succussfully ");

			} catch (Exception e) {
				System.out.println(e);
			}

		}

		

		if ("AFTERNOONFOODBREAK".equals(wallpaperType)) {

			try {

				FileInputStream fileInputStream = new FileInputStream(
						"E:\\Hailee-Johny\\Hailee_Stienfeld_Johny_S\\Desktop\\wallpapers\\launch.txt");
				ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
				wallpaper = (Wallpaper) objectInputStream.readObject();
				objectInputStream.close();
				System.out.println("File Path Fetch Succussfully ");

			} catch (Exception e) {
				System.out.println(e);
			}

		}
		
		
		if (Constants.SNACK_TIME.equals(wallpaperType)) {

			try {

				FileInputStream fileInputStream = new FileInputStream(
						"E:\\Hailee-Johny\\Hailee_Stienfeld_Johny_S\\Desktop\\wallpapers\\snack.txt");
				ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
				wallpaper = (Wallpaper) objectInputStream.readObject();
				objectInputStream.close();
				System.out.println("File Path Fetch Succussfully ");

			} catch (Exception e) {
				System.out.println(e);
			}

		}
		
		if (Constants.GOOD_NIGHT_TIME.equals(wallpaperType)) {

			try {

				FileInputStream fileInputStream = new FileInputStream(
						"E:\\Hailee-Johny\\Hailee_Stienfeld_Johny_S\\Desktop\\wallpapers\\dinner.txt");
				ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
				wallpaper = (Wallpaper) objectInputStream.readObject();
				objectInputStream.close();
				System.out.println("File Path Fetch Succussfully ");

			} catch (Exception e) {
				System.out.println(e);
			}

		}

		return wallpaper;

	}

	public List<Wallpaper> findAllPhoto() {

		List<Wallpaper> wallpapers = new ArrayList<>();
		Wallpaper wallpaper = null;

		try {

			String filePath = findFileDirectory();
			File file = new File(filePath);

			if (file.isDirectory()) {

				List<String> fileList = Arrays.asList(file.list());

				for (String fileName : fileList) {

					wallpaper = new Wallpaper();
					wallpaper.setImageURL(filePath + "//" + fileName);
					wallpaper.setType(WallpaperType.INTERVALTIME.toString());
					wallpapers.add(wallpaper);

				}

			}

		} catch (Exception e) {
			System.out.println(e);
		}

		return wallpapers;

	}

	public void addAllPhoto(List<Wallpaper> timeStampList) {

		List<Wallpaper> wallpapers = findAllPhoto();
		timeStampList.stream().forEach(name -> {

			if (!wallpapers.contains(name)) {
				wallpapers.add(name);
			}
		});

		try {
			// Creating the object
			// Creating stream and writing the object
			FileOutputStream fout = new FileOutputStream(
					"E:\\Hailee-Johny\\Hailee_Stienfeld_Johny_S\\Desktop\\wallpapers\\wallpapers.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(wallpapers);
			out.flush();
			// closing the stream
			out.close();
			System.out.println("All Photo Save Succussfully ");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void saveFileDirectory(String fileDirectoryPath) {

		try {

			FileOutputStream fout = new FileOutputStream(
					"E:\\Hailee-Johny\\Hailee_Stienfeld_Johny_S\\Desktop\\wallpapers\\filePath.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(fileDirectoryPath);
			out.flush();
			out.close();
			System.out.println("File Path Save Succussfully ");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public String findFileDirectory() {

		String fileDirectoryPath = null;
		try {

			FileInputStream fileInputStream = new FileInputStream(
					"E:\\Hailee-Johny\\Hailee_Stienfeld_Johny_S\\Desktop\\wallpapers\\filePath.txt");
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			fileDirectoryPath = (String) objectInputStream.readObject();
			objectInputStream.close();
			System.out.println("File Path Fetch Succussfully ");

		} catch (Exception e) {
			System.out.println(e);
		}
		return fileDirectoryPath;

	}
	
	
	public List<Wallpaper>  findTop10Wallpaper() {

		List<Wallpaper> top10WallpaperList = null;
		try {

			FileInputStream fileInputStream = new FileInputStream(
					"E:\\Hailee-Johny\\Hailee_Stienfeld_Johny_S\\Desktop\\wallpapers\\top10wallpaper.txt");
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			top10WallpaperList = (List<Wallpaper>) objectInputStream.readObject();
			objectInputStream.close();
			System.out.println("File List Fetch Succussfully ");

		} catch (Exception e) {
			System.out.println(e);
		}
		return top10WallpaperList;

	}
	
	public void saveTop10Wallpaper(List<Wallpaper> top10WallpaperList ) {
		
		try {

			FileOutputStream fout = new FileOutputStream(
					"E:\\Hailee-Johny\\Hailee_Stienfeld_Johny_S\\Desktop\\wallpapers\\top10wallpaper.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(top10WallpaperList);
			out.flush();
			out.close();
			System.out.println("File Path Save Succussfully ");
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

	public static void main(String[] args) {

		PhotoManager photoManager = new PhotoManager();

		// List<Wallpaper> wallpapers = photoManager.findAllPhoto();

		// wallpapers.forEach(System.out::println);

		// Wallpaper wallpaper1 = wallpapers.stream().filter(photo ->
		// photo.equals("BREAKFASTTIME")).findFirst().get();
		// System.out.println("wallpaper 1 :: :: " + wallpaper1);

		// System.out.println("wallpaper 1 :: :: " + wallpaper11);

		photoManager.findAllPhotoWithType("BREAKFASTTIME");

		System.out.println(photoManager.findAllPhotoWithType("AFTERNOONFOODBREAK"));

	}

}
