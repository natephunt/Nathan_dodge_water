package main;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawWindow extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8242558423155622593L;

	public void paintComponent(Graphics g) {
		
		if (Game.player.lives <= 0) {
			drawGameOver(g);
		}else {
			drawStage0(g);
		}
		
	}
	
	public void drawStage0(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		g.drawImage(Loader.garden_background, 0, 0, this.getWidth(), this.getHeight(), null);
		
		
		Game.spawn1.draw(g);
		Game.spawn2.draw(g);
		Game.spawn3.draw(g);
		Game.spawn4.draw(g);

		
		//loop thrugh all the waters to draw them
		for (int i = 0; i < Game.waters.size();i++) {
			Game.waters.get(i).draw(g);
		}
		Game.player.draw(g);
		g.drawImage(Loader.healthBar, -20, -60, 256, 256, null);

	}
	public void drawGameOver(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0,0, this.getWidth(), this.getHeight());
		g.setColor(Color.WHITE);
		g.drawString("Game Over", this.getWidth()/2-60, this.getHeight()/2);
		g.drawString("Game By Nathan", this.getWidth()/2-60, this.getHeight()/2 + 15);
		g.drawString("With Help From Tyler", this.getWidth()/2-60, this.getHeight()/2+30);
		g.drawString("And Bat Art By Shana", this.getWidth()/2-60, this.getHeight()/2+45);
		g.drawString("Press Space To Retry", this.getWidth()/2-60, this.getHeight()/2+75);
	}
	
}
