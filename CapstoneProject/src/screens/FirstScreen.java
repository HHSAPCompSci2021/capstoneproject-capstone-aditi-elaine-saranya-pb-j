package screens;

import java.awt.Color;
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
 * @version 5/20/2022
 *
 */
public class FirstScreen extends Screen {
	private DrawingSurface surface;
	private PImage background;
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
	
	private GImageButton submit;

	/**
	 * Sets up the first screen and all the dropdown menus and submit button on the screen
	 */
	public void setup() {
		String[] submitTxt=new String[]{"res/submitbutton.png"};

		G4P.setInputFont("Times New Roman", G4P.PLAIN, 14); // New for G4P V4.3
		G4P.setGlobalColorScheme(G4P.GREEN_SCHEME);
		  background.resize(800, 800);
		  // Some start text
		  listTemp = new GDropList(surface, 200, 300, 100, 100, 0);
		  listTemp.setItems(new String[] {" ", "Hot", "Cold"}, 0);
		  //submit2=new GImageButton(surface, 350, 500, submitTxt, "submitbutton.png");
		  submit = new GImageButton(surface,300, 600, 175, 75, submitTxt);
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

 		surface.image(background, 0, 0);
 		surface.image(title, 150, 150);
 		surface.image(instructions, 20, 600);
		surface.fill(133, 94, 66);
		surface.noStroke();
	
		surface.textSize(20);
		surface.fill(133, 94, 66);
		surface.rect(185, 270, 145, 35);
		surface.fill(255);
		surface.text("Temperature", 195, 295);
		
		surface.fill(133, 94, 66);
		surface.rect(359, 270, 112, 35);
		surface.fill(255);		
		surface.text("Formality", 370, 295);
		
		surface.fill(133, 94, 66);
		surface.rect(503, 270, 122, 35);
		surface.fill(255);		
		surface.text("Expression", 513, 295);

	}

	/**
	 * Handles all the button events on the second screen and acts accordingly
	 * @param button the button that was pressed 
	 * @param event what has happened to the button
	 * @return returns true if the submit button was clicked, false if not
	 */
	public boolean handleImageButtonEvents(GImageButton button) {
		// Create the control window?		
		if (button == submit) {
			return true;
		}
		return false;
		
	}

	
	/**
	 * Handles all the dropdown lists on the second screen and acts accordingly
	 * @param list dropdown list that was pressed
	 * @param event what has happened to the drop down list
	 * @param p the person
	 */
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
