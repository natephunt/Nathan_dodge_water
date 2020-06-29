package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Player {

	
	int x,y,w,h;
	int lives = 3;
	
	BufferedImage img = Loader.bat;
	
	HitBox hb0, hb1;
	
	
	
	public Player () {
		this.x = 256;
		this.y = 256;
		this.w = 64;
		this.h = 64;
		
		
		this.hb0 = new HitBox('C', this.x - 2, this.y + 12);
		this.hb0.setRad(40);
		
		this.hb1 = new HitBox('C', this.x + 20, this.y -10);
		this.hb1.setRad(40);
		
	//end of player constructor
	}
	
	public void updateHitBox() {

		this.hb1.x = this.x + 12;
		this.hb1.y = this.y - 6;
		
		this.hb0.x = this.x +19;
		this.hb0.y = this.y +22;
		
		
	
	}
	
	public void update() {
		
		
		
		for (int i = 0; i < Game.waters.size(); i++) {
			
			HitBox H = Game.waters.get(i).hb;
			
			if (Loader.hit(this.hb0, H) || Loader.hit(this.hb1, H)){
			
				System.out.println("Hit");
				
				this.lives--;
				
				if (lives <= 0) {
					
					
					
					
				}
				Game.waters.remove(i);
				break;
				
			}
		}
		
		
		
		
	}
	
	public void draw(Graphics g) {
		g.drawImage(this.img, this.x, this.y, this.w, this.h, null );
		
		g.setColor(Color.red);
		g.fillRect(45, 40, 50*lives, 35);
		
		//this.hb0.draw(g);
		//this.hb1.draw(g);
		
	}
	
	
//end of the player class
}
