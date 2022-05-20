package mannequin.clothes;

import java.awt.Color;
import java.util.ArrayList;

import g4p_controls.G4P;
import processing.core.PApplet;
import processing.core.PImage;

/**
 * The Top class represents an Top to be added to the screen using the
 * Processing library. It is a subclass of the Clothes class.
 * 
 * @author Saranya
 * @version 5/20/2022
 */
public class Top extends Clothes {

	private PImage image;
	private int color;

	/**
	 * Constructs a top with specified image
	 * 
	 * @param w The weather filter
	 * @param i The image of the top
	 * @param f The formality of the accessory
	 * @param g The gender of the person
	 * @param p The price of the accessory
	 * @param l The link to the website to buy the outfit
	 */
	public Top(String w, String f, String g, PImage i, double p, String l) {
		super(w, f, g, p, l);
		image = i;
		color = -1;
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
	 */
	public void setColor() {
		color = G4P.selectColor(0, 0, 0);
	}

	/**
	 * Gets the color of the top
	 * @return the color of the top
	 */
	public int getColor() {
		return color;
	}

}
