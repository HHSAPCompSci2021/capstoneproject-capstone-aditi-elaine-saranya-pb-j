package mannequin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;

/**
 * The Face class represents an image of a face
 * @author Aditi 
 * @version 5/20/2022
 *
 */
public class Face {
	
	private PImage image;
	
	/**
	 * Takes in user input to add a face
	 * @param img The image of the face
	 */
	public Face(PImage img) {
		image = img;
	}
	
	/**
	 * 
	 * @return the image of the face
	 */
	public PImage getImage() {
		return image;
	}
	
}