package screens;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import core.DrawingSurface;
import g4p_controls.*;
import mannequin.Person;
import mannequin.clothes.Top;
import processing.core.PApplet;
import processing.core.PImage;

/**
 * The First Screen class represents the menu screen where the user sets the settings of the outfit
 * @author Elaine
 * @version 5/13/2022
 *
 */
public class FirstScreen extends Screen {
	private DrawingSurface surface;
	private PImage background;
	private PImage submitButton;
	private PImage title;
	private PImage instructions;
	
	/**
	 * Constructs the FirstScreen (the menu screen)
	 * @param surface The DrawingSurface to draw the first screen on
	 */
	public FirstScreen(DrawingSurface surface) {
		super(800,800);
		this.surface = surface;
		BufferedImage img = null;
		try {
			img = ImageIO.read(new File("res/background.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		background = new PImage(img);
		
		img=null;
		try {
			img = ImageIO.read(new File("res/submitbutton.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		submitButton=new PImage(img);
		
		img=null;
		try {
			img = ImageIO.read(new File("res/title.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		title=new PImage(img);
		
		img=null;
		try {
			img = ImageIO.read(new File("res/instructions.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		instructions=new PImage(img);

	}
	private GDropList listTemp;
	private GDropList listFormality;
	private GDropList listExpression;
	private GImageButton submit2;
	private String[] submitTxt=new String[]{"submitbutton.png"};
	
	private GButton submit;

	/**
	 * Sets up the first screen and all the dropdown menus and submit button on the screen
	 */
	public void setup() {
		
		G4P.setInputFont("Times New Roman", G4P.PLAIN, 14); // New for G4P V4.3

		  background.resize(800, 800);
		  submitButton.resize(150,100);
		  // Some start text
		  listTemp = new GDropList(surface, 200, 300, 100, 100, 0);
		  listTemp.setItems(new String[] {" ", "Hot", "Cold"}, 0);
		  //submit2=new GImageButton(surface, 350, 500, submitTxt, "submitbutton.png");
		  submit = new GButton(surface,350, 500, 140, 70, "Submit");
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
		System.out.println(listExpression.isVisible());
	}
	
	
	
	/**
	 * Draws the Screen to the given DrawingSurface
	 * @pre The Screen will be drawn with attributes previously set on the given PApplet.
	 */
	public void draw() {
		//surface.background(255);
		//background.resize(800, 800);
		//surface.background(background);
 		surface.image(background, 0, 0);
 		surface.image(submitButton, 345,500);
 		surface.image(title, 150, 150);
 		surface.image(instructions, 20, 600);
		surface.fill(133, 94, 66);
		surface.noStroke();
		//surface.rect(266, 75, 290,44);
		//surface.fill(255);
		//surface.textSize(20);
		//surface.text("Random Outfit Generator", 290, 103);
		surface.textSize(20);
		surface.fill(133, 94, 66);
		//surface.text("Please enter the settings to help us better generate an outfit for you", 200, 150);
		surface.text("Temperature", 205, 295);
		surface.fill(74, 53, 38);
		surface.text("Formality", 370, 295);
		surface.fill(176, 102, 49);
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
		if (button.getText().equals(submit.getText())) {
			return true;
		}
		return false;
		
	}

	
	public void handleDropListEvents (GDropList list, GEvent event, Person p) {
		if (list.getCX() == listTemp.getCX()) {
			p.setWeatherCondition(list.getSelectedText());
		}
		if (list.getCX() == listFormality.getCX()) {
			p.setFormalityType(list.getSelectedText());
		}
		if (list.getCX() == listExpression.getCX()) {
			p.setGenderExpression(list.getSelectedText());
		}
	}


	
}
