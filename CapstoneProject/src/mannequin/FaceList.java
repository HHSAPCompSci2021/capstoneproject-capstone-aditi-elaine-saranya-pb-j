package mannequin;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import mannequin.clothes.Bottom;
import processing.core.PImage;

public class FaceList {
	private ArrayList<Face> faces = new ArrayList<>();
	private int currentIndex;
	/**
	 * Constructs a Face containing an ArrayList of all the faces
	 */
	public FaceList() {

		faces=  new ArrayList<>();
		currentIndex = -1;

		BufferedImage img = null;
		try {
			img = ImageIO.read(new File("res/angryface.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage angryFace = new PImage(img);
		Face face1 = new Face(angryFace);
		faces.add(face1);

		img = null;
		try {
			img = ImageIO.read(new File("res/happyface.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage happyFace = new PImage(img);
		Face face2 = new Face(happyFace);
		faces.add(face2);
		
		img = null;
		try {
			img = ImageIO.read(new File("res/legoface.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage legoFace = new PImage(img);
		Face face3 = new Face(legoFace);
		faces.add(face3);
		
		img = null;
		try {
			img = ImageIO.read(new File("res/mustacheface.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage mustacheFace = new PImage(img);
		Face face4 = new Face(mustacheFace);
		faces.add(face4);
		
		img = null;
		try {
			img = ImageIO.read(new File("res/pirateface.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage pirateFace = new PImage(img);
		Face face5 = new Face(pirateFace);
		faces.add(face5);

		img = null;
		try {
			img = ImageIO.read(new File("res/robotface.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage robotFace = new PImage(img);
		Face face6 = new Face(robotFace);
		faces.add(face6);
		
		img = null;
		try {
			img = ImageIO.read(new File("res/smirkface.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage smirkFace = new PImage(img);
		Face face7 = new Face(smirkFace);
		faces.add(face7);
		
		img = null;
		try {
			img = ImageIO.read(new File("res/toungeface.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage tongueFace = new PImage(img);
		Face face8 = new Face(tongueFace);
		faces.add(face8);
		
		img = null;
		try {
			img = ImageIO.read(new File("res/yawnface.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PImage yawnFace = new PImage(img);
		Face face9 = new Face(yawnFace);
		faces.add(face9);


	}

	/**
	 * Picks a random face
	 * 
	 * @return The image of the face picked
	 */
	public Face pickRandom() {
		int index = (int) (Math.random() * faces.size());
		while (faces.get(index) == null) {
			index = (int) (Math.random() * faces.size());
		}
		return faces.get(index);
	}

	/**
	 * Picks the next face
	 * 
	 * @return The image of the face picked
	 */
	public Face pickNextEntry() {

		if (currentIndex == faces.size() - 1)
			currentIndex = -1;
		currentIndex++;
		return faces.get(currentIndex);
	}
}
