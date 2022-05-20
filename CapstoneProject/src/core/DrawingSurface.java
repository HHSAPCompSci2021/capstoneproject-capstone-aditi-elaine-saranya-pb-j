package core;
import java.awt.Point;
import java.util.ArrayList;

import g4p_controls.GButton;
import g4p_controls.GDropList;
import g4p_controls.GEvent;
import mannequin.Person;
import processing.core.PApplet;
import screens.FirstScreen;
import screens.Screen;
import screens.ScreenSwitcher;
import screens.SecondScreen;


public class DrawingSurface extends PApplet implements ScreenSwitcher {

	private Screen activeScreen;
	private FirstScreen screen1;
	private SecondScreen screen2;
	public float ratioX, ratioY;
	private boolean first;
	private boolean valid;
	
	public DrawingSurface() {
		
		first = true;
		screen1 = new FirstScreen(this);

		
		screen2 = new SecondScreen(this);

		valid = true;
		
		activeScreen = screen1;
		
	}
	
	public void setup() {
		super.setup();
		screen1.setup();
		screen2.setup();
		screen2.setVisibility(false);
	}
	
	public void draw() {

		ratioX = (float)width/activeScreen.DRAWING_WIDTH;
		ratioY = (float)height/activeScreen.DRAWING_HEIGHT;

		push();
		
		scale(ratioX, ratioY);
		activeScreen.draw();
		
		if (!valid) {
			fill(255, 0, 0);
			text("Sorry, at the moment, we are unable to generate an outfit with these settings", 200, 700);
		}
		
		pop();
	}
	
	
	public void mousePressed() {
		if (activeScreen == screen2)
			screen2.mousePressed();
	}
	
	public void switchScreen(int i) {
		if (i == 0) {
			SecondScreen secondScreen = (SecondScreen)activeScreen;
			secondScreen.setVisibility(false);
			activeScreen = screen1;
			FirstScreen firstScreen = (FirstScreen)activeScreen;
			firstScreen.setVisibility(true);
		}
		else {
			FirstScreen firstScreen = (FirstScreen)activeScreen;
			firstScreen.setVisibility(false);
			activeScreen = screen2;
			SecondScreen secondScreen = (SecondScreen)activeScreen;
			secondScreen.setVisibility(true);
			screen2.getPerson().getTopsList().sortArray();
			screen2.getPerson().getBottomsList().sortArray();
			screen2.getPerson().getAccessoriesList().sortArray();
			screen2.getPerson().getShoesList().sortArray();

			if (!screen2.getPerson().ifNotValid())	{
				screen2.getPerson().setClothes(); 
				valid = true;
			}
			else {
				secondScreen.setVisibility(false);
				activeScreen = screen1;
				firstScreen.setVisibility(true);
				valid = false;
				first = true;
				
			}

		}
		activeScreen.setup();
	}
	
	public void handleDropListEvents(GDropList list, GEvent event) {
		if (!screen1.handleDropListEvents(list, event, screen2.getPerson()))
			screen2.handleDropListEvents(list, event);
	}
	

	public void handleButtonEvents(GButton button, GEvent event) {
		// Create the control window?

		if(screen1.handleButtonEvents(button, event) && first) {
			first = false;
			switchScreen(1);
			
		}
		else {
			screen2.handleButtonEvents(button, event);
		}
		
	}

}
