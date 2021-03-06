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
 * @version 5/20/2022
 *
 */
public class SecondScreen extends Screen {
	
	private DrawingSurface surface;
	
	private Person person; 

	private GButton top, bottom, shoes, accessories, random, face, colorTop, colorAccessory, colorBottom, colorShoes, menu;



	/**
	 * Constructs the SecondScreen (the program screen)
	 * @param surface The DrawingSurface to draw the second screen on
	 */
	public SecondScreen(DrawingSurface surface) {
		super(800, 800);
		this.surface = surface;
		person = new Person();
	}

	/**
	 * Sets up the second screen and all the all the buttons to change the outfit
	 */
	public void setup() {
		//surface.background(255);
		G4P.setInputFont("Times New Roman", G4P.PLAIN, 13); // New for G4P V4.3
		G4P.setGlobalColorScheme(GCScheme.GREEN_SCHEME);
		//Some start text
		colorAccessory = new GButton(surface, 50, 465, 100, 30, "Accessory Color");
		colorTop = new GButton(surface, 50, 535, 100, 30, "Top Color");
		colorBottom = new GButton(surface, 50, 605, 100, 30, "Bottom Color");
		colorShoes = new GButton(surface, 50, 675, 100, 30, "Shoes Color");	
		top = new GButton(surface,175, 530, 80, 40, "Top");
		bottom = new GButton(surface,175, 600, 80, 40, "Bottom");
		shoes = new GButton(surface, 175, 670, 80, 40, "Shoes");
		accessories = new GButton(surface, 175, 460, 80, 40, "Accessories");
		random = new GButton(surface, 50, 300, 210, 50, "Randomly Generate");
		face = new GButton(surface, 50, 380, 210, 50, "Face");
		menu = new GButton(surface, 50, 200, 210, 50, "Menu");

	

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
		face.setVisible(v);
		menu.setVisible(v);
		System.out.println(menu.isVisible());
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
		surface.fill(133, 94, 66);
		
	
		surface.noStroke();
		surface.rect(70, 45, 180, 140);		
		surface.fill(255);
		surface.textSize(15);
		surface.text("Settings:", 85, 70);
		surface.text("Weather: " + person.getWeatherCondition(), 85, 95);
		surface.text("Formality: " + person.getFormalityType(), 85, 120);
		surface.text("Expression: " + person.getGenderExpression(), 85, 145);
		surface.text("Total Price: $" + person.calculateTotalCost(), 85, 170);

		person.draw(surface);
		surface.fill(112, 110, 250);
		if (person.getAccessory() != null)
			surface.text("$" + person.getAccessory().getPrice(), 630, 100);
		surface.text("$" + person.getTop().getPrice(), 630, 250);
		surface.text("$" + person.getBottom().getPrice(), 630, 550);
		surface.text("$" + (person.getShoesLeft().getPrice() + person.getShoesRight().getPrice()), 630, 735);
		
	}
	
	
	/**
	 * Handles all the button events on the second screen and acts accordingly
	 * @param button the button that was pressed 
	 * @param event what has happened to the button
	 * @return Returns whether the button that is clicked is the menu button
	 */
	public boolean handleButtonEvents(GButton button, GEvent event) {
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
		else if (button.getText().equals(face.getText())) {
			person.changeFace();
		}

		else if (button.getText().equals(colorTop.getText()))
			person.getTop().setColor();
		else if (button.getText().equals(colorBottom.getText()))
			person.getBottom().setColor();
		else if (button.getText().equals(colorShoes.getText())) {
			person.getShoesLeft().setColor();
		}
		else if (button.getText().equals(colorAccessory.getText())) {
			if (person.getAccessory () != null)
				person.getAccessory().setColor();
		}
			
		else if (button.getText().equals(menu.getText()))
			return true;
		return false;

	}

	/**
	 * Checks if the mouse is pressed and acts accordingly
	 *
	 */
	public void mousePressed() {
		if (surface.mousePressed) {
			if (surface.mouseX > 392 && surface.mouseX < 471 && surface.mouseY > 72 && surface.mouseY < 151) {
				if (person.getAccessory() != null)
					surface.link(person.getAccessory().getLink());
			}
			else if (surface.mouseX > 360 && surface.mouseX < 500 && surface.mouseY > 140 && surface.mouseY < 340) {
					surface.link(person.getTop().getLink());
			}
			else if (surface.mouseX > 360 && surface.mouseX < 500 && surface.mouseY > 400 && surface.mouseY < 650) {
				surface.link(person.getBottom().getLink());
			}
			else if (surface.mouseX > 300 && surface.mouseX < 590 && surface.mouseY > 700 && surface.mouseY < 770) {
				surface.link(person.getShoesLeft().getLink());
			}
		}
	}
}
	
