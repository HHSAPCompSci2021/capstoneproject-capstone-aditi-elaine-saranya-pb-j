package core;
import java.awt.Point;
import java.util.ArrayList;

import processing.core.PApplet;
import screens.FirstScreen;
import screens.Screen;
import screens.ScreenSwitcher;
import screens.SecondScreen;


public class DrawingSurface extends PApplet implements ScreenSwitcher {

	private Screen activeScreen;
	private ArrayList<Screen> screens;

	
	public DrawingSurface() {
		
		screens = new ArrayList<Screen>();
		
		
		FirstScreen screen1 = new FirstScreen(this);
		screens.add(screen1);
		
		SecondScreen screen2 = new SecondScreen(this);
		screens.add(screen2);
		
		activeScreen = screens.get(0);
	}
	
	public void setup() {
		for (Screen s : screens)
			s.setup();
	}
	
	public void draw() {
	}
	
	
	public void mousePressed() {
		activeScreen.mousePressed();
	}
	
	public void switchScreen(int i) {
		activeScreen = screens.get(i);
	}
}