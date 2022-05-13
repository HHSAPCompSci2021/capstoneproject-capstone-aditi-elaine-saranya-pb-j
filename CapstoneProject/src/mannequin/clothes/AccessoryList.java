package mannequin.clothes;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import processing.core.PApplet;
import processing.core.PImage;

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
		//setup();
		while(index<allList.size()) {
			index++;
			return allList.get(index);
			
		}
		index=0;
		return allList.get(index);
	}

	
	
}
 