package mannequin;

import mannequin.clothes.Accessory;
import mannequin.clothes.AccessoryList;
import mannequin.clothes.Bottom;
import mannequin.clothes.BottomsList;
import mannequin.clothes.Clothes;
import mannequin.clothes.Shoes;
import mannequin.clothes.ShoesList;
import mannequin.clothes.Top;
import mannequin.clothes.TopsList;
import processing.core.PApplet;
/**
 * Represents a person who has different types of clothing
 * @author Aditi
 * @version 5/13/22
 *
 */
public class Person {
	
	private Top top;
	private Bottom bottom;
	private Shoes shoesL;
	private Shoes shoesR;
	private Accessory accessory;
	private Face face;
	private double totalCost; //lets just keep this in the clothing class
	private Clothes clothes;
	private TopsList topsList;
	private BottomsList bottomsList;
	private ShoesList shoesList;
	private AccessoryList accessoriesList;
	
	/**
	 * Constructs a person and initializes all the lists and clothing
	 */
	public Person() {
		topsList = new TopsList();
		top = topsList.pickNextEntry();
		bottomsList = new BottomsList();
		bottom = bottomsList.pickNextEntry();
		shoesList = new ShoesList();
		shoesL = shoesList.pickNextEntry();
		shoesR = shoesList.pickNextEntry();
//		accessoriesList = new AccessoryList();
//		accessory = accessoriesList.pickNextEntry();
		face = new Face();
		clothes = new Clothes("Hot");
	}
	/**
	 * Graphical UI Displays an image (format PImage) of the clothes based on
	 * chosen filters This supports interaction with the screen using mouse clicks in
	 * the window.
	 * 
	 * @pre Properties affecting tops are set on marker
	 * @param marker The PApplet used for displaying the image and drawing
	 */
	public void draw(PApplet marker) {
		marker.image(top.getImage(), 200,100);
		marker.image(bottom.getImage(), 200, 400);
		marker.image(shoesL.getImage(), 150, 500);
		marker.image(shoesR.getImage(), 250, 500);
	}
	
	/**
	 * Changes the top
	 */
	public void changeTop() {
		top = topsList.pickNextEntry();

	}
	
	/**

	 * Changes the bottom
=======
	 * Changes the bottom to a different one 

	 */
	public void changeBottom() {
		bottom = bottomsList.pickNextEntry();

	}
	
	/**
	 * Changes the shoes
	 */
	public void changeShoes() {
		shoesL = shoesList.pickNextEntry();
		shoesR = shoesList.pickNextEntry();
	}
	
	/**

	 * Changes the Accessory
=======
	 * Changes the accessory to something different 

	 */
	public void changeAccessory() {
		accessory = accessoriesList.pickNextEntry();

	}
	
	public void pickRandom() {
		top = topsList.pickRandom();
		bottom = bottomsList.pickRandom();
		accessory = accessoriesList.pickRandom();
		shoesL = shoesList.pickRandom();
		shoesR = shoesList.pickNextEntry();
	}
	
	/**

	 * Changes the face

	 * Changes the face to a different one

	 */
	public void changeFace() {
		
	}


	/**
	 * Calculates the cost of the entire outfit 
	 * @return totalCost value of entire outfit
	 */
	public double calculateTotalCost() {
		return totalCost;
	}
	
	/**
	 * @return the clothes
	 */
	public Clothes getClothes() {
		return clothes;
	}
	
	/**
	 * @return the top
	 */
	public Top getTop() {
		return top;
	}
	
	/**
	 * @return the bottom
	 */
	public Bottom getBottom() {
		return bottom;
	}
	
	/**
	 * @return the accessory
	 */
	public Accessory getAccessory() {
		return accessory;
	}
	
	/**
	 * @return the left shoe
	 */
	public Shoes getShoesLeft() {
		return shoesL;
	}
	
	/**
	 * @return the right shoe
	 */
	public Shoes getShoesRight() {
		return shoesR;
	}
	
	/**
	 * @return tops list
	 */
	public TopsList getTopsList() {
		return topsList;
	}
	/**
	 * @return bottoms list
	 */
	public BottomsList getBottomsList() {
		return bottomsList;
	}
	/**
	 * @return accessories list
	 */
	public AccessoryList getAccessoriesList() {
		return accessoriesList;
	}
	/**
	 * @return shoes list
	 */
	public ShoesList getShoesList() {
		return shoesList;
	}
	
	
	
	
	
	
}
