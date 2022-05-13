package mannequin.clothes;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;

/**
 * The Bottom class represents an Bottom to be added to the screen using
 * the Processing library. It is a subclass of the Clothes class.
 * 
 * @author Saranya
 * @version 5/13/2022
 */
public class Bottom extends Clothes {

	private PImage image;
	
	
	/**
	 * Constructs a bottom with specified image
	 * 
	 * @param w The weather filter
	 * @param i The image of the bottom
	 */
	public Bottom(String w, PImage i) {
		super(w);
		image = i;
	}

	

	/**
	 * Gets the price of the bottom
	 * 
	 * @return price The price of the bottom
	 */
	public double getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * Sets the price of the bottom
	 * 
	 * @param p the price of the bottom to be set
	 */
	public void setPrice(double p) {
		// TODO Auto-generated method stub
		
	}
	/**
	 * Returns the image of the top
	 * @return the image of the top
	 */
	public PImage getImage() {
		return image;
	}


	}


