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
 * @version 5/17/2022
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
		weatherCondition = "Hot";
		formality = "Casual";
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
		Bottom bottom1 = new Bottom("Cold",whitePants,  "Formal", "Neutral");
		allList.add(bottom1);

		img = null;
		try {
			img = ImageIO.read(new File("res/beigepants.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage beigePants = new PImage(img);
		Bottom bottom2 = new Bottom("Cold", beigePants,"Formal", "Neutral");
		allList.add(bottom2);

		img = null;
		try {
			img = ImageIO.read(new File("res/blackpants.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage blackPants = new PImage(img);
		Bottom bottom3 = new Bottom("Cold",blackPants,"Semi-Formal", "Neutral");
		allList.add(bottom3);

		img = null;
		try {
			img = ImageIO.read(new File("res/blueflarejeans.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage blueFlareJeans = new PImage(img);
		Bottom bottom4 = new Bottom("Cold",blueFlareJeans,"Casual", "Feminine");
		allList.add(bottom4);

		img = null;
		try {
			img = ImageIO.read(new File("res/bluejeans.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage blueJeans = new PImage(img);
		Bottom bottom5 = new Bottom("Hot",blueJeans,"Casual", "Neutral");
		allList.add(bottom5);

		img = null;
		try {
			img = ImageIO.read(new File("res/bluejeanswithrips.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage blueJeansWRips = new PImage(img);
		Bottom bottom6 = new Bottom("Hot",blueJeansWRips,"Casual", "Feminine");
		allList.add(bottom6);

		img = null;
		try {
			img = ImageIO.read(new File("res/blacksweats.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage blackSweats = new PImage(img);
		Bottom bottom7 = new Bottom("Cold",blackSweats,"Casual", "Neutral");
		allList.add(bottom7);
		
		img = null;
		try {
			img = ImageIO.read(new File("res/darkblueshorts.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage darkBlueShorts = new PImage(img);
		Bottom bottom8 = new Bottom("Hot",darkBlueShorts,"Casual", "Feminine");
		allList.add(bottom8);
		
		img = null;
		try {
			img = ImageIO.read(new File("res/lightblueshorts.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage lightBlueShorts = new PImage(img);
		Bottom bottom9 = new Bottom("Hot",lightBlueShorts,"Casual", "Feminine");
		allList.add(bottom9);
		
		img = null;
		try {
			img = ImageIO.read(new File("res/blueflarejeans.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage blueFlareJeans2 = new PImage(img);
		Bottom bottom10 = new Bottom("Cold",blueFlareJeans2,"Formal", "Feminine");
		allList.add(bottom10);
		
		img = null;
		try {
			img = ImageIO.read(new File("res/blackshorts.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage blackshorts = new PImage(img);
		Bottom bottom11 = new Bottom("Hot",blackshorts,"Formal", "Feminine");
		allList.add(bottom11);
		
		img = null;
		try {
			img = ImageIO.read(new File("res/blackskirt.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage blackskirt = new PImage(img);
		Bottom bottom12 = new Bottom("Hot",blackskirt,"Formal", "Feminine");
		allList.add(bottom12);
		
		
		
		

	}

	/**
	 * Sorts the ArrayList with all the bottoms into the sorted ArrayList
	 */
	public void sortArray() {
		for (Bottom b : allList) {
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
