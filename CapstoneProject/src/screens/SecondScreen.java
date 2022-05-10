package screens;

import java.awt.Rectangle;

import core.DrawingSurface;

/**
 * The Second Screen class represents the program screen where the mannequin and outfit are displayed
 * @author Elaine
 * @version 5/6/2022
 *
 */
public class SecondScreen extends Screen {
	
	private DrawingSurface surface;
	
	private Rectangle screenRect;


	/**
	 * Constructs the SecondScreen (the program screen)
	 * @param surface The DrawingSurface to draw the second screen on
	 */
	public SecondScreen(DrawingSurface surface) {
		super(0,0);
		this.surface = surface;
	}


	public void setup() {
	}
	/**
	 * Draws the Screen to the given DrawingSurface
	 * @pre The Screen will be drawn with attributes previously set on the given PApplet.
	 */
	public void draw() {
		
	}
}
	
