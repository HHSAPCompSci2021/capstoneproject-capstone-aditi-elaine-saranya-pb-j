package mannequin.clothes;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;

public class AccessoryList extends PApplet{
	private ArrayList<Accessory> allList;
	private ArrayList<Accessory> sortedList;
	
	public AccessoryList() {
		allList = new ArrayList<>();
		sortedList = new ArrayList<>();
		
	}
	
	public void setup() {
		Accessory accessory1 = new Accessory("Cold", loadImage("whitepants.png"));
		allList.add(accessory1);
	}

	/**
	 * Picks a random article of clothing based on the selected filters
	 * 
	 * @return The image of the article of clothing picked
	 */
	public Accessory pickRandom() {
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
	public Accessory pickNextEntry() {
		setup();
		return allList.get(0);
	}

	
	
}
 