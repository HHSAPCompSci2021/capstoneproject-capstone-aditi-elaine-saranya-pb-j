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
 * @version 5/17/2022
 */
public class Clothes extends PApplet {


	private String weather; //{"Hot", "Cold"}
	private String formality;
	private String gender; //1 feminine 2 masculine 3 non-binary 
	private double price;

	//private String website;
	

	/**
	 * Sets all filters to their default value
	 * @param w The initial weather filter to be set
	 */
	public Clothes(String w, String formal, String gen) {
		
		weather=w;
		formality=formal;
		gender=gen;
		price= 0.0;


	}

	/**
	 * Adds an image of an article of clothing to the user's wardrobe
	 * @param image The image of the article of clothing to be added
	 */
	public void add(PImage image) {
		
	}



	
//	/**
//	 * Gets the color of the article of clothing
//	 * 
//	 * @return color The color of the article of clothing
//	 */
//	public Color getColor() {
//		return color;
//	}
//
//	/**
//	 * Sets the color of the clothes
//	 * 
//	 * @param c The color of the article of clothing
//	 */
//	public void setColor(Color c) {
//		color = c;
//	}
	
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
		System.out.println(weather);
	}

/*	/**
	 * Gets the formality of the article of clothing
	 * 
	 * @return formality The formality of the article of clothing
	 */
	/*
	public String getFormality() {
		return formality;
	}*/

/*	/**
	 * Sets the formality for the clothes
	 * 
	 * @param f The formality for the article of clothing
	 */
	
//	public void setFormality(String f) {
//		formality = f;
//	}
	

	
	/**
	 * Gets the price of the article of clothing
	 * 
	 * @return price The price of the article of clothing
	 */
	public double getPrice() {
		return price;
	}
	
	/**
	 * Sets the price of the article of clothing
	 * 
	 * @param p the price of the article of clothing to be set
	 */
	
	public void setPrice(double p) {
		price = p;
	}
	
	/**
	 * Calculates the price of the entire outfit
	 * @return cost The total cost of the outfit
	 */
	public double calcTotalPrice() {
		return 0.0;
	}

}
