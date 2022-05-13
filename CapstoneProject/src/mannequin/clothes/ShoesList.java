package mannequin.clothes;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;

/**
 * The ShoesList class represents a collection of all the Shoes to be added to
 * the screen using the Processing library.
 * 
 * @author
 * @version 5/13/2022
 */

public class ShoesList extends PApplet {
	private ArrayList<Shoes> allList;
	private ArrayList<Shoes> sortedList;

	public ShoesList() {
		allList = new ArrayList<>();
		sortedList = new ArrayList<>();

	}

	/**
	 * Adds shoes to the collection 
	 */
	public void setup() {
		Shoes shoes1L = new Shoes("Hot", loadImage("loafersL.png"));
		allList.add(shoes1L);
	}

	/**
	 * Picks a random shoe based on the selected filters
	 * 
	 * @return The image of the shoe picked
	 */
	public Shoes pickRandom() {
		int index = (int) (Math.random() * sortedList.size());
		while (sortedList.get(index) == null) {
			index = (int) (Math.random() * sortedList.size());
		}
		return sortedList.get(index);
	}

	/**
	 * Picks the next shoe based on the selected filters
	 * 
	 * @return The image of the shoe picked
	 */
	public Shoes pickNextEntry() {
		setup();
		return allList.get(0);
	}

}
