package screens;

/**
 * The ScreenSwitcher Interface helps switch screens
 * @author Elaine
 * @version 5/6/2022
 *
 */
public interface ScreenSwitcher {
	/**
	 * The MENU_SCREEN variable holds the value 0 to represent the menu screen's index
	 */
	public static final int MENU_SCREEN = 0;
	/**
	 * The PROGRAM_SCREEN variable holds the value 1 to represent the program screen's index
	 */
	public static final int PROGRAM_SCREEN = 1;
	
	/**
	 * This method takes in the index of the screen you want to switch to and switches to that screen
	 * @param i The index of the Screen you want to switch to
	 */
	public void switchScreen(int i);
}
