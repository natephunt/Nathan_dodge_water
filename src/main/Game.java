/*
 * NaThAn's dodGe WatEr GAmE
 * 
 * 
 * 
 * 
 */




package main;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JFrame;

public class Game {

	static JFrame frame;
	
	public static DrawWindow drawPanel;
	
	public static int windowHeight = 596;
	public static int windowWidth = 896;
	
	// 4 make an array list to hold our waters
	public static ArrayList <Water> waters = new ArrayList<Water>();
	
	//5
	public static Player player =  new Player();
	public static Spawner spawn1 = new Spawner();
	public static Spawner spawn2 = new Spawner();
	public static Spawner spawn3 = new Spawner();
	public static Spawner spawn4 = new Spawner();
	
	// TODO public static Spawner spawn1 = new Spawner();

	
	private void prepareGUI() {
		//1
		frame = new JFrame("DoDge ThEm WatErs");
		//2
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//3
		drawPanel = new DrawWindow();
		//3a
		new Input(drawPanel);
		//4
		frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
		//5
		frame.setResizable(false);
		//6
		drawPanel.setFocusable(true);
		drawPanel.requestFocusInWindow();
		//7
		frame.setSize(windowWidth, windowHeight);
		//8
		frame.setLocationByPlatform(true);
		frame.setVisible(true);
		
		update();
		
	//end of prepare GUI
	}
	
	public static void main(String[] args) {
		

		
		
		//initialize the game
		init();
		
		// TODO init and prep
		new Game().prepareGUI();
	//end of main driver
	}
	
	
	
	
	public static void init() {
		
		
		
		spawn1= new Spawner();
		spawn2= new Spawner();
		spawn3= new Spawner();
		spawn4= new Spawner();
		player= new Player();
		
		
		spawn1.x=800;
		spawn2.x=600;
		spawn3.x=400;
		spawn4.x=200;
		//new Water(256, 0);
		
		waters.clear();
		
	}
	
	
	public static void update() {
		while (true) {
			
			if (player.lives>0) {
			
				player.update();
				spawn1.update();
				spawn2.update();
				spawn3.update();
				spawn4.update();
				
				//update water
				for (int i = 0; i < waters.size(); i++) {
					waters.get(i).update();
				}
			}
			try {
				Thread.sleep(16);
			}catch(Exception e){
				e.printStackTrace();
			}
			
			frame.repaint();
		}
	//end of the update method
	}

	
}
