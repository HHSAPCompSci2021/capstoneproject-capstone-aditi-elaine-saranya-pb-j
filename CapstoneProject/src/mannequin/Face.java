package mannequin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;

/**
 * The Face class represents an image of a face
 * @author Aditi 
 * @version 5/6/22
 *
 */

public class Face {
	
	private ArrayList<PImage> faces;
	private PImage curFace;
	
	/**
	 * Takes in user input to add a face 
	 * @param facePic Image of face to add to possible face list
	 */
	public Face() {
		faces=new ArrayList<PImage>();
	}
	
	/**
	 * Randomly selects one of the available faces
	 */
	public void pickFace() {
		curFace=faces.get((int)Math.random()*faces.size());
		
	}
	
	
	/**
	 * draws the face
	 * @param marker The Processing PApplet on which one draws on
	 * @pre properties affecting the face are set on the marker
	 */
	public void draw(PApplet marker) {
		
	}

}
