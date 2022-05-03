package mannequin.clothes;
import java.awt.Color;
import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;

public abstract class Clothes extends PApplet{
	
	private ArrayList<PImage> clothes;
	private Color color;
	private String weather;
	private String formality;
	private double price;
	private String website;
	
	public void add(PImage image) {
		
	}
	
	public abstract void draw();
	
	public PImage pickRandom() {
		return null;
	}
	
	public PImage pickNextEntry() {
		return null;
	}
	
	public Color getColor() {
		return color;
	}
	
	public void setColor (Color c) {
		color = c;
	}
	
	public String getWeather () {
		return weather;
	}
	
	public void setWeather (String w) {
		weather = w;
	}
	
	public String getFormality() {
		return formality;
	}
	
	public void setFormality(String f) {
		formality = f;
	}
	
	public double getPrice() {
		return price;
	}
	

}
