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
 * @version 5/20/2022
 */
public class Clothes extends PApplet {

	private String weather;
	private String formality;
	private String gender;
	private double price;
	private String link;

	
	/**
	 * Sets all filters to their default value
	 * @param w The weather that article of clothing fits under
	 * @param formal The formality that article of clothing fits under
	 * @param gen The gender expression that article of clothing fits under
	 * @param p The price of the article of clothing
	 * @param l The link of where to find this article of clothing
	 */
	public Clothes(String w, String formal, String gen, double p, String l) {

		weather = w;
		formality = formal;
		gender = gen;
		price = p;
		link = l;
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
		System.out.println(weather);
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
	 * Gets the gender expression of the article of clothing
	 * 
	 * @return formality The gender expression of the article of clothing
	 */
	public String getExpression() {
		return gender;
	}

	/**
	 * Sets the gender expression for the clothes
	 * 
	 * @param g The gender expression for the article of clothing
	 */
	public void setExpression(String g) {
		gender = g;
	}

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
	 * 
	 * @return cost The total cost of the outfit
	 */
	public double calcTotalPrice() {
		return 0.0;
	}
	
	/**
	 * 
	 * @return the link of that article of clothing
	 */
	public String getLink() {
		return link;
	}

}
