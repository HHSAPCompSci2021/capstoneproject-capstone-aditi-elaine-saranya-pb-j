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
	private ArrayList<Screen> screens;
	public float ratioX, ratioY;
	private Person person;

	
	public DrawingSurface() {
		
		screens = new ArrayList<Screen>();
		
		
		FirstScreen screen1 = new FirstScreen(this);
		screens.add(screen1);
		
		SecondScreen screen2 = new SecondScreen(this);
		screens.add(screen2);
		
		activeScreen = screens.get(0);
		
		person = new Person();
	}
	
	public void setup() {
		for (Screen s : screens)
			s.setup();

	}
	
	public void draw() {

		ratioX = (float)width/activeScreen.DRAWING_WIDTH;
		ratioY = (float)height/activeScreen.DRAWING_HEIGHT;

		push();
		
		scale(ratioX, ratioY);
		activeScreen.draw();
		pop();
	}
	
	
	public void mousePressed() {
	}
	
	public void switchScreen(int i) {
		if (i == 0) {
			activeScreen = screens.get(0);
			FirstScreen firstScreen = (FirstScreen)activeScreen;
			firstScreen.setVisibility(true);
		}
		else {
			FirstScreen firstScreen = (FirstScreen)activeScreen;
			firstScreen.setVisibility(false);
			activeScreen = screens.get(i);
		}
		activeScreen.setup();
	}
	
	public void handleDropListEvents(GDropList list, GEvent event) {
		person.getClothes().setWeather(list.getSelectedText());
	}
	

	public void handleButtonEvents(GButton button, GEvent event) {
		// Create the control window?
		if (event == GEvent.CLICKED) {
			switchScreen(1);
		}
		
	}

}
