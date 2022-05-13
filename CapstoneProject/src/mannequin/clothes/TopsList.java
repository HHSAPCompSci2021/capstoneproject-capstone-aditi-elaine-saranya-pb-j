package mannequin.clothes;

import java.util.ArrayList;

import javax.imageio.ImageIO;

import processing.core.PApplet;
import processing.core.PImage;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class TopsList{
	private ArrayList<Top> allList;
	private ArrayList<Top> sortedList;
	private int index=0;
	
	public TopsList() {
		allList = new ArrayList<>();
		sortedList = new ArrayList<>();
		BufferedImage img= null;
		try {
			img = ImageIO.read(new File("res/redblouse.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage redBlouse = new PImage(img);
		Top top1 = new Top("Hot", redBlouse);
		allList.add(top1);
		
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
		while(index<allList.size()) {
			index++;
			return allList.get(index);
			
		}
		index=0;
		return allList.get(index);
	}

	
	
}
 