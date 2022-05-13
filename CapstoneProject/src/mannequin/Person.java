package mannequin;

import mannequin.clothes.Accessory;
import mannequin.clothes.Bottom;
import mannequin.clothes.Clothes;
import mannequin.clothes.Shoes;
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
	private Shoes shoes;
	private Accessory accessory;
	private Face face;
	private double totalCost; //lets just keep this in the clothing class
	private Clothes clothes;
	
	
	public Person() {
		TopsList topsList = new TopsList();
		top = topsList.pickNextEntry();
		bottom = new Bottom();
		shoes = new Shoes();
		accessory = new Accessory();
		face = new Face();
		clothes = new Clothes();
	}
	/**
	 * draws the person with all of their clothing
	 * @param marker The Processing PApplet on which one draws on
	 * @pre properties affecting the face are set on the marker 
	 */
	public void draw(PApplet marker) {
		
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
	public Shoes getShoes() {
		return shoes;
	}
	
}
