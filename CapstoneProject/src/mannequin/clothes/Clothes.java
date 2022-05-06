package mannequin.clothes;

import java.awt.Color;
import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;

/**
 * The Clothes class represents Clothes that can be displayed using the
 * Processing library.
 * 
 * @author
 * @version 5/6/2022
 */
public abstract class Clothes extends PApplet {

	private ArrayList<PImage> clothes;
	private Color color;
	private String weather;
	private String formality;
	private double price;
	private String website;

	/**
	 * Sets all filters to their default value
	 */
	public Clothes() {

	}

	/**
	 * Adds an image of an article of clothing to the user's wardrobe
	 * @param image The image of the article of clothing to be added
	 */
	public void add(PImage image) {

	}

	/**
	 * Graphical UI Displays an image (format PImage) of specific articles of
	 * clothing based on chosen filters. This supports interaction with the screen
	 * using mouse clicks in the window.
	 * 
	 * @pre Properties affecting clothes are set on marker
	 * @param marker The PApplet used for displaying the image and drawing
	 */
	public abstract void draw(PApplet drawer);

	/**
	 * Picks a random article of clothing based on the selected filters
	 * 
	 * @return The image of the article of clothing picked
	 */
	public PImage pickRandom() {
		return null;
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
	public String getWeather() {
		return weather;
	}

	/**
	 * Sets the weather
	 * 
	 * @param w The weather
	 */
	public void setWeather(String w) {
		weather = w;
	}

	/**
	 * Gets the formality of the article of clothing
	 * 
	 * @return formality The formality of the article of clothing
	 */
	public String getFormality() {
		return formality;
	}

	/**
	 * Sets the formality for the clothes
	 * 
	 * @param f The formality for the article of clothing
	 */
	public void setFormality(String f) {
		formality = f;
	}

	/**
	 * Gets the price of the article of clothing
	 * 
	 * @return price The price of the article of clothing
	 */
	public double getPrice() {
		return price;
	}

}
