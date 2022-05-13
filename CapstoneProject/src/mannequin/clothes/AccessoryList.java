package mannequin.clothes;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;


/**
 * The AccessoryList class represents a collection of all the Accessories to be added to the screen using
 * the Processing library.
 * 
 * @author 
 * @version 5/13/2022
 */

public class AccessoryList extends PApplet{
	private ArrayList<Accessory> allList;
	private ArrayList<Accessory> sortedList;
	
	public AccessoryList() {
		allList = new ArrayList<>();
		sortedList = new ArrayList<>();
		
	}
	
	/**
	 * Adds accessories to the collection 
	 */
	public void setup() {
		Accessory accessory1 = new Accessory("Cold", loadImage("whitepants.png"));
		allList.add(accessory1);
	}

	/**
	 * Picks a random accessory based on the selected filters
	 * 
	 * @return The image of the accessory picked
	 */
	public Accessory pickRandom() {
		int index = (int)(Math.random() * sortedList.size());
		while (sortedList.get(index) == null) {
			index = (int)(Math.random() * sortedList.size());
		}
		return sortedList.get(index);
	}

	/**
	 * Picks the next accessory based on the selected filters
	 * 
	 * @return The image of the accessory picked
	 */
	public Accessory pickNextEntry() {
		setup();
		return allList.get(0);
	}

	
	
}
 