package mannequin.clothes;

import java.awt.Color;
import java.util.ArrayList;

import g4p_controls.G4P;
import processing.core.PApplet;
import processing.core.PImage;

/**
 * The Accessory class represents an Accessory to be added to the screen using
 * the Processing library. It is a subclass of the Clothes class.
 * 
 * @author Aditi
 * @version 5/20/2022
 */
public class Accessory extends Clothes {

	private PImage image;
	private int color;

	/**
	 * Constructs an accessory with specified image
	 * 
	 * @param w The weather filter
	 * @param i The image of the accessory
	 * @param f The formality of the accessory
	 * @param g The gender of the person
	 * @param p The price of the accessory
	 * @param l The link to the website to buy the outfit
	 * 
	 */
	public Accessory(String w, String f, String g, PImage i, double p, String l) {
		super(w, f, g, p, l);
		image = i;
		color = -1;
	}

	/**
	 * Returns the image of the accessory
	 * 
	 * @return the image of the accessory
	 */
	public PImage getImage() {
		return image;
	}

	/**
	 * Sets the color of the accessory
	 * 
	 */
	public void setColor() {
		color = G4P.selectColor(0, 0, 0);
	}

	/**
	 * Gets the color of the accessory
	 * @return the color of the accessory
	 */
	public int getColor() {
		return color;
	}

}
