package mannequin;

import mannequin.clothes.Accessory;
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
 * @version 5/6/22
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
//	private AccessoryList accessoriesList;
	
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
		marker.image(top.getImage(), 300, 300);
		marker.image(bottom.getImage(), 300, 400);
		marker.image(shoesL.getImage(), 250, 500);
		marker.image(shoesR.getImage(), 350, 500);
	}
	
	/**
	 * Changes the top
	 */
	public void changeTop() {
		
	}
	
	/**

	 * Changes the bottom
=======
	 * Changes the bottom to a different one 

	 */
	public void changeBottom() {
	
	}
	
	/**
	 * Changes the shoes
	 */
	public void changeShoes() {
		
	}
	
	/**

	 * Changes the Accessory
=======
	 * Changes the accessory to something different 

	 */
	public void changeAccessory() {
		
	}
	
	/**

	 * Changes the face

	 * Changes the face to a different one

	 */
	public void changeFace() {
		
	}

	/**
	 * Calculates the total cost of the outfit
	 * @return total cost of the outfit
=======
	
	/**
	 * Calculates the cost of the entire outfit 
	 * @return totalCost value of entire outfit

	 */
	public double calculateTotalCost() {
		return totalCost;
	}
	
	public Clothes getClothes() {
		return clothes;
	}
	
	public Top getTop() {
		return top;
	}
	public Bottom getBottom() {
		return bottom;
	}
	public Accessory getAccessory() {
		return accessory;
	}
	public Shoes getShoesLeft() {
		return shoesL;
	}
	public Shoes getShoesRight() {
		return shoesR;
	}
	
}
