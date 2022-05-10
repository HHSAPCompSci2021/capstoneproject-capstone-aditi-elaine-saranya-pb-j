package mannequin.clothes;

import java.awt.Color;
import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;

/**
 * The Clothes class represents Clothes that can be displayed using the
 * Processing library.
 * 
 * @author Saranya
 * @version 5/6/2022
 */
public abstract class Clothes extends PApplet {

	private ArrayList<PImage> clothes;
	private Color color;
	//private String weather;
	private boolean temp; //false cold true hot
	//private String formality;
	//private int gender; //1 feminine 2 masculine 3 non-binary 
	private double price;
	private int typeOfClothing; //1 top 2 bottom 3 shoes 4 accessory 
	//private String website;

	/**
	 * Sets all filters to their default value
	 */
	public Clothes() {
		clothes=new ArrayList<PImage>();
		color=new Color(100,100,100);
		temp=false;
		//formality="casual";
		price= 0.0;
		//gender=1;
		

	}

	/**
	 * Adds an image of an article of clothing to the user's wardrobe
	 * @param image The image of the article of clothing to be added
	 * @param type the type of clothing article it is 
	 */
	public void add(PImage image, int type) {
		
	}

	/**
	 * Graphical UI Displays an image (format PImage) of specific articles of
	 * clothing based on chosen filters. This supports interaction with the screen
	 * using mouse clicks in the window.
	 * 
	 * @pre Properties affecting clothes are set on marker
	 * @param drawer The PApplet used for displaying the image and drawing
	 */
	public abstract void draw(PApplet drawer);

	/**
	 * Picks a random article of clothing based on the selected filters
	 * 
	 * @return The image of the article of clothing picked
	 */
	public PImage pickRandom(ArrayList<PImage> wardrobe) {
		int index = (int)(Math.random() * wardrobe.size());
		while (wardrobe.get(index) == null) {
			index = (int)(Math.random() * wardrobe.size());
		}
		return wardrobe.get(index);
	}

	/**
	 * Picks the next article of clothing based on the selected filters
	 * 
	 * @return The image of the article of clothing picked
	 */
	public PImage pickNextEntry() {
		return null;
	}

	/**
	 * Gets the color of the article of clothing
	 * 
	 * @return color The color of the article of clothing
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * Sets the color of the clothes
	 * 
	 * @param c The color of the article of clothing
	 */
	public void setColor(Color c) {
		color = c;
	}
	
	/**
	 * Gets the weather
	 * 
	 * @return weather The weather
	 */
	/*
	public String getWeather() {
		return weather;
	}*/

	/**
	 * Sets the weather
	 * 
	 * @param w The weather
	 */
	/*
	public void setWeather(String w) {
		weather = w;
	}*/

	/**
	 * Gets the formality of the article of clothing
	 * 
	 * @return formality The formality of the article of clothing
	 */
	/*
	public String getFormality() {
		return formality;
	}*/

	/**
	 * Sets the formality for the clothes
	 * 
	 * @param f The formality for the article of clothing
	 */
	/*
	public void setFormality(String f) {
		formality = f;
	}*/
	
	//these two methods are only for temporary use with hot and cold nothing else
	public boolean getTemp() {
		return temp;
	}
	
	public void setTemp(boolean temperature) {
		temp=temperature;
	}
	
	/**
	 * Gets the price of the article of clothing
	 * 
	 * @return price The price of the article of clothing
	 */
	public double getPrice() {
		return price;
	}
	
	public abstract void setPrice(double p);
	
	/**
	 * Calculates the price of the entire outfit
	 * @return cost The total outfits cost
	 */
	public double calcTotalPrice() {
		return 0.0;
	}

}
