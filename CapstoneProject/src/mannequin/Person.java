package mannequin;

import mannequin.clothes.Accessory;
import mannequin.clothes.Bottom;
import mannequin.clothes.Shoes;
import mannequin.clothes.Top;
import processing.core.PApplet;
/**
 * Represents a person who has different types of clothing
 * @author 
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
	 * 
	 */
	public void changeTop() {
		
	}
	
	/**
	 * 
	 */
	public void changeBottom() {
	
	}
	
	/**
	 * 
	 */
	public void changeShoes() {
		
	}
	
	/**
	 * 
	 */
	public void changeAccessory() {
		
	}
	
	/**
	 * 
	 */
	public void changeFace() {
		
	}
	public double calculateTotalCost() {
		return totalCost;
	}
}
