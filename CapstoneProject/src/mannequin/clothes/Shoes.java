package mannequin.clothes;

import java.awt.Color;
import java.util.ArrayList;

import g4p_controls.G4P;
import processing.core.PApplet;
import processing.core.PImage;

/**
 * The Shoes class represents an Shoe to be added to the screen using the
 * Processing library. It is a subclass of the Clothes class.
 * 
 * @author Saranya
 * @version 5/20/2022
 */
public class Shoes extends Clothes {

	private PImage image;
	private int color;
	private String side;

	/**
	 * Constructs a shoe with specified image
	 * 
	 * @param w The weather filter
	 * @param i The image of the shoe
	 * @param f The formality of the accessory
	 * @param g The gender of the person
	 * @param p The price of the accessory
	 * @param s The side of the shoe, right or left
	 * @param l The link to the website to buy the outfit
	 */
	public Shoes(String w, String f, String g, PImage i, double p, String s, String l) {
		super(w, f, g, p, l);
		image = i;
		color = -1;
		side = s;
	}

	/**
	 * Returns the image of the shoe
	 * 
	 * @return the image of the shoe
	 */
	public PImage getImage() {
		return image;
	}


	/**
	 * Sets the color of the shoe
	 * 
	 */
	public void setColor() {
		color = G4P.selectColor(0, 0, 0);
	}

	/**
	 * Gets the color of the shoe
	 * @return the color of the shoe
	 */
	public int getColor() {
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
