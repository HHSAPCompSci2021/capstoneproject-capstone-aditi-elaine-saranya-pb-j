package screens;

import java.awt.Rectangle;

import core.DrawingSurface;
import g4p_controls.G4P;
import g4p_controls.GButton;
import g4p_controls.GCScheme;
import g4p_controls.GDropList;
import g4p_controls.GEvent;
import mannequin.Person;

/**
 * The Second Screen class represents the program screen where the mannequin and outfit are displayed
 * @author Elaine
 * @version 5/13/2022
 *
 */
public class SecondScreen extends Screen {
	
	private DrawingSurface surface;
	
	private Person person; 

	private GDropList colorAccessory, colorTop, colorBottom, colorShoes;
	private GButton top, bottom, shoes, accessories, random;

	/**
	 * Constructs the SecondScreen (the program screen)
	 * @param surface The DrawingSurface to draw the second screen on
	 */
	public SecondScreen(DrawingSurface surface) {
		super(600, 800);
		this.surface = surface;
		person = new Person();
	}

	/**
	 * Sets up the second screen and all the all the buttons to change the outfit
	 */
	public void setup() {
		surface.background(255);
		G4P.setInputFont("Times New Roman", G4P.PLAIN, 13); // New for G4P V4.3
		G4P.setGlobalColorScheme(GCScheme.BLUE_SCHEME);
		//Some start text
		colorAccessory = new GDropList(surface, 50, 300, 100, 100, 0);
		colorAccessory.setItems(new String[] {"Black", "Blue", "Green", "Purple", "Orange", "Pink", 
				"Red", "White", "Yellow"}, 0);	
		colorTop = new GDropList(surface, 50, 400, 100, 100, 0);
		colorTop.setItems(new String[] {"Black", "Blue", "Green", "Purple", "Orange", "Pink", 
				"Red", "White", "Yellow"}, 0);	
		colorBottom = new GDropList(surface, 50, 500, 100, 100, 0);
		colorBottom.setItems(new String[] {"Black", "Blue", "Green", "Purple", "Orange", "Pink", 
				"Red", "White", "Yellow"}, 0);	
		colorShoes = new GDropList(surface, 50, 600, 100, 100, 0);
		colorShoes.setItems(new String[] {"Black", "Blue", "Green", "Purple", "Orange", "Pink", 
				"Red", "White", "Yellow"}, 0);	
		top = new GButton(surface,450, 400, 80, 40, "Top");
		bottom = new GButton(surface,450, 500, 80, 40, "Bottom");
		shoes = new GButton(surface, 450, 600, 80, 40, "Shoes");
		accessories = new GButton(surface, 450, 300, 80, 40, "Accessories");
		random = new GButton(surface, 200, 30, 300, 60, "Randomly Generate");
		

	}
	
	/**
	 * Changes the visibility of the dropdown lists and buttons to what is specified
	 * @param v the visibility of the lists, true if on, false if off
	 */
	public void setVisibility(boolean v) {
		top.setVisible(v);
		bottom.setVisible(v);
		shoes.setVisible(v);
		accessories.setVisible(v);
		random.setVisible(v);
		colorAccessory.setVisible(v);
		colorTop.setVisible(v);
		colorBottom.setVisible(v);
		colorShoes.setVisible(v);
	}
	
	/**
	 * Returns the person
	 * @return the person
	 */
	public Person getPerson() {
		return person;
	}
	/**
	 * Draws the Screen to the given DrawingSurface
	 * @pre The Screen will be drawn with attributes previously set on the given PApplet.
	 */
	public void draw() {
		surface.background(255);
		surface.fill(112, 110, 250);
		surface.noStroke();
		surface.rect(10, 25, 130, 70);		
		surface.fill(255);
		surface.textSize(15);
		surface.text("Settings:", 25, 50);
		surface.text("Weather: " + person.getWeatherCondition(), 25, 75);
		person.draw(surface);
		
	}
	
	/**
	 * Handles all the button events on the second screen and acts accordingly
	 * @param button the button that was pressed 
	 * @param event what has happened to the button
	 */
	public void handleButtonEvents(GButton button, GEvent event) {
		// Create the control window?

		if (button.getText().equals(top.getText())) {
			person.changeTop();
		}
		else if (button.getText().equals(bottom.getText())) {
			person.changeBottom();
		}
		else if (button.getText().equals(accessories.getText())) {
			person.changeAccessory();
		}
		else if (button.getText().equals(shoes.getText())) {
			person.changeShoes();
		}
		else if (button.getText().equals("Randomly Generate")) {
			person.pickRandom();
			
		}
	}
	
	public void handleDropListEvents (GDropList list, GEvent event) {
		if (list.getCY() == colorAccessory.getCY()) {
			person.getAccessory().setColor(list.getSelectedText());
		}
		else if (list.getCY() == colorTop.getCY()) {
			person.getTop().setColor(list.getSelectedText());
		}
		else if (list.getCY() == colorBottom.getCY()) {
			person.getBottom().setColor(list.getSelectedText());
		}
		else if (list.getCY() == colorShoes.getCY()) {
			person.getShoesLeft().setColor(list.getSelectedText());
			person.getShoesRight().setColor(list.getSelectedText());
		}
		
	}
}
	
