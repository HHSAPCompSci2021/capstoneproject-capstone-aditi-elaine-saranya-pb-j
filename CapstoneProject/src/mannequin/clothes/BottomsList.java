package mannequin.clothes;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import processing.core.PApplet;
import processing.core.PImage;

/**
 * The BottomList class represents a collection of all the Bottoms to be added to the screen using
 * the Processing library.
 * 
 * @author Saranya
 * @version 5/13/2022
 */
public class BottomsList extends PApplet{
	private ArrayList<Bottom> allList;
	private ArrayList<Bottom> sortedList;
	
	
	/**
	 * Constructs a list of bottoms with an arraylist of all the bottoms and an arraylist that is sorted based on the user settings
	 */
	public BottomsList() {
		allList = new ArrayList<>();
		sortedList = new ArrayList<>();
		BufferedImage img= null;
		try {
			img = ImageIO.read(new File("res/whitepants.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage whitePants = new PImage(img);
		Bottom bottom1 = new Bottom("Hot", whitePants);
		allList.add(bottom1);
		
		img= null;
		try {
			img = ImageIO.read(new File("res/beigepants.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage beigePants = new PImage(img);
		Bottom bottom2 = new Bottom("Hot", beigePants);
		allList.add(bottom2);
		
		img= null;
		try {
			img = ImageIO.read(new File("res/blackpants.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage blackPants = new PImage(img);
		Bottom bottom3 = new Bottom("Hot", blackPants);
		allList.add(bottom3);
		
		img= null;
		try {
			img = ImageIO.read(new File("res/blueflarejeans.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage blueFlareJeans = new PImage(img);
		Bottom bottom4 = new Bottom("Hot", blueFlareJeans);
		allList.add(bottom4);
		
		img= null;
		try {
			img = ImageIO.read(new File("res/bluejeans.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage blueJeans = new PImage(img);
		Bottom bottom5 = new Bottom("Hot", blueJeans);
		allList.add(bottom5);
		
		img= null;
		try {
			img = ImageIO.read(new File("res/bluejeanswithrips.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage blueJeansWRips = new PImage(img);
		Bottom bottom6 = new Bottom("Hot", blueJeansWRips);
		allList.add(bottom6);
				
	}

	
	

	/**
	 * Picks a random bottom based on the selected filters
	 * 
	 * @return The image of the bottom picked
	 */
	public Bottom pickRandom() {
		int index = (int)(Math.random() * sortedList.size());
		while (sortedList.get(index) == null) {
			index = (int)(Math.random() * sortedList.size());
		}
		return sortedList.get(index);
	}

	/**
	 * Picks the next bottom based on the selected filters
	 * 
	 * @return The image of the bottom picked
	 */
	public Bottom pickNextEntry() {
		setup();
		return allList.get(0);
	}

	
	
}
 