package mannequin.clothes;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import processing.core.PApplet;
import processing.core.PImage;

/**
 * The AccessoryList class represents a collection of all the Accessories to be
 * added to the screen using the Processing library.
 * 
 * @author 
 * @version 5/17/2022
 */

public class AccessoryList extends PApplet {
	private ArrayList<Accessory> allList;
	private ArrayList<Accessory> sortedList;

	private String weatherCondition;

	private int currentIndex;

	/**
	 * Constructs an AccessoryList containing an ArrayList of all the accessories and
	 * an ArrayList that is sorted based on the user settings
	 */

	public AccessoryList() {
		weatherCondition = "Hot";

		allList = new ArrayList<>();
		sortedList = new ArrayList<>();

		currentIndex = -1;

		BufferedImage img = null;
		try {
			img = ImageIO.read(new File("res/whitehat.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage whiteHat = new PImage(img);
		Accessory accessory1 = new Accessory("Hot", whiteHat);
		allList.add(accessory1);

		img = null;
		try {
			img = ImageIO.read(new File("res/blackhat.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage blackHat = new PImage(img);
		Accessory accessory2 = new Accessory("Hot", blackHat);
		allList.add(accessory2);

		img = null;
		try {
			img = ImageIO.read(new File("res/blackbeanie.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage blackBeanie = new PImage(img);
		Accessory accessory3 = new Accessory("Cold", blackBeanie);
		allList.add(accessory3);

		img = null;
		try {
			img = ImageIO.read(new File("res/graybeanie.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage grayBeanie = new PImage(img);
		Accessory accessory4 = new Accessory("Cold", grayBeanie);
		allList.add(accessory4);

		img = null;
		try {
			img = ImageIO.read(new File("res/greenbeanie.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage greenBeanie = new PImage(img);
		Accessory accessory5 = new Accessory("Cold", greenBeanie);
		allList.add(accessory5);

	}

	/**
	 * Sorts the ArrayList with all the accessories into the sorted ArrayList
	 */
	public void sortArray() {
		for (Accessory a : allList) {
			if (a.getWeather().equals(weatherCondition))
				sortedList.add(a);
		}
	}

	/**
	 * Picks a random accessory based on the selected filters
	 * 
	 * @return The image of the accessory picked
	 */
	public Accessory pickRandom() {
		int index = (int) (Math.random() * sortedList.size());
		while (sortedList.get(index) == null) {
			index = (int) (Math.random() * sortedList.size());
		}
		return sortedList.get(index);
	}

	/**
	 * Picks the next accessory based on the selected filters
	 * 
	 * @return The image of the accessory picked
	 */
	public Accessory pickNextEntry() {

		if (currentIndex == sortedList.size() - 1)
			currentIndex = -1;
		currentIndex++;
		return sortedList.get(currentIndex);
	}

	/**
	 * Sets the weather condition outside to sort the clothes
	 * 
	 * @param w the weather
	 */
	public void setWeatherCondition(String w) {
		weatherCondition = w;
	}

}
