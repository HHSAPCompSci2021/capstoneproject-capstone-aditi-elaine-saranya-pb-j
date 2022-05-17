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
 * @version 5/17/2022
 */
public class ShoesList {
	private ArrayList<Shoes> allList;
	private ArrayList<Shoes> sortedList;

	private int currentIndex;

	private String weatherCondition;
	private String formality;
	private String gender;
	
	

	/**
	 * Constructs an AccessoryList containing an ArrayList of all the accessories
	 * and an ArrayList that is sorted based on the user settings
	 */

	public ShoesList() {
		weatherCondition = "Hot";
		formality = "Casual";
		gender = "Neutral";

		allList = new ArrayList<>();
		sortedList = new ArrayList<>();

		currentIndex = -1;

		BufferedImage img = null;
		try {
			img = ImageIO.read(new File("res/loafersL.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage loafersL = new PImage(img);
		Shoes shoes1L = new Shoes("Cold", "Formal","Neutral", loafersL, 0.0);
		allList.add(shoes1L);

		img = null;
		try {
			img = ImageIO.read(new File("res/loafersR.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage loafersR = new PImage(img);
		Shoes shoes1R = new Shoes("Cold", "Formal","Neutral", loafersR, 0.0);
		allList.add(shoes1R);

		img = null;
		try {
			img = ImageIO.read(new File("res/dunksL.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage dunksL = new PImage(img);
		Shoes shoes2L = new Shoes("Hot", "Semi-Formal","Neutral", dunksL, 0.0);
		allList.add(shoes2L);

		img = null;
		try {
			img = ImageIO.read(new File("res/dunksR.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage dunksR = new PImage(img);
		Shoes shoes2R = new Shoes("Hot", "Semi-Formal" ,"Neutral", dunksR, 0.0);
		allList.add(shoes2R);
		
		img = null;
		try {
			img = ImageIO.read(new File("res/blackconverseL.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage converseL = new PImage(img);
		Shoes shoes3L = new Shoes("Hot", "Casual","Neutral", converseL, 0.0);
		allList.add(shoes3L);

		img = null;
		try {
			img = ImageIO.read(new File("res/blackconverseR.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage converseR = new PImage(img);
		Shoes shoes3R = new Shoes("Hot", "Casual","Neutral", converseR, 0.0);
		allList.add(shoes3R);
		
		img = null;
		try {
			img = ImageIO.read(new File("res/af1L.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage af1L = new PImage(img);
		Shoes shoes4L = new Shoes("Hot", "Casual","Neutral", af1L, 0.0);
		allList.add(shoes3L);

		img = null;
		try {
			img = ImageIO.read(new File("res/af1R.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage af1R = new PImage(img);
		Shoes shoes4R = new Shoes("Hot", "Casual","Neutral", af1R, 0.0);
		allList.add(shoes4R);
		
		img = null;
		try {
			img = ImageIO.read(new File("res/drmartensL.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage drmartensL = new PImage(img);
		Shoes shoes5L = new Shoes("Cold", "Semi-Formal","Neutral", drmartensL, 0.0);
		allList.add(shoes5L);

		img = null;
		try {
			img = ImageIO.read(new File("res/drmartensR.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage drmartensR = new PImage(img);
		Shoes shoes5R = new Shoes("Cold", "Semi-Formal","Neutral", drmartensR, 0.0);
		allList.add(shoes5R);
		
		

	}

	/**
	 * Sorts the ArrayList with all the shoes into the sorted ArrayList
	 */
	public void sortArray() {
		for (Shoes s : allList) {
			if (s.getWeather().equals(weatherCondition))
				sortedList.add(s);
		}
		for (int i = 0; i < sortedList.size(); i++) {
			Shoes s = sortedList.get(i);
			if (!s.getFormality().equals(formality)) {
				sortedList.remove(i);
				i--;
			}
		}
		for (int i = 0; i < sortedList.size(); i++) {
			Shoes s = sortedList.get(i);
			if (!s.getExpression().equals(gender) && !gender.equals("Neutral")) {
				sortedList.remove(i);
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
		int index = (int) (Math.random() * sortedList.size());
		while (sortedList.get(index) == null) {
			index = (int) (Math.random() * sortedList.size());
		}
		return sortedList.get(index);
	}

	/**
	 * Picks the next shoe based on the selected filters
	 * 
	 * @return The image of the shoe picked
	 */
	public Shoes pickNextEntry() {

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
	public void setFormalityType (String w) {
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
