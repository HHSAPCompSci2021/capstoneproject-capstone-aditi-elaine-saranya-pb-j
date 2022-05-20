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
 * @version 5/18/2022
 */
public class TopsList {

	private ArrayList<Top> allList;
	private ArrayList<Top> sortedList;

	private String weatherCondition;
	private String formality;
	private String gender;

	private int currentIndex;

	/**
	 * Constructs an AccessoryList containing an ArrayList of all the accessories
	 * and an ArrayList that is sorted based on the user settings
	 */
	public TopsList() {
		weatherCondition = " ";
		formality = " ";
		gender = "Neutral";

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
		Top top1 = new Top("Hot", "Semi-Formal", "Feminine", redBlouse, 88.00, "https://www.aritzia.com/us/en/product/wander-linen-blouse/82942.html?dwvar_82942_color=23863");
		allList.add(top1);

		img = null;
		try {
			img = ImageIO.read(new File("res/beigetshirt.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage beigeShirt = new PImage(img);
		Top top2 = new Top("Hot", "Casual", "Neutral", beigeShirt, 30.00, "https://www.everlane.com/products/womens-air-oversized-crew-tee-iced-coffee");
		allList.add(top2);

		img = null;
		try {
			img = ImageIO.read(new File("res/blacktanktop.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage blackTankTop = new PImage(img);
		Top top3 = new Top("Hot", "Casual", "Feminine", blackTankTop, 38.00, "https://www.aritzia.com/us/en/product/contour-squareneck-tank/92131.html?dwvar_92131_color=1274");
		allList.add(top3);

		img = null;
		try {
			img = ImageIO.read(new File("res/blacktshirt.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage blackTShirt = new PImage(img);
		Top top4 = new Top("Cold", "Casual", "Neutral", blackTShirt, 30.00, "https://www.everlane.com/products/womens-air-oversized-crew-tee-black");
		allList.add(top4);

		img = null;
		try {
			img = ImageIO.read(new File("res/blueblouse.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage blueBlouse = new PImage(img);
		Top top5 = new Top("Hot", "Semi-Formal", "Feminine", blueBlouse, 40.00, "https://www.aritzia.com/us/en/product/wander-linen-blouse/98314.html?dwvar_98314_color=25067");
		allList.add(top5);

		img = null;
		try {
			img = ImageIO.read(new File("res/bluetshirt.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage blueTShirt = new PImage(img);
		Top top6 = new Top("Hot", "Casual", "Neutral", blueTShirt, 30.00, "https://www.everlane.com/products/womens-air-oversized-crew-tee-blue-slate");
		allList.add(top6);

		img = null;
		try {
			img = ImageIO.read(new File("res/whiteblouse.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage whiteBlouse = new PImage(img);
		Top top7 = new Top("Hot", "Formal", "Feminine", whiteBlouse, 98.00, "https://www.aritzia.com/us/en/product/vilette-linen-blouse/95909.html?dwvar_95909_color=1275");
		allList.add(top7);

		img = null;
		try {
			img = ImageIO.read(new File("res/whitetshirt.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage whiteTShirt = new PImage(img);
		Top top8 = new Top("Hot", "Casual", "Neutral", whiteTShirt, 30.00, "https://www.everlane.com/products/womens-air-oversized-crew-tee-white");
		allList.add(top8);

		img = null;
		try {
			img = ImageIO.read(new File("res/blackbuttondown.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage blackButtonDown = new PImage(img);
		Top top9 = new Top("Cold", "Formal", "Masculine", blackButtonDown, 80.00, "https://www.everlane.com/products/womens-silky-cttn-relaxed-shirt-black ");
		allList.add(top9);

		img = null;
		try {
			img = ImageIO.read(new File("res/blacksweater.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage blackSweater = new PImage(img);
		Top top10 = new Top("Cold", "Semi-Formal", "Neutral", blackSweater, 67.00, "https://www.everlane.com/products/womens-light-chunky-turtleneck-black");
		allList.add(top10);

		img = null;
		try {
			img = ImageIO.read(new File("res/bluebuttondown.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage blueButtonDown = new PImage(img);
		Top top11 = new Top("Cold", "Formal", "Masculine", blueButtonDown, 80.00, "https://www.everlane.com/products/womens-silky-cttn-relaxed-shirt-blue ");
		allList.add(top11);

		img = null;
		try {
			img = ImageIO.read(new File("res/greenbuttondown.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage greenButtonDown = new PImage(img);
		Top top12 = new Top("Cold", "Semi-Formal", "Masculine", greenButtonDown, 80.00, "https://www.everlane.com/products/womens-oversized-org-cotton-shirt-laurel ");
		allList.add(top12);

		img = null;
		try {
			img = ImageIO.read(new File("res/whitesweater.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage whiteSweater = new PImage(img);
		Top top13 = new Top("Cold", "Semi-Formal", "Feminine", whiteSweater, 100.00, "https://www.everlane.com/products/womens-texture-cotton-crew-canvas?collection=womens-sweaters");
		allList.add(top13);

		
		img = null;
		try {
			img = ImageIO.read(new File("res/graphictee.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage graphictee = new PImage(img);
		Top top14 = new Top("Hot", "Casual", "Masculine", graphictee, 25.00, "https://www.pacsun.com/space-jam-vintage-dyed-t-shirt-0097438400002.html?tileCgid=mens-graphic-tees");
		allList.add(top14);
		
		img = null;
		try {
			img = ImageIO.read(new File("res/poloshirt.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage polo = new PImage(img);
		Top top15 = new Top("Hot", "Formal", "Masculine", polo, 60.00, "https://bananarepublic.gap.com/browse/product.do?pid=857757002&cid=1184116&pcid=10894&vid=1&nav=meganav%3AMen%3AMen%27s+Clothing%3APolos#pdp-page-content");
		allList.add(top15);
		
		img = null;
		try {
			img = ImageIO.read(new File("res/poloshirt.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage polo2 = new PImage(img);
		Top top17 = new Top("Hot", "Semi-Formal", "Masculine", polo2, 60.00, "https://bananarepublic.gap.com/browse/product.do?pid=857757002&cid=1184116&pcid=10894&vid=1&nav=meganav%3AMen%3AMen%27s+Clothing%3APolos#pdp-page-content");
		allList.add(top17);
		
		
		img = null;
		try {
			img = ImageIO.read(new File("res/whitecrewneck.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage whitecrew = new PImage(img);
		Top top16 = new Top("Cold", "Semi-Formal", "Neutral", whitecrew, 75.00, "https://www.urbanoutfitters.com/shop/iets-frans-x-smiley-elbow-print-crew-neck-sweatshirt?category=SEARCHRESULTS&color=030&searchparams=_gl%3D1%2a1a1y740%2a_up%2aMQ..%26gclid%3DCjwKCAjwve2TBhByEiwAaktM1J77qhbvhQY0moxImWWaG3u-uMW-aE8idkMVjElb-0JjEEd6NIt2FxoCviwQAvD_BwE%26gclsrc%3Daw.ds%26q%3Dcrewneck&type=REGULAR&quantity=1");
		allList.add(top16);
		
		//18
	}

	/**
	 * Sorts the ArrayList with all the tops into the sorted ArrayList based on the user preferences
	 */
	public void sortArray() {
		if (weatherCondition.equals(" ")) {
			sortedList = (ArrayList<Top>) allList.clone();
		} else {
			for (Top t : allList) {
				if (t.getWeather().equals(weatherCondition))
					sortedList.add(t);
			}
		}
		if (!formality.equals(" ")) {
			for (int i = 0; i < sortedList.size(); i++) {
				Top t = sortedList.get(i);
				if (!t.getFormality().equals(formality)) {
					sortedList.remove(i);
					i--;
				}
			}
		}
		for (int i = 0; i < sortedList.size(); i++) {
			Top t = sortedList.get(i);
			if (!t.getExpression().equals(gender) && !gender.equals("Neutral")) {
				sortedList.remove(i);
				i--;
			}
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

	/**
	 * Sets the formality type to sort the clothes
	 * 
	 * @param w the formality
	 */
	public void setFormalityType(String w) {
		formality = w;
	}

	/**
	 * Sets the gender expression to sort the clothes
	 * 
	 * @param w the gender expression
	 */
	public void setClothesGender(String w) {
		gender = w;
	}
	
	/**
	 * Returns the sorted arraylist
	 * @return sorted list
	 */
	public ArrayList<Top> returnArrayList() {
		return sortedList;
	}

}
