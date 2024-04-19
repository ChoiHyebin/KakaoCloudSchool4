package mycom.dept.test;

import java.util.Random;

public class Enemy {
	private int x;
	private int y;
	private String shape;
	
	public Enemy() {
		Random rand = new Random();
		x = rand.nextInt(500);
		y = rand.nextInt(500);
		shape = "Enemy";
	}
	
	public Enemy(int mx, int my) {
		x = mx;
		y = my;
		shape = "Enemy";
	}
	
	public void display() {
		System.out.print(x + ", " + y + ": ");
		System.out.println(shape);
	}
	
	public void moveLeft() {
		x -= 1;
		display();
	}
	
	public void moveRight() {
		x += 1;
		display();
	}
	
	public void moveUp() {
		y += 1;
		display();
	}
	
	public void moveDown() {
		y -= 1;
		display();
	}
}
