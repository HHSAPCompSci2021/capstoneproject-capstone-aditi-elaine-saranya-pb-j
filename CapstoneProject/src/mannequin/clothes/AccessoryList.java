package mannequin.clothes;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

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
	private int index=0;
	
	public AccessoryList() {
		allList = new ArrayList<>();
		sortedList = new ArrayList<>();
		BufferedImage img= null;
		try {
			img = ImageIO.read(new File("res/whitehat.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage whiteHat = new PImage(img);
		Accessory accessory1 = new Accessory("Hot", whiteHat);
		allList.add(accessory1);
		
	}

	
	/**
	 * Adds accessories to the collection 
	 */
	public void setup() {
		Accessory accessory1 = new Accessory("Cold", loadImage("whitepants.png"));
		allList.add(accessory1);
	}
	public PImage getImage(String path) {
		try {
			return new PImage(ImageIO.read(new File(path)));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
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
		//setup();
		while(index<allList.size()) {
			index++;
			return allList.get(index);
			
		}
		index=0;
		return allList.get(index);
	}

	
	
}
 