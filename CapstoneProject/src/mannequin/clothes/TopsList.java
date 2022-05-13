package mannequin.clothes;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;

public class TopsList extends PApplet{
	private ArrayList<Top> allList;
	private ArrayList<Top> sortedList;
	
	public TopsList() {
		allList = new ArrayList<>();
		sortedList = new ArrayList<>();
		Top top1 = new Top("Hot", loadImage("redblouse.png"));
		allList.add(top1);
	}

	/**
	 * Picks a random article of clothing based on the selected filters
	 * 
	 * @return The image of the article of clothing picked
	 */
	public Top pickRandom() {
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
	public Top pickNextEntry() {
		return null;
	}

	
	
}
 