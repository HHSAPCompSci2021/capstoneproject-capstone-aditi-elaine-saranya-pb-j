package mannequin.clothes;

import java.awt.Color;
import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;

/**
 * The Bottom class represents an Bottom to be added to the screen using
 * the Processing library. It is a subclass of the Clothes class.
 * 
 * @author 
 * @version 5/17/2022
 */
public class Bottom extends Clothes {

	private PImage image;
	private Color color;
	private double price;
	
	/**
	 * Constructs a bottom with specified image
	 * 
	 * @param w The weather filter
	 * @param i The image of the bottom
	 * @param f The formality of the bottom
	 * @param g The gender of the person
	 */
	public Bottom(String w, PImage i, String f, String g, double p) {
		super(w, f, g);
		image = i;
		color = null;
		price = p;
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

	
	/**
	 * Sets the color of the bottom
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
	 * @return the color of the bottom
	 */
	public Color getColor() {
		return color;
	}

}


