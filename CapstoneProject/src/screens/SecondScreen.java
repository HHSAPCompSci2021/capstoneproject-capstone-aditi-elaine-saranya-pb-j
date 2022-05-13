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
		super(600, 800);
		this.surface = surface;
		person = new Person();
	}


	public void setup() {
		surface.background(255);
	}
	public Person getPerson() {
		return person;
	}
	/**
	 * Draws the Screen to the given DrawingSurface
	 * @pre The Screen will be drawn with attributes previously set on the given PApplet.
	 */
	public void draw() {
		surface.fill(112, 110, 250);
		surface.noStroke();
		surface.rect(25, 75, 150, 80);		
		surface.fill(255);
		surface.textSize(15);
		surface.text("Settings:", 50, 100);
		surface.text("Weather: " + person.getClothes().getWeather(), 50, 130);
		person.draw(surface);
	}
}
	
