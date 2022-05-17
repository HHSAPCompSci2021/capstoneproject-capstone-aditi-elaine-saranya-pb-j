package mannequin.clothes;

import java.awt.Color;
import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;

/**
 * The Shoes class represents an Shoe to be added to the screen using
 * the Processing library. It is a subclass of the Clothes class.
 * 
 * @author 
 * @version 5/17/2022
 */
public class Shoes extends Clothes {

	
	private PImage image;
	private Color color;
	
	
	/**
	 * Constructs a shoe with specified image
	 * 
	 * @param w The weather filter
	 * @param i The image of the shoe
	 */
	public Shoes(String w, String f, String g, PImage i) {
		super(w,f,g);
		image = i;
		color = null;
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

	/**
	 * Sets the price of the shoes
	 * 
	 * @param p the price of the shoes to be set
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
	
	/**
	 * Sets the color of the shoes
	 * @param c the color to change to
	 */
	public void setColor (String c) {
		if (c.equals("Blue"))
			color = Color.blue;
		else if (c.equals("Black"))
			color = Color.black;
		else if (c.equals("Red"))
			color = Color.red;
		else if (c.equals("White"))
			color = Color.white;
		else if (c.equals("Red"))
			color = Color.red;
		else if (c.equals("Red"))
			color = Color.red;
		else if (c.equals("Green"))
			color = Color.green;
		else if (c.equals("Purple"))
			color = Color.magenta;
		else if (c.equals("Pink"))
			color = Color.pink;
		else if (c.equals("Yellow"))
			color = Color.yellow;
	}
	
	/**
	 * @return the color of the shoes
	 */
	public Color getColor() {
		return color;
	}
}



