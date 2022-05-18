package screens;

import java.awt.Point;
import java.awt.Rectangle;

import core.DrawingSurface;
import g4p_controls.*;
import mannequin.Person;
import processing.core.PApplet;

/**
 * The First Screen class represents the menu screen where the user sets the settings of the outfit
 * @author Elaine
 * @version 5/13/2022
 *
 */
public class FirstScreen extends Screen {
	private DrawingSurface surface;
	
	/**
	 * Constructs the FirstScreen (the menu screen)
	 * @param surface The DrawingSurface to draw the first screen on
	 */
	public FirstScreen(DrawingSurface surface) {
		super(800,800);
		this.surface = surface;

	}
	private GDropList listTemp;
	private GDropList listFormality;
	private GDropList listExpression;
	
	private GButton submit;

	/**
	 * Sets up the first screen and all the dropdown menus and submit button on the screen
	 */
	public void setup() {
		G4P.setInputFont("Times New Roman", G4P.PLAIN, 14); // New for G4P V4.3
		  G4P.setGlobalColorScheme(GCScheme.BLUE_SCHEME);
		  // Some start text

		  listTemp = new GDropList(surface, 200, 300, 100, 100, 0);
		  listTemp.setItems(new String[] {" ", "Hot", "Cold"}, 0);
		  submit = new GButton(surface,350, 500, 100, 40, "Submit");
		  listFormality = new GDropList(surface, 350, 300, 100, 100, 0);
		  listFormality.setItems(new String[] {" ", "Casual", "Formal", "Semi-Formal"}, 0);
		  listExpression = new GDropList(surface, 500, 300, 100, 100, 0);
		  listExpression.setItems(new String[] {"Neutral","Feminine", "Masculine"}, 0);
	}
	
	/**
	 * Changes the visibility of the dropdown lists and buttons to what is specified
	 * @param v the visibility of the lists, true if on, false if off
	 */
	public void setVisibility(boolean v) {
		listTemp.setVisible(v);
		submit.setVisible(v);
		listFormality.setVisible(v);
		listExpression.setVisible(v);
	}
	
	
	
	/**
	 * Draws the Screen to the given DrawingSurface
	 * @pre The Screen will be drawn with attributes previously set on the given PApplet.
	 */
	public void draw() {
		surface.background(255);
		surface.fill(112, 110, 250);
		surface.noStroke();
		surface.rect(266, 75, 290,44);
		surface.fill(255);
		surface.textSize(20);
		surface.text("Random Outfit Generator", 290, 103);
		surface.textSize(13);
		surface.fill(112, 110, 250);
		surface.text("Please enter the settings to help us better generate an outfit for you", 200, 150);
		surface.text("Temperature", 205, 295);
		surface.text("Formality", 370, 295);
		surface.text("Expression", 513, 295);

	}

	/**
	 * Handles all the button events on the second screen and acts accordingly
	 * @param button the button that was pressed 
	 * @param event what has happened to the button
	 * @return returns true if the submit button was clicked, false if not
	 */
	public boolean handleButtonEvents(GButton button, GEvent event) {
		// Create the control window?
		if (button == submit && event == GEvent.CLICKED) {
			return true;
		}
		return false;
		
	}

	
	public boolean handleDropListEvents (GDropList list, GEvent event, Person p) {
		if (list == listTemp) {
			p.setWeatherCondition(list.getSelectedText());
			return true;
		}
		if (list == listFormality) {
			p.setFormalityType(list.getSelectedText());
			return true;
		}
		if (list == listExpression) {
			p.setGenderExpression(list.getSelectedText());
			return true;
		}
		return false;
	}


	
}
