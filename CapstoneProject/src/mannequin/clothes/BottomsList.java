package mannequin.clothes;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;

public class BottomsList extends PApplet{
	private ArrayList<Bottom> allList;
	private ArrayList<Bottom> sortedList;
	
	public BottomsList() {
		allList = new ArrayList<>();
		sortedList = new ArrayList<>();
		
	}
	
	public void setup() {
		Bottom bottom1 = new Bottom("Cold", loadImage("whitepants.png"));
		allList.add(bottom1);
	}

	/**
	 * Picks a random article of clothing based on the selected filters
	 * 
	 * @return The image of the article of clothing picked
	 */
	public Bottom pickRandom() {
		int index = (int)(Math.random() * sortedList.size());
		while (sortedList.get(index) == null) {
			index = (int)(Math.random() * sortedList.size());
		}
		return sortedList.get(index);
	}

	/**
	 * Picks the next article of clothing based on the selected filters
	 * 
	 * @return The image of the article of clothing picked
	 */
	public Bottom pickNextEntry() {
		setup();
		return allList.get(0);
	}

	
	
}
 