package mannequin;

import mannequin.clothes.Accessory;
import mannequin.clothes.Bottom;
import mannequin.clothes.Shoes;
import mannequin.clothes.Top;
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
	 */
	public void changeAccessory() {
		
	}
	
	/**
	 * Changes the face
	 */
	public void changeFace() {
		
	}
	/**
	 * Calculates the total cost of the outfit
	 * @return total cost of the outfit
	 */
	public double calculateTotalCost() {
		return totalCost;
	}
}
