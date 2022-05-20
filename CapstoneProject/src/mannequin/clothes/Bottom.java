package mannequin.clothes;

import java.awt.Color;
import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;

/**
 * The Bottom class represents an Bottom to be added to the screen using the
 * Processing library. It is a subclass of the Clothes class.
 * 
 * @author
 * @version 5/18/2022
 */
public class Bottom extends Clothes {

	private PImage image;
	private Color color;

	/**
	 * Constructs a bottom with specified image
	 * 
	 * @param w The weather filter
	 * @param i The image of the bottom
	 * @param f The formality of the bottom
	 * @param g The gender of the person
	 */
	public Bottom(String w, PImage i, String f, String g, double p, String l) {
		super(w, f, g, p, l);
		image = i;
		color = null;
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
	 * Sets the color of the bottom
	 * 
	 * @param c the color to change to
	 */
	public void setColor(String c) {
		if (c.equals("Blue"))
			color = Color.BLUE;
		else if (c.equals("Black"))
			color = Color.BLACK;
		else if (c.equals("Red"))
			color = Color.RED;
		else if (c.equals("White"))
			color = Color.WHITE;
		else if (c.equals("Red"))
			color = Color.red;
		else if (c.equals("Green"))
			color = Color.GREEN;
		else if (c.equals("Purple"))
			color = Color.MAGENTA;
		else if (c.equals("Pink"))
			color = Color.PINK;
		else if (c.equals("Yellow"))
			color = Color.YELLOW;
		else if (c.equals("Orange"))
			color = Color.ORANGE;
		else if (c.equals("None"))
			color = null;
	}

	/**
	 * @return the color of the bottom
	 */
	public Color getColor() {
		return color;
	}

}
