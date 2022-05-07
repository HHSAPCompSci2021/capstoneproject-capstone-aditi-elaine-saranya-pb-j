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
<<<<<<< Updated upstream
	 * Changes the top
=======
	 * Changes the top to a different one
>>>>>>> Stashed changes
	 */
	public void changeTop() {
		
	}
	
	/**
<<<<<<< Updated upstream
	 * Changes the bottom
=======
	 * Changes the bottom to a different one 
>>>>>>> Stashed changes
	 */
	public void changeBottom() {
	
	}
	
	/**
<<<<<<< Updated upstream
	 * Changes the shoes
=======
	 * Changes to shoes to a different shoe
>>>>>>> Stashed changes
	 */
	public void changeShoes() {
		
	}
	
	/**
<<<<<<< Updated upstream
	 * Changes the Accessory
=======
	 * Changes the accessory to something different 
>>>>>>> Stashed changes
	 */
	public void changeAccessory() {
		
	}
	
	/**
<<<<<<< Updated upstream
	 * Changes the face
=======
	 * Changes the face to a different one
>>>>>>> Stashed changes
	 */
	public void changeFace() {
		
	}
<<<<<<< Updated upstream
	/**
	 * Calculates the total cost of the outfit
	 * @return total cost of the outfit
=======
	
	/**
	 * Calculates the cost of the entire outfit 
	 * @return totalCost value of entire outfit
>>>>>>> Stashed changes
	 */
	public double calculateTotalCost() {
		return totalCost;
	}
}
