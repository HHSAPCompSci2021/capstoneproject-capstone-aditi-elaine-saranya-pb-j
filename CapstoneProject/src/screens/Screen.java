package screens;

/**
 * The Screen class represents the different screens from the program
 * Each different screen extends from this class 
 * @author Elaine
 * @version 5/13/2022
 *
 */
public abstract class Screen {
	/**
	 * Holds the width of the DrawingSurface screen
	 */
	public final int DRAWING_WIDTH;
	/**
	 * Holds the height of the DrawingSurface screen
	 */
	public final int DRAWING_HEIGHT;
	
	/**
	 * Constructs a Screen by setting the width and height of the screen on the DrawingSurface
	 * @param width width of the screen
	 * @param height height of the screen
	 */
	public Screen(int width, int height) {
		this.DRAWING_WIDTH = width;
		this.DRAWING_HEIGHT = height;
	}
	/**
	 * Sets up the DrawingSurface before anything is drawn
	 */
	public void setup() {
		
	}
	/**
	 * Draws the Screen to the given DrawingSurface
	 * @pre The Screen will be drawn with attributes previously set on the given PApplet.
	 */
	public void draw() {
		
	}
	
	
}
