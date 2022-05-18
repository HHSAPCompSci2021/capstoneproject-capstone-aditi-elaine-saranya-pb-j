package mannequin.clothes;

import java.awt.Color;
import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;

/**
 * The Shoes class represents an Shoe to be added to the screen using the
 * Processing library. It is a subclass of the Clothes class.
 * 
 * @author
 * @version 5/18/2022
 */
public class Shoes extends Clothes {

	private PImage image;
	private Color color;
	private String side;

	/**
	 * Constructs a shoe with specified image
	 * 
	 * @param w The weather filter
	 * @param i The image of the shoe
	 */
	public Shoes(String w, String f, String g, PImage i, double p, String s) {
		super(w, f, g, p);
		image = i;
		color = null;
		side = s;
	}

	/**
	 * Returns the image of the top
	 * 
	 * @return the image of the top
	 */
	public PImage getImage() {
		return image;
	}

	/**
	 * Sets the color of the shoes
	 * 
	 * @param c the color to change to
	 */
	public void setColor(String c) {
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
		else if (c.equals("None"))
			color = null;
	}

	/**
	 * @return the color of the shoes
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * Returns whether it is a right shoe or a left shoe
	 * 
	 * @return side of shoe
	 */
	public String getSide() {
		return side;
	}
}
