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
	GDropList listTemp;
	GDropList listFormality;
	GDropList listExpression;

	
	public void setup() {
		G4P.setInputFont("Times New Roman", G4P.PLAIN, 14); // New for G4P V4.3
		  G4P.setGlobalColorScheme(GCScheme.BLUE_SCHEME);
		  // Some start text

		  listTemp = new GDropList(surface, 100, 300, 100, 100, 0);
		  listTemp.setItems(new String[] {"Hot", "Cold"}, 0);
		  listFormality = new GDropList(surface, 250, 300, 100, 100, 0);
		  listFormality.setItems(new String[] {"Casual", "Black-tie", "Business Casual"}, 0);
		  listExpression = new GDropList(surface, 400, 300, 100, 100, 0);
		  listExpression.setItems(new String[] {"Feminine", "Masculine", "Neutral"}, 0);
		  
	}
	/**
	 * Draws the Screen to the given DrawingSurface
	 * @pre The Screen will be drawn with attributes previously set on the given PApplet.
	 */
	public void draw() {
		surface.background(255);
		surface.fill(112, 110, 250);
		surface.noStroke();
		surface.rect(166, 75, 290,44);
		surface.fill(255);
		surface.textSize(20);
		surface.text("Random Outfit Generator", 190, 103);
		surface.textSize(13);
		surface.fill(112, 110, 250);
		surface.text("Please enter the settings to help us better generate an outfit for you", 100, 150);
		surface.text("Temperature", 105, 295);
		surface.text("Formality", 270, 295);
		surface.text("Expression", 413, 295);

	}
	public void handleDropListEvents(GDropList list, GEvent event) {
		System.out.println("Item selected:" + list.getSelectedText());
	}




	
}
