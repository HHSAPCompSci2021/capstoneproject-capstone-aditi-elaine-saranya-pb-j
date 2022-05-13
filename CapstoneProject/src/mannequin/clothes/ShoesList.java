package mannequin.clothes;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;

public class ShoesList extends PApplet{
	private ArrayList<Shoes> allList;
	private ArrayList<Shoes> sortedList;
	
	public ShoesList() {
		allList = new ArrayList<>();
		sortedList = new ArrayList<>();
		
	}
	
	public void setup() {
		Shoes shoes1L = new Shoes("Hot", loadImage("loafersL.png"));
		allList.add(shoes1L);
	}

	/**
	 * Picks a random article of clothing based on the selected filters
	 * 
	 * @return The image of the article of clothing picked
	 */
	public Shoes pickRandom() {
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
	public Shoes pickNextEntry() {
		setup();
		return allList.get(0);
	}

	
	
}
 