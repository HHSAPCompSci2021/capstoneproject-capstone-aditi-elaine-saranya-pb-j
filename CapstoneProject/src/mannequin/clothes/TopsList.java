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
 * The TopsList class represents a collection of all the Tops to be added to the
 * screen using the Processing library.
 * 
 * @author
 * @version 5/17/2022
 */
public class TopsList {

	private ArrayList<Top> allList;
	private ArrayList<Top> sortedList;

	private String weatherCondition;

	private int currentIndex;

	/**
	 * Constructs an AccessoryList containing an ArrayList of all the accessories
	 * and an ArrayList that is sorted based on the user settings
	 */
	public TopsList() {
		weatherCondition = "Hot";
		allList = new ArrayList<>();
		sortedList = new ArrayList<>();
		currentIndex = -1;

		BufferedImage img = null;
		try {
			img = ImageIO.read(new File("res/redblouse.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage redBlouse = new PImage(img);
		Top top1 = new Top("Hot", redBlouse);
		allList.add(top1);

		img = null;
		try {
			img = ImageIO.read(new File("res/beigetshirt.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage beigeShirt = new PImage(img);
		Top top2 = new Top("Hot", beigeShirt);
		allList.add(top2);

		img = null;
		try {
			img = ImageIO.read(new File("res/blacktanktop.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage blackTankTop = new PImage(img);
		Top top3 = new Top("Hot", blackTankTop);
		allList.add(top3);

		img = null;
		try {
			img = ImageIO.read(new File("res/blacktshirt.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage blackTShirt = new PImage(img);
		Top top4 = new Top("Cold", blackTShirt);
		allList.add(top4);

		img = null;
		try {
			img = ImageIO.read(new File("res/blueblouse.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage blueBlouse = new PImage(img);
		Top top5 = new Top("Hot", blueBlouse);
		allList.add(top5);

		img = null;
		try {
			img = ImageIO.read(new File("res/bluetshirt.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage blueTShirt = new PImage(img);
		Top top6 = new Top("Hot", blueTShirt);
		allList.add(top6);

		img = null;
		try {
			img = ImageIO.read(new File("res/whiteblouse.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage whiteBlouse = new PImage(img);
		Top top7 = new Top("Hot", whiteBlouse);
		allList.add(top7);

		img = null;
		try {
			img = ImageIO.read(new File("res/whitetshirt.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage whiteTShirt = new PImage(img);
		Top top8 = new Top("Hot", whiteTShirt);
		allList.add(top8);

		img = null;
		try {
			img = ImageIO.read(new File("res/blackbuttondown.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage blackButtonDown = new PImage(img);
		Top top9 = new Top("Cold", blackButtonDown);
		allList.add(top9);

		img = null;
		try {
			img = ImageIO.read(new File("res/blacksweater.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage blackSweater = new PImage(img);
		Top top10 = new Top("Cold", blackSweater);
		allList.add(top10);

		img = null;
		try {
			img = ImageIO.read(new File("res/bluebuttondown.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage blueButtonDown = new PImage(img);
		Top top11 = new Top("Cold", blueButtonDown);
		allList.add(top11);

		img = null;
		try {
			img = ImageIO.read(new File("res/greenbuttondown.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage greenButtonDown = new PImage(img);
		Top top12 = new Top("Cold", greenButtonDown);
		allList.add(top12);

		img = null;
		try {
			img = ImageIO.read(new File("res/whitesweater.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage whiteSweater = new PImage(img);
		Top top13 = new Top("Cold", whiteSweater);
		allList.add(top13);

	}

	/**
	 * Sorts the ArrayList with all the tops into the sorted ArrayList
	 */
	public void sortArray() {
		for (Top t : allList) {
			if (t.getWeather().equals(weatherCondition))
				sortedList.add(t);
		}
	}

	/**
	 * Picks a random top based on the selected filters
	 * 
	 * @return The image of the top picked
	 */
	public Top pickRandom() {
		int index = (int) (Math.random() * sortedList.size());
		while (sortedList.get(index) == null) {
			index = (int) (Math.random() * sortedList.size());
		}
		return sortedList.get(index);
	}

	/**
	 * Picks the next top based on the selected filters
	 * 
	 * @return The image of the top picked
	 */
	public Top pickNextEntry() {

		if (currentIndex == sortedList.size() - 1)
			currentIndex = -1;
		currentIndex++;
		return sortedList.get(currentIndex);
	}

	/**
	 * Sets the weather condition outside to sort the clothes
	 * 
	 * @param w the weather
	 */
	public void setWeatherCondition(String w) {
		weatherCondition = w;
	}

}
