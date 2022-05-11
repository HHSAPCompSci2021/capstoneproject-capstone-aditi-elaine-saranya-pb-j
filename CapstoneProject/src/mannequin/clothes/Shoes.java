package mannequin.clothes;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;

/**
 * The Shoes class represents an Shoe to be added to the screen using
 * the Processing library. It is a subclass of the Clothes class.
 * 
 * @author Saranya
 * @version 5/6/2022
 */
public class Shoes extends Clothes {

	
	
	
	/**
	 * Constructs an shoe with specified image
	 * 
	 * @param image The image of the shoe
	 */
	public Shoes() {
	
	}

	/**
	 * Graphical UI Displays an image (format PImage) of specific shoes based on
	 * chosen filters This supports interaction with the screen using mouse clicks in
	 * the window.
	 * 
	 * @pre Properties affecting shoes are set on marker
	 * @param marker The PApplet used for displaying the image and drawing
	 */
	public void draw(PApplet marker) {

	}

	/**
	 * Gets the price of the shoes
	 * 
	 * @return price The price of the shoes
	 */
	public double getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setPrice(double p) {
		// TODO Auto-generated method stub
		
	}

	

}
