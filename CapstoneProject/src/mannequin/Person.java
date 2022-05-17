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
	private Clothes clothes;
	private TopsList topsList;
	private BottomsList bottomsList;
	private ShoesList shoesList;
	private AccessoryList accessoriesList;
	private String weatherCondition;
	private String formalityType;
	private String genderExpression;
	/**
	 * Constructs a person and initializes all the lists and clothing
	 */
	public Person() {
		weatherCondition = "Hot";
		formalityType = "Casual";
		genderExpression = "Neutral";
		
		topsList = new TopsList();
		bottomsList = new BottomsList();
		shoesList = new ShoesList();
		
		accessoriesList = new AccessoryList();
//		face = new Face();
	}
	
	/**
	 * Creates the initial outfit
	 */
	public void setClothes() {
		top = topsList.pickNextEntry();
		bottom = bottomsList.pickNextEntry();
		shoesL = shoesList.pickNextEntry("left");
		shoesR = shoesList.pickNextEntry("right");
		accessory = accessoriesList.pickNextEntry();

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


		if (accessory != null) {
			if(accessory.getColor() != null) {
				marker.tint(accessory.getColor().getRGB());
			}else
				marker.noTint();
			accessory.getImage().resize(800, 800);
			marker.image(accessory.getImage(), -96,-268);
		}	
		
		if(shoesL.getColor() != null) {
			marker.tint(shoesL.getColor().getRGB());
		}else
			marker.noTint();
		shoesL.getImage().resize(700,700);
		marker.image(shoesL.getImage(), -125, 380);
		
		
		if(shoesR.getColor() != null) {
			marker.tint(shoesR.getColor().getRGB());
		}else
			marker.noTint();
		shoesR.getImage().resize(700,700);
		marker.image(shoesR.getImage(), 40, 380);
		
		
		if(bottom.getColor() != null) {
			marker.tint(bottom.getColor().getRGB());
		}else
			marker.noTint();
		bottom.getImage().resize(750, 750);
		marker.image(bottom.getImage(), -72, 160);
		
		
		if(top.getColor() != null) {
			marker.tint(top.getColor().getRGB());
		}else {
			marker.noTint();
		}
		top.getImage().resize(1000, 1000);
		marker.image(top.getImage(), -200,-200);
		
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

		shoesL = shoesList.pickNextEntry("left");
		shoesR = shoesList.pickNextEntry("right");
	}
	
	/**

	 * Changes the Accessory
=======
	 * Changes the accessory to something different 

	 */
	public void changeAccessory() {
		accessory = accessoriesList.pickNextEntry();

	}
	
	/**
	 * Randomly picks an outfit
	 */
	public void pickRandom() {
		top = topsList.pickRandom();
		bottom = bottomsList.pickRandom();
		accessory = accessoriesList.pickRandom();
		shoesL = shoesList.pickRandom();
		shoesR = shoesList.pickNextEntry("right");
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
		double total = top.getPrice() + bottom.getPrice() + accessory.getPrice() + shoesL.getPrice() + shoesR.getPrice();
		return total;
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
	
	/**
	 * Sets the weather condition of the day and sets the weather criteria for the clothes lists 
	 * @param w the weather condition
	 */
	public void setWeatherCondition(String w) {
		topsList.setWeatherCondition(w);
		bottomsList.setWeatherCondition(w);
		shoesList.setWeatherCondition(w);
		accessoriesList.setWeatherCondition(w);
		weatherCondition = w;
	}
	
	/**
	 * Gets the weather condition that the person wants to match the outfit to
	 * @return the weather condition
	 */
	public String getWeatherCondition() {
		return weatherCondition;
	}
	
	
	/**
	 * Sets the formality type of the occasion and sets the formality criteria for the clothes lists 
	 * @param w the formality type
	 */
	public void setFormalityType(String w) {
		topsList.setFormalityType(w);
		bottomsList.setFormalityType(w);
		shoesList.setFormalityType(w);
		accessoriesList.setFormalityType(w);
		formalityType = w;
	}
	
	/**
	 * Gets the formality type that the person wants to match the outfit to
	 * @return the formality type
	 */
	public String getFormalityType() {
		return formalityType;
	}
	
	
	/**
	 * Sets the gender expression and sets the expression criteria for the clothes lists 
	 * @param w the gender expression
	 */
	public void setGenderExpression(String w) {
		topsList.setClothesGender(w);
		bottomsList.setClothesGender(w);
		shoesList.setClothesGender(w);
		accessoriesList.setClothesGender(w);
		genderExpression = w;
	}
	
	/**
	 * Gets the gender expression that the person wants to match the outfit to
	 * @return the gender expression
	 */
	public String getGenderExpression() {
		return genderExpression;
	}
	
	
	
	
	
}
