package mannequin.clothes;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import processing.core.PApplet;
import processing.core.PImage;

public class BottomsList extends PApplet{
	private ArrayList<Bottom> allList;
	private ArrayList<Bottom> sortedList;
	
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
	public Bottom pickRandom() {
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
	public Bottom pickNextEntry() {
		setup();
		return allList.get(0);
	}

	
	
}
 