package mannequin.clothes;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;

/**
 * The Bottom class represents an Bottom to be added to the screen using
 * the Processing library. It is a subclass of the Clothes class.
 * 
 * @author Saranya
 * @version 5/6/2022
 */
public class Bottom extends Clothes {

	private PImage image;
	
	
	/**
	 * Constructs an bottom with specified image
	 * 
	 * @param image The image of the bottom
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

	@Override
	public void setPrice(double p) {
		// TODO Auto-generated method stub
		
	}
	public PImage getImage() {
		return image;
	}


	}


