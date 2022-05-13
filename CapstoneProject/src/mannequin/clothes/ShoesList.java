package mannequin.clothes;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

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

	private int index=0;
	

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

		BufferedImage img= null;
		try {
			img = ImageIO.read(new File("res/loafersL.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage loafersL = new PImage(img);
		shoes1L = new Shoes("Hot", loafersL);
		allList.add(shoes1L);
		
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
		//setup();
		while(index<allList.size()) {
			index+=2;
			return allList.get(index);
			
		}
		index=0;
		return allList.get(index);
	}

}
