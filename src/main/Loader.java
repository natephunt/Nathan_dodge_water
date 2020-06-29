// Nathan's dodge water 
//loader

package main;

import java.awt.image.BufferedImage;

public class Loader {

	public static BufferedImage waterDrop         = Resources.loadImage("water_drop.png");
	public static BufferedImage bat               = Resources.loadImage("bat.png");
	public static BufferedImage garden_background = Resources.loadImage("garden_background.png");
	public static BufferedImage cloud             = Resources.loadImage("cloud.png");
	public static BufferedImage healthBar         = Resources.loadImage("health_bar.png");
	
	public static boolean hit(HitBox A, HitBox B) {
		
		int R = (A.r + B.r)/2;
		
		int xDist = Math.abs(A.x - B.x);
		int yDist = Math.abs(A.y - B.y);
		
		return xDist < R && yDist < R;
		
		
		
		
		
	}
	
	
//end of loader	
}
