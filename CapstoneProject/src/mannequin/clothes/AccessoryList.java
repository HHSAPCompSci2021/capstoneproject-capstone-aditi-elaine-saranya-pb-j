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
 * @version 5/18/2022
 */

public class AccessoryList {
	private ArrayList<Accessory> allList;
	private ArrayList<Accessory> sortedList;

	private String weatherCondition;
	private String formality;
	private String gender;

	private int currentIndex;

	/**
	 * Constructs an AccessoryList containing an ArrayList of all the accessories
	 * and an ArrayList that is sorted based on the user settings
	 */

	public AccessoryList() {
		weatherCondition = " ";
		formality = " ";
		gender = "Neutral";

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
		Accessory accessory1 = new Accessory("Hot", "Casual", "Neutral", whiteHat, 17.90, "https://www.zara.com/us/en/basic-twill-cap-p00653037.html?v1=153871059");
		allList.add(accessory1);

		img = null;
		try {
			img = ImageIO.read(new File("res/blackhat.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage blackHat = new PImage(img);
		Accessory accessory2 = new Accessory("Hot", "Casual", "Neutral", blackHat, 17.90, "https://www.zara.com/us/en/basic-twill-cap-p00653037.html?v1=153871059");
		allList.add(accessory2);

		img = null;
		try {
			img = ImageIO.read(new File("res/blackbeanie.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage blackBeanie = new PImage(img);
		Accessory accessory3 = new Accessory("Cold", "Casual", "Neutral", blackBeanie, 48.0, "https://www.everlane.com/products/mens-chunky-beanie-black");
		allList.add(accessory3);

		img = null;
		try {
			img = ImageIO.read(new File("res/graybeanie.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage grayBeanie = new PImage(img);
		Accessory accessory4 = new Accessory("Cold", "Casual", "Neutral", grayBeanie, 48.00, "https://www.everlane.com/products/mens-chunky-beanie-hthr-charcoal");
		allList.add(accessory4);

		img = null;
		try {
			img = ImageIO.read(new File("res/greenbeanie.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage greenBeanie = new PImage(img);
		Accessory accessory5 = new Accessory("Cold", "Casual", "Neutral", greenBeanie, 48.00, "https://www.everlane.com/products/unisex-chunky-beanie-breen");
		allList.add(accessory5);
		
		img = null;
		try {
			img = ImageIO.read(new File("res/buckethat.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage buckethat = new PImage(img);
		Accessory accessory6 = new Accessory("Hot", "Casual", "Neutral", buckethat, 48.00, "https://shop.lululemon.com/p/hats/Both-Ways-Bucket-Hat/_/prod9820514?color=57307?ta=1&taterm=bucket&tasid=OKea5q3QsY");
		allList.add(accessory6);

	}

	/**
	 * Sorts the ArrayList with all the accessories into the sorted ArrayList
	 */
	public void sortArray() {

		if (formality.equals("Casual")) {
			if (weatherCondition.equals(" ")) {
				sortedList = (ArrayList<Accessory>) allList.clone();
			} else {
				for (Accessory a : allList) {
					if (a.getWeather().equals(weatherCondition))
						sortedList.add(a);
				}
			}

			for (int i = 0; i < sortedList.size(); i++) {
				Accessory a = sortedList.get(i);
				if (!a.getExpression().equals(gender) && !gender.equals("Neutral")) {
					sortedList.remove(i);
					i--;
				}
			}
		}
	}

	/**
	 * Picks a random accessory based on the selected filters
	 * 
	 * @return The image of the accessory picked
	 */
	public Accessory pickRandom() {
		if (sortedList.size() == 0)
			return null;
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

		if (sortedList.size() == 0)
			return null;
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

	/**
	 * Sets the formality type to sort the clothes
	 * 
	 * @param w the formality
	 */
	public void setFormalityType(String w) {
		formality = w;
	}

	/**
	 * Sets the gender expression to sort the clothes
	 * 
	 * @param w the gender expression
	 */
	public void setClothesGender(String w) {
		gender = w;
	}

}
