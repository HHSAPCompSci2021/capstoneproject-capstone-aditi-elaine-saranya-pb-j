package mannequin.clothes;

import java.util.ArrayList;

import javax.imageio.ImageIO;

import processing.core.PApplet;
import processing.core.PImage;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;



/**
 * The TopsList class represents a collection of all the Tops to be added to
 * the screen using the Processing library.
 * 
 * @author Saranya
 * @version 5/13/2022
 */
public class TopsList{

	private ArrayList<Top> allList;
	private ArrayList<Top> sortedList;

	private int index=0;

	private int currentIndex;

	
	/**
	 * Constructs a list of tops with an arraylist of all the tops and an arraylist that is sorted based on the user settings
	 */
	public TopsList() {
		allList = new ArrayList<>();
		sortedList = new ArrayList<>();
		currentIndex = -1;
		
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
		
		img= null;
		try {
			img = ImageIO.read(new File("res/beigetshirt.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage beigeShirt = new PImage(img);
		Top top2 = new Top("Hot", beigeShirt);
		allList.add(top2);
		
		img= null;
		try {
			img = ImageIO.read(new File("res/blacktanktop.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage blackTankTop = new PImage(img);
		Top top3 = new Top("Hot", blackTankTop);
		allList.add(top3);
		
		img= null;
		try {
			img = ImageIO.read(new File("res/blacktshirt.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage blackTShirt = new PImage(img);
		Top top4 = new Top("Hot", blackTShirt);
		allList.add(top4);
		
		img= null;
		try {
			img = ImageIO.read(new File("res/blueblouse.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage blueBlouse = new PImage(img);
		Top top5 = new Top("Hot", blueBlouse);
		allList.add(top5);
		
		img= null;
		try {
			img = ImageIO.read(new File("res/bluetshirt.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage blueTShirt = new PImage(img);
		Top top6 = new Top("Hot", blueTShirt);
		allList.add(top6);
		
		img= null;
		try {
			img = ImageIO.read(new File("res/whiteblouse.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage whiteBlouse = new PImage(img);
		Top top7 = new Top("Hot", whiteBlouse);
		allList.add(top7);
		
		img= null;
		try {
			img = ImageIO.read(new File("res/whitetshirt.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage whiteTShirt = new PImage(img);
		Top top8 = new Top("Hot", whiteTShirt);
		allList.add(top8);
	}
	
	
	/**
	 * Picks a random top based on the selected filters
	 * 
	 * @return The image of the top picked
	 */
	public Top pickRandom() {
		int index = (int)(Math.random() * sortedList.size());
		while (sortedList.get(index) == null) {
			index = (int)(Math.random() * sortedList.size());
		}
		return sortedList.get(index);
	}

	/**
	 * Picks the next top based on the selected filters
	 * 
	 * @return The image of the top picked
	 */
	public Top pickNextEntry() {

		while(index<allList.size()) {
			index++;
			return allList.get(index);
			
		}

		if (currentIndex == sortedList.size()-1)
			currentIndex = -1;
		return allList.get(currentIndex+1);

	}

	
	
}
 