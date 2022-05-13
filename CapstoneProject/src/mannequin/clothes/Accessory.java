package mannequin.clothes;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;

/**
 * The Accessory class represents an Accessory to be added to the screen using
 * the Processing library. It is a subclass of the Clothes class.
 * 
 * @author Saranya
 * @version 5/6/2022
 */
public class Accessory extends Clothes {

	

	/**
	 * Constructs an accessory with specified image
	 * 
	 * @param image The image of the accessory
	 */
	public Accessory(String w) {
		super(w);
	}

	



	/**
	 * Gets the price of the accessory
	 * 
	 * @return price The price of the accessory
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
