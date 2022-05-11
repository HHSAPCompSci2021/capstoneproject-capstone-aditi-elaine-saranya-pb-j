package screens;

import java.awt.Rectangle;

import core.DrawingSurface;
import mannequin.Person;

/**
 * The Second Screen class represents the program screen where the mannequin and outfit are displayed
 * @author Elaine
 * @version 5/6/2022
 *
 */
public class SecondScreen extends Screen {
	
	private DrawingSurface surface;
	
	private Person person; 

	/**
	 * Constructs the SecondScreen (the program screen)
	 * @param surface The DrawingSurface to draw the second screen on
	 */
	public SecondScreen(DrawingSurface surface) {
		super(0,0);
		this.surface = surface;
	}


	public void setup() {
		surface.background(255);
	}
	/**
	 * Draws the Screen to the given DrawingSurface
	 * @pre The Screen will be drawn with attributes previously set on the given PApplet.
	 */
	public void draw() {
		surface.fill(0);
		surface.textSize(20);
		surface.text("Settings:", 100, 100);
		
	}
}
	
