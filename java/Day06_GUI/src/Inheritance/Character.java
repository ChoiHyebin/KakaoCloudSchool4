package Inheritance;

import java.util.Random;

public class Character {
	
	protected int x;
	protected int y;
	protected String myShape;
	
	public Character() {
		Random rand = new Random();
		this.x = rand.nextInt(800); // 0~799
		this.y = rand.nextInt(600); // 0~599
		this.myShape = "Character";
	}
	
	public Character(int x, int y) {
		this.x = x;
		this.y = y;
		this.myShape = "Character";
	}
	
	public void display() {
		System.out.println(x + ", " + y + " = " + myShape);
	}
	
	public void moveLeft() {
		x -= 1;
		System.out.println("moveLeft: " + x);
	}
	
	public void moveRight() {
		x += 1;
		System.out.println("moveRight: " + x);
	}
}
