package screens;

import java.awt.Point;
import java.awt.Rectangle;

import core.DrawingSurface;
import g4p_controls.*;
import processing.core.PApplet;

/**
 * The First Screen class represents the menu screen where the user sets the settings of the outfit
 * @author Elaine
 * @version 5/6/2022
 *
 */
public class FirstScreen extends Screen {
	private DrawingSurface surface;
	
	/**
	 * Constructs the FirstScreen (the menu screen)
	 * @param surface The DrawingSurface to draw the first screen on
	 */
	public FirstScreen(DrawingSurface surface) {
		super(600,800);
		this.surface = surface;

	}
	GDropList list;

	
	public void setup() {
		G4P.setInputFont("Times New Roman", G4P.PLAIN, 14); // New for G4P V4.3
		  G4P.setGlobalColorScheme(GCScheme.PURPLE_SCHEME);
		  // Some start text

		  list = new GDropList(surface, 100, 100, 100, 100, 0);
		  
		  
		  list.setItems(new String[] {"Item 1", "Item 2", "Item 3"}, 0);
		  
	}
	/**
	 * Draws the Screen to the given DrawingSurface
	 * @pre The Screen will be drawn with attributes previously set on the given PApplet.
	 */
	public void draw() {
		surface.background(255);
		surface.fill(173,216,230);
		surface.rect(175, 75, 575, 475);
		surface.fill(0);
		surface.textSize(20);
		surface.text("Random Outfit Generator", 200, 100);
	}
	public void handleDropListEvents(GDropList list, GEvent event) {
		System.out.println("Item selected:" + list.getSelectedText());
	}




	
}
