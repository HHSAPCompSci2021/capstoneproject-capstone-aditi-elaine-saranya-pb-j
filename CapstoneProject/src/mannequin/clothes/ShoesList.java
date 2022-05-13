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
 * @author Saranya
 * @version 5/13/2022
 */
public class ShoesList extends PApplet {
	private ArrayList<Shoes> allList;
	private ArrayList<Shoes> sortedList;
	
	private int currentIndex;


	private int index=0;
	


	/**
	 * Constructs a list of shoes with an arraylist of all the shoes and an arraylist that is sorted based on the user settings
	 */

	public ShoesList() {
		allList = new ArrayList<>();
		sortedList = new ArrayList<>();
		
		currentIndex = -1;

		BufferedImage img= null;
		try {
			img = ImageIO.read(new File("res/loafersL.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage loafersL  = new PImage(img);
		Shoes shoes1L = new Shoes("Hot", loafersL);
		allList.add(shoes1L);
		
		img= null;
		try {
			img = ImageIO.read(new File("res/loafersR.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage loafersR  = new PImage(img);
		Shoes shoes1R = new Shoes("Hot", loafersR);
		allList.add(shoes1R);
		
		img= null;
		try {
			img = ImageIO.read(new File("res/dunksL.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage dunksL  = new PImage(img);
		Shoes shoes2L = new Shoes("Hot", dunksL);
		allList.add(shoes2L);
		
		img= null;
		try {
			img = ImageIO.read(new File("res/dunksR.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage dunksR  = new PImage(img);
		Shoes shoes2R = new Shoes("Hot", dunksR);
		allList.add(shoes2R);
		
		img= null;
		try {
			img = ImageIO.read(new File("res/blackconveseL.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage converseL  = new PImage(img);
		Shoes shoes3L = new Shoes("Hot", converseL);
		allList.add(shoes3L);
		
		img= null;
		try {
			img = ImageIO.read(new File("res/blackconverseR.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage converseR  = new PImage(img);
		Shoes shoes3R = new Shoes("Hot", converseR);
		allList.add(shoes3R);

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

		if (currentIndex == sortedList.size()-1)
			currentIndex = -1;
		currentIndex++;
		return allList.get(currentIndex);
	}

}
