package mannequin.clothes;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import processing.core.PApplet;
import processing.core.PImage;

/**
 * The BottomList class represents a collection of all the Bottoms to be added to the screen using
 * the Processing library.
 * 
 * @author Saranya
 * @version 5/13/2022
 */
public class BottomsList extends PApplet{
	private ArrayList<Bottom> allList;
	private ArrayList<Bottom> sortedList;
	private String weatherCondition;
	
	private int currentIndex;
	
	
	/**
	 * Constructs a list of bottoms with an arraylist of all the bottoms and an arraylist that is sorted based on the user settings
	 */
	public BottomsList() {
		weatherCondition = "Hot";

		allList = new ArrayList<>();
		sortedList = new ArrayList<>();
		
		currentIndex = -1;

		BufferedImage img= null;
		try {
			img = ImageIO.read(new File("res/whitepants.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage whitePants = new PImage(img);
		Bottom bottom1 = new Bottom("Cold", whitePants);
		allList.add(bottom1);
		
		img= null;
		try {
			img = ImageIO.read(new File("res/beigepants.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage beigePants = new PImage(img);
		Bottom bottom2 = new Bottom("Cold", beigePants);
		allList.add(bottom2);
		
		img= null;
		try {
			img = ImageIO.read(new File("res/blackpants.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage blackPants = new PImage(img);
		Bottom bottom3 = new Bottom("Cold", blackPants);
		allList.add(bottom3);
		
		img= null;
		try {
			img = ImageIO.read(new File("res/blueflarejeans.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage blueFlareJeans = new PImage(img);
		Bottom bottom4 = new Bottom("Hot", blueFlareJeans);
		allList.add(bottom4);
		
		img= null;
		try {
			img = ImageIO.read(new File("res/bluejeans.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage blueJeans = new PImage(img);
		Bottom bottom5 = new Bottom("Hot", blueJeans);
		allList.add(bottom5);
		
		img= null;
		try {
			img = ImageIO.read(new File("res/bluejeanswithrips.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage blueJeansWRips = new PImage(img);
		Bottom bottom6 = new Bottom("Hot", blueJeansWRips);
		allList.add(bottom6);
				
		
	}

	/**
	 * Sorts the arraylist with all the bottoms into the sorted arraylist
	 */
	public void sortArray() {
		for (Bottom b: allList) {
			if (b.getWeather().equals(weatherCondition))
				sortedList.add(b);
		}
	}
	

	/**
	 * Picks a random bottom based on the selected filters
	 * 
	 * @return The image of the bottom picked
	 */
	public Bottom pickRandom() {
		int index = (int)(Math.random() * sortedList.size());
		while (sortedList.get(index) == null) {
			index = (int)(Math.random() * sortedList.size());
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
	 * @param w the weather
	 */
	public void setWeatherCondition(String w) {
		weatherCondition = w;
	}
	
	
}
 