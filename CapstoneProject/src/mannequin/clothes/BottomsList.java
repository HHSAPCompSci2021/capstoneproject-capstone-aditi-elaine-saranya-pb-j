package mannequin.clothes;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import processing.core.PApplet;
import processing.core.PImage;

/**
 * The BottomList class represents a collection of all the Bottoms to be added
 * to the screen using the Processing library.
 * 
 * @author
 * @version 5/18/2022
 */
public class BottomsList {
	private ArrayList<Bottom> allList;
	private ArrayList<Bottom> sortedList;
	private String weatherCondition;
	private String formality;
	private String gender;
	private int currentIndex;

	/**
	 * Constructs an AccessoryList containing an ArrayList of all the accessories
	 * and an ArrayList that is sorted based on the user settings
	 */
	public BottomsList() {
		weatherCondition = " ";
		formality = " ";
		gender = "Neutral";

		allList = new ArrayList<>();
		sortedList = new ArrayList<>();

		currentIndex = -1;

		BufferedImage img = null;
		try {
			img = ImageIO.read(new File("res/whitepants.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage whitePants = new PImage(img);
		Bottom bottom1 = new Bottom("Cold", whitePants, "Formal", "Neutral", 78.00, "https://www.everlane.com/products/womens-easy-straight-leg-chino-canvas");
		allList.add(bottom1);

		img = null;
		try {
			img = ImageIO.read(new File("res/beigepants.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage beigePants = new PImage(img);
		Bottom bottom2 = new Bottom("Cold", beigePants, "Formal", "Neutral", 50.00, "https://www.zara.com/us/en/zw-the-marine-straight-jeans-p08246066.html?v1=170915825&v2=2025798");
		allList.add(bottom2);

		img = null;
		try {
			img = ImageIO.read(new File("res/blackpants.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage blackPants = new PImage(img);
		Bottom bottom3 = new Bottom("Cold", blackPants, "Semi-Formal", "Neutral", 78.00, "https://www.everlane.com/products/womens-easy-straight-leg-chino-black");
		allList.add(bottom3);

		img = null;
		try {
			img = ImageIO.read(new File("res/blueflarejeans.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage blueFlareJeans = new PImage(img);
		Bottom bottom4 = new Bottom("Cold", blueFlareJeans, "Casual", "Feminine", 70.00, "https://www.zara.com/us/en/zw-good-american-classic-bootcut-jeans-p02553069.html?v1=176007504&v2=2025798");
		allList.add(bottom4);

		img = null;
		try {
			img = ImageIO.read(new File("res/bluejeans.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage blueJeans = new PImage(img);
		Bottom bottom5 = new Bottom("Hot", blueJeans, "Casual", "Neutral", 49.90, "https://www.zara.com/us/en/wide-leg-jeans-p06688023.html?v1=161314838");
		allList.add(bottom5);

		img = null;
		try {
			img = ImageIO.read(new File("res/bluejeanswithrips.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage blueJeansWRips = new PImage(img);
		Bottom bottom6 = new Bottom("Hot", blueJeansWRips, "Casual", "Feminine", 50.00, "https://www.zara.com/us/en/ripped-mom-fit-jeans-p08197030.html?v1=173843073");
		allList.add(bottom6);

		img = null;
		try {
			img = ImageIO.read(new File("res/blacksweats.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage blackSweats = new PImage(img);
		Bottom bottom7 = new Bottom("Cold", blackSweats, "Casual", "Neutral", 27.90, "https://www.zara.com/us/en/plush-jogging-pants-p08417814.html?v1=144435357");
		allList.add(bottom7);

		img = null;
		try {
			img = ImageIO.read(new File("res/darkblueshorts.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage darkBlueShorts = new PImage(img);
		Bottom bottom8 = new Bottom("Hot", darkBlueShorts, "Casual", "Feminine", 68.00, "https://www.everlane.com/products/womens-relaxed-90s-short-deep-indigo");
		allList.add(bottom8);

		img = null;
		try {
			img = ImageIO.read(new File("res/lightblueshorts.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage lightBlueShorts = new PImage(img);
		Bottom bottom9 = new Bottom("Hot", lightBlueShorts, "Casual", "Feminine", 68.00, "https://www.everlane.com/products/womens-relaxed-90s-short-sunbleached-blue?collection=womens-skirts-shorts");
		allList.add(bottom9);

		img = null;
		try {
			img = ImageIO.read(new File("res/blueflarejeans.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage blueFlareJeans2 = new PImage(img);
		Bottom bottom10 = new Bottom("Cold", blueFlareJeans2, "Formal", "Feminine", 70.00, "https://www.zara.com/us/en/zw-good-american-classic-bootcut-jeans-p02553069.html?v1=176007504&v2=2025798");
		allList.add(bottom10);

		img = null;
		try {
			img = ImageIO.read(new File("res/blackshorts.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage blackshorts = new PImage(img);
		Bottom bottom11 = new Bottom("Hot", blackshorts, "Formal", "Feminine", 35.00, "https://www.zara.com/us/en/high-waisted-shorts-p02417324.html?v1=186310075");
		allList.add(bottom11);
 
		img = null;
		try {
			img = ImageIO.read(new File("res/blackskirt.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage blackskirt = new PImage(img);
		Bottom bottom12 = new Bottom("Hot", blackskirt, "Formal", "Feminine", 35.00, "https://www.zara.com/us/en/combination-skort-p03159636.html?v1=168349101");
		allList.add(bottom12);
		
		img = null;
		try {
			img = ImageIO.read(new File("res/bluesweats.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage bluesweats = new PImage(img);
		Bottom bottom13 = new Bottom("Cold", bluesweats, "Casual", "Neutral", 78.00, "https://www.everlane.com/products/mens-track-pant-blue");
		allList.add(bottom13);

		img = null;
		try {
			img = ImageIO.read(new File("res/blacksweats.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage blacksweats = new PImage(img);
		Bottom bottom14 = new Bottom("Cold", blacksweats, "Casual", "Neutral", 78.00, "https://www.everlane.com/products/mens-track-pant-black");
		allList.add(bottom14);
		
		img = null;
		try {
			img = ImageIO.read(new File("res/longblackskirt.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage longblackskirt = new PImage(img);
		Bottom bottom15 = new Bottom("Cold", longblackskirt, "Formal", "Feminine", 98.00, "https://www.aritzia.com/us/en/product/eames-skirt/99842.html?dwvar_99842_color=1274");
		allList.add(bottom15);
		
		img = null;
		try {
			img = ImageIO.read(new File("res/longblackskirt.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage longblackskirt2 = new PImage(img);
		Bottom bottom21 = new Bottom("Hot", longblackskirt2, "Formal", "Feminine", 98.00, "https://www.aritzia.com/us/en/product/eames-skirt/99842.html?dwvar_99842_color=1274");
		allList.add(bottom21);
		
		
		img = null;
		try {
			img = ImageIO.read(new File("res/longgrayshorts.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage longgrayshorts = new PImage(img);
		Bottom bottom16 = new Bottom("Hot", longgrayshorts, "Semi-Formal", "Masculine", 65.00, "https://www.everlane.com/products/mens-performance-chino-7-short-slategrey");
		allList.add(bottom16);
		
		img = null;
		try {
			img = ImageIO.read(new File("res/longgrayshorts.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage longgrayshorts2 = new PImage(img);
		Bottom bottom17 = new Bottom("Hot", longgrayshorts2, "Casual", "Masculine", 65.00, "https://www.everlane.com/products/mens-performance-chino-7-short-slategrey");
		allList.add(bottom17);
		
		img = null;
		try {
			img = ImageIO.read(new File("res/longkhakishorts.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage longkhakishorts = new PImage(img);
		Bottom bottom18 = new Bottom("Hot", longkhakishorts, "Casual", "Masculine", 45.90, "https://www.zara.com/us/en/x-rhuigi-logo-shorts-p01538324.html?v1=177649009&v2=2030325");
		allList.add(bottom18);
		
		img = null;
		try {
			img = ImageIO.read(new File("res/longwhiteskirt.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage longwhiteskirt = new PImage(img);
		Bottom bottom19 = new Bottom("Hot", longwhiteskirt, "Casual", "Feminine", 98.00, "https://www.aritzia.com/us/en/product/chariot-skirt/95802.html?dwvar_95802_color=11420");
		allList.add(bottom19);
		
		img = null;
		try {
			img = ImageIO.read(new File("res/longwhiteskirt.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage longwhiteskirt2 = new PImage(img);
		Bottom bottom20 = new Bottom("Hot", longwhiteskirt2, "Semi-Formal", "Feminine", 98.00, "https://www.aritzia.com/us/en/product/chariot-skirt/95802.html?dwvar_95802_color=11420");
		allList.add(bottom20);
		
		
		
		

	}

	/**
	 * Sorts the ArrayList with all the bottoms into the sorted ArrayList that is sorted based on user preferences
	 */
	public void sortArray() {
		if (weatherCondition.equals(" ")) {
			sortedList = (ArrayList<Bottom>) allList.clone();
		} else {
			for (Bottom b : allList) {
				if (b.getWeather().equals(weatherCondition))
					sortedList.add(b);
			}
		}
		if (!formality.equals(" ")) {
			for (int i = 0; i < sortedList.size(); i++) {
				Bottom b = sortedList.get(i);
				if (!b.getFormality().equals(formality)) {
					sortedList.remove(i);
					i--;
				}
			}
		}

		for (int i = 0; i < sortedList.size(); i++) {
			Bottom b = sortedList.get(i);
			if (!b.getExpression().equals(gender) && !gender.equals("Neutral")) {
				sortedList.remove(i);
				i--;
			}
		}
	}

	/**
	 * Picks a random bottom based on the selected filters
	 * 
	 * @return The image of the bottom picked
	 */
	public Bottom pickRandom() {
		int index = (int) (Math.random() * sortedList.size());
		while (sortedList.get(index) == null) {
			index = (int) (Math.random() * sortedList.size());
		}
		return sortedList.get(index);
	}

	/**
	 * Picks the next bottom based on the selected filters
	 * 
	 * @return The image of the bottom picked
	 */
	public Bottom pickNextEntry() {

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
