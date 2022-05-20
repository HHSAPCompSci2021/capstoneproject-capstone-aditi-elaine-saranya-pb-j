package mannequin.clothes;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import processing.core.PApplet;
import processing.core.PImage;

/**
 * The ShoesList class represents a collection of all the Shoes to be added to
 * the screen using the Processing library.
 * 
 * @author
 * @version 5/18/2022
 */
public class ShoesList {
	private ArrayList<Shoes> allList;
	private ArrayList<Shoes> sortedListRight;
	private ArrayList<Shoes> sortedListLeft;

	private int currentIndexLeft;
	private int currentIndexRight;

	private String weatherCondition;
	private String formality;
	private String gender;

	/**
	 * Constructs an AccessoryList containing an ArrayList of all the accessories
	 * and an ArrayList that is sorted based on the user settings
	 */

	public ShoesList() {
		currentIndexLeft = -1;
		currentIndexRight = -1;

		weatherCondition = " ";
		formality = " ";
		gender = "Neutral";

		allList = new ArrayList<>();
		sortedListLeft = new ArrayList<>();
		sortedListRight = new ArrayList<>();

		BufferedImage img = null;
		try {
			img = ImageIO.read(new File("res/loafersL.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage loafersL = new PImage(img);
		Shoes shoes1L = new Shoes("Cold", "Formal", "Neutral", loafersL, 99.95/2, "left", "https://www.stevemadden.com/products/lawrence-black-leather?variant=34612305100933&utm_source=google&utm_medium=cpc&utm_campaign=SM%20Smart%20Shopping%20-%20Bestseller&utm_content=&utm_term=&gclid=Cj0KCQjwspKUBhCvARIsAB2IYusDrqL14FaocGsYfpp-45S6MXRZqvhdMauGZA4L4Nu4qYds7cSPBwsaAi0TEALw_wcB");
		allList.add(shoes1L);

		img = null;
		try {
			img = ImageIO.read(new File("res/loafersR.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage loafersR = new PImage(img);
		Shoes shoes1R = new Shoes("Cold", "Formal", "Neutral", loafersR, 99.95/2, "right", "https://www.stevemadden.com/products/lawrence-black-leather?variant=34612305100933&utm_source=google&utm_medium=cpc&utm_campaign=SM%20Smart%20Shopping%20-%20Bestseller&utm_content=&utm_term=&gclid=Cj0KCQjwspKUBhCvARIsAB2IYusDrqL14FaocGsYfpp-45S6MXRZqvhdMauGZA4L4Nu4qYds7cSPBwsaAi0TEALw_wcB");
		allList.add(shoes1R);

		img = null;
		try {
			img = ImageIO.read(new File("res/dunksL.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage dunksL = new PImage(img);
		Shoes shoes2L = new Shoes("Hot", "Semi-Formal", "Neutral", dunksL, 181.00/2, "left", "https://www.goat.com/sneakers/wmns-dunk-low-light-violet-dd1503-116?utm_source=google_int&utm_medium=google_shopping_int&utm_campaign=16777478842_&utm_content=_&utm_term=195866273009&gclid=Cj0KCQjwspKUBhCvARIsAB2IYuucw7E96YSEgHyXWUl7nyuXu5MgMfXqQG9KKHIlEVA-bsMJB4efW-oaAop8EALw_wcB");
		allList.add(shoes2L);

		img = null;
		try {
			img = ImageIO.read(new File("res/dunksR.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage dunksR = new PImage(img);
		Shoes shoes2R = new Shoes("Hot", "Semi-Formal", "Neutral", dunksR, 181.00/2, "right", "https://www.goat.com/sneakers/wmns-dunk-low-light-violet-dd1503-116?utm_source=google_int&utm_medium=google_shopping_int&utm_campaign=16777478842_&utm_content=_&utm_term=195866273009&gclid=Cj0KCQjwspKUBhCvARIsAB2IYuucw7E96YSEgHyXWUl7nyuXu5MgMfXqQG9KKHIlEVA-bsMJB4efW-oaAop8EALw_wcB");
		allList.add(shoes2R);

		img = null;
		try {
			img = ImageIO.read(new File("res/blackconverseL.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage converseL = new PImage(img);
		Shoes shoes3L = new Shoes("Hot", "Casual", "Neutral", converseL, 37.50, "left", "https://www.converse.com/shop/p/"
				+ "chuck-taylor-all-star-lift-platform-canvas-womens-high-top-shoe/560845F_095.html?"
				+ "cp=PLA_PRF_CNV_NA_US_EN_20190226_CPCS_CPCS-Shopping-[B]%20Shoes%20-%20"
				+ "Womens_X_X_X_X_Google_X_X__Desktop/Tablet-[B]%20Shoes%20-%20Womens_X_X"
				+ "&gclid=CjwKCAjwj42UBhAAEiwACIhADqgf0gwXrga5ix7qxHCbA0b4SS1ufhYWPkFWwgUjvGgv0SUt5"
				+ "uTS0xoC2RAQAvD_BwE");
		allList.add(shoes3L);

		img = null;
		try {
			img = ImageIO.read(new File("res/blackconverseR.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage converseR = new PImage(img);
		Shoes shoes3R = new Shoes("Hot", "Casual", "Neutral", converseR, 37.50, "right", "https://www.converse.com/shop/p/c"
				+ "huck-taylor-all-star-lift-platform-canvas-womens-high-top-shoe/560845F_095.h"
				+ "tml?cp=PLA_PRF_CNV_NA_US_EN_20190226_CPCS_CPCS-Shopping-[B]%20Shoes%20-%20Womens"
				+ "_X_X_X_X_Google_X_X__Desktop/Tablet-[B]%20Shoes%20-%20Womens_X_X&gclid=CjwKCAjwj4"
				+ "2UBhAAEiwACIhADqgf0gwXrga5ix7qxHCbA0b4SS1ufhYWPkFWwgUjvGgv0SUt5uTS0xoC2RAQAvD_BwE");
		allList.add(shoes3R);

		img = null;
		try {
			img = ImageIO.read(new File("res/af1L.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage af1L = new PImage(img);
		Shoes shoes4L = new Shoes("Hot", "Casual", "Neutral", af1L, 50.00, "left", "https://www.nike.com/t/air-force-1-07-womens-shoes-GCkPzr/DD8959-100");
		allList.add(shoes4L);

		img = null;
		try {
			img = ImageIO.read(new File("res/af1R.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage af1R = new PImage(img);
		Shoes shoes4R = new Shoes("Hot", "Casual", "Neutral", af1R, 50.00, "right", "https://www.nike.com/t/air-force-1-07-womens-shoes-GCkPzr/DD8959-100");
		allList.add(shoes4R);

		img = null;
		try {
			img = ImageIO.read(new File("res/drmartensL.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage drmartensL = new PImage(img);
		Shoes shoes5L = new Shoes("Cold", "Semi-Formal", "Neutral", drmartensL, 100.00, "left", "https://www.drmartens.com/us/en/jadon-smooth-leather-platform-boots/p/15265001");
		allList.add(shoes5L);

		img = null;
		try {
			img = ImageIO.read(new File("res/drmartensR.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage drmartensR = new PImage(img);
		Shoes shoes5R = new Shoes("Cold", "Semi-Formal", "Neutral", drmartensR, 100.00, "right", "https://www.drmartens.com/us/en/jadon-smooth-leather-platform-boots/p/15265001");
		allList.add(shoes5R);
		
		img = null;
		try {
			img = ImageIO.read(new File("res/blackconverseL.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage converse2L = new PImage(img);
		Shoes shoes6L = new Shoes("Cold", "Casual", "Neutral", converse2L, 37.50, "left", "https://www.converse.com/shop/p/"
				+ "chuck-taylor-all-star-lift-platform-canvas-womens-high-top-shoe/560845F_095.html?"
				+ "cp=PLA_PRF_CNV_NA_US_EN_20190226_CPCS_CPCS-Shopping-[B]%20Shoes%20-%20"
				+ "Womens_X_X_X_X_Google_X_X__Desktop/Tablet-[B]%20Shoes%20-%20Womens_X_X"
				+ "&gclid=CjwKCAjwj42UBhAAEiwACIhADqgf0gwXrga5ix7qxHCbA0b4SS1ufhYWPkFWwgUjvGgv0SUt5"
				+ "uTS0xoC2RAQAvD_BwE");
		allList.add(shoes6L);

		img = null;
		try {
			img = ImageIO.read(new File("res/blackconverseR.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage converse2R = new PImage(img);
		Shoes shoes6R = new Shoes("Cold", "Casual", "Neutral", converse2R, 37.50, "right", "https://www.converse.com/shop/p/c"
				+ "huck-taylor-all-star-lift-platform-canvas-womens-high-top-shoe/560845F_095.h"
				+ "tml?cp=PLA_PRF_CNV_NA_US_EN_20190226_CPCS_CPCS-Shopping-[B]%20Shoes%20-%20Womens"
				+ "_X_X_X_X_Google_X_X__Desktop/Tablet-[B]%20Shoes%20-%20Womens_X_X&gclid=CjwKCAjwj4"
				+ "2UBhAAEiwACIhADqgf0gwXrga5ix7qxHCbA0b4SS1ufhYWPkFWwgUjvGgv0SUt5uTS0xoC2RAQAvD_BwE");
		allList.add(shoes6R);
		
		img = null;
		try {
			img = ImageIO.read(new File("res/af1L.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage af12L = new PImage(img);
		Shoes shoes7L = new Shoes("Cold", "Casual", "Neutral", af12L, 50.00, "left", "https://www.nike.com/t/air-force-1-07-womens-shoes-GCkPzr/DD8959-100");
		allList.add(shoes4L);

		img = null;
		try {
			img = ImageIO.read(new File("res/af1R.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage af12R = new PImage(img);
		Shoes shoes7R = new Shoes("Cold", "Casual", "Neutral", af12R, 50.00, "right", "https://www.nike.com/t/air-force-1-07-womens-shoes-GCkPzr/DD8959-100");
		allList.add(shoes4R);
		
		img = null;
		try {
			img = ImageIO.read(new File("res/af1L.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage af13L = new PImage(img);
		Shoes shoes8L = new Shoes("Cold", "Semi-Formal", "Neutral", af13L, 50.00, "left", "https://www.nike.com/t/air-force-1-07-womens-shoes-GCkPzr/DD8959-100");
		allList.add(shoes8L);

		img = null;
		try {
			img = ImageIO.read(new File("res/af1R.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage af13R = new PImage(img);
		Shoes shoes8R = new Shoes("Cold", "Semi-Formal", "Neutral", af13R, 50.00, "right", "https://www.nike.com/t/air-force-1-07-womens-shoes-GCkPzr/DD8959-100");
		allList.add(shoes8R);
		
		img = null;
		try {
			img = ImageIO.read(new File("res/af1L.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage af14L = new PImage(img);
		Shoes shoes9L = new Shoes("Hot", "Semi-Formal", "Neutral", af14L, 50.00, "left", "https://www.nike.com/t/air-force-1-07-womens-shoes-GCkPzr/DD8959-100");
		allList.add(shoes9L);

		img = null;
		try {
			img = ImageIO.read(new File("res/af1R.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage af14R = new PImage(img);
		Shoes shoes9R = new Shoes("Hot", "Semi-Formal", "Neutral", af14R, 50.00, "right", "https://www.nike.com/t/air-force-1-07-womens-shoes-GCkPzr/DD8959-100");
		allList.add(shoes9R);

		img = null;
		try {
			img = ImageIO.read(new File("res/blackheelL.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage blackHeelL = new PImage(img);
		Shoes shoes10L = new Shoes("Hot", "Formal", "Feminine", blackHeelL, 136.0, "left", "https://www.stevemadden.com/collections/womens-heels/products/iesha-black-leather");
		allList.add(shoes10L);
		
		img = null;
		try {
			img = ImageIO.read(new File("res/blackheelR.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage blackHeelR = new PImage(img);
		Shoes shoes10R = new Shoes("Hot", "Formal", "Feminine", blackHeelR, 136.0, "right", "https://www.stevemadden.com/collections/womens-heels/products/iesha-black-leather");
		allList.add(shoes10R);
		
		img = null;
		try {
			img = ImageIO.read(new File("res/blackheelL.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage blackHeelL2 = new PImage(img);
		Shoes shoes11L = new Shoes("Cold", "Formal", "Feminine", blackHeelL2, 136.0, "left", "https://www.stevemadden.com/collections/womens-heels/products/iesha-black-leather");
		allList.add(shoes11L);
		
		img = null;
		try {
			img = ImageIO.read(new File("res/blackheelR.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage blackHeelR2 = new PImage(img);
		Shoes shoes11R = new Shoes("Cold", "Formal", "Feminine", blackHeelR2, 136.0, "right", "https://www.stevemadden.com/collections/womens-heels/products/iesha-black-leather");
		allList.add(shoes10R);




	}

	/**
	 * Sorts the ArrayList with all the shoes into the sorted ArrayList
	 */
	public void sortArray() {
		if (weatherCondition.equals(" ")) {
			for (Shoes s : allList) {
				if (s.getSide().equals("left"))
					sortedListLeft.add(s);
				else
					sortedListRight.add(s);
			}
		} else {
			for (Shoes s : allList) {
				if (s.getWeather().equals(weatherCondition)) {
					if (s.getSide().equals("left"))
						sortedListLeft.add(s);
					else
						sortedListRight.add(s);
				}
			}
		}

		if (!formality.equals(" ")) {
			for (int i = 0; i < sortedListLeft.size(); i++) {
				Shoes s = sortedListLeft.get(i);
				if (!s.getFormality().equals(formality)) {
					sortedListLeft.remove(i);
					sortedListRight.remove(i);
					i--;
				}
			}
		}

		for (int i = 0; i < sortedListLeft.size(); i++) {
			Shoes s = sortedListLeft.get(i);
			if (!s.getExpression().equals(gender) && !gender.equals("Neutral")) {
				sortedListLeft.remove(i);
				sortedListRight.remove(i);
				i--;
			}
		}
	}

	/**
	 * Picks a random shoe based on the selected filters
	 * 
	 * @return The image of the shoe picked
	 */
	public Shoes pickRandom() {
		int index = (int) (Math.random() * sortedListLeft.size());
		while (sortedListLeft.get(index) == null) {
			index = (int) (Math.random() * sortedListLeft.size());
		}
		currentIndexLeft = index;
		currentIndexRight = index - 1;
		return sortedListLeft.get(index);
	}

	/**
	 * Picks the next shoe based on the selected filters
	 * 
	 * @return The image of the shoe picked
	 */
	public Shoes pickNextEntry(String side) {
		if (side.equals("left")) {
			if (currentIndexLeft == sortedListLeft.size() - 1)
				currentIndexLeft = -1;
			currentIndexLeft++;

			return sortedListLeft.get(currentIndexLeft);
		} else {
			if (currentIndexRight == sortedListRight.size() - 1)
				currentIndexRight = -1;
			currentIndexRight++;
			return sortedListRight.get(currentIndexRight);
		}

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
	
	/**
	 * Returns the sorted arraylist
	 * @return sorted list
	 */
	public ArrayList<Shoes> returnArrayList() {
		return sortedListLeft;
	}

}
