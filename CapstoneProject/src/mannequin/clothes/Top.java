package mannequin.clothes;

import java.awt.Color;
import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;

/**
 * The Top class represents an Top to be added to the screen using the
 * Processing library. It is a subclass of the Clothes class.
 * 
 * @author
 * @version 5/18/2022
 */
public class Top extends Clothes {

	private PImage image;
	private Color color;

	/**
	 * Constructs a top with specified image
	 * 
	 * @param w The weather filter
	 * @param i The image of the top
	 */
	public Top(String w, String f, String g, PImage i, double p, String l) {
		super(w, f, g, p, l);
		image = i;
		color = null;
	}

	/**
	 * Sets the price of the top
	 * 
	 * @param p the price of the top to be set
	 */
	public void setPrice(double p) {
		// TODO Auto-generated method stub

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
	 * Sets the color of the top
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
	 * 
	 * @return the color of the top
	 */
	public Color getColor() {
		return color;
	}

}
