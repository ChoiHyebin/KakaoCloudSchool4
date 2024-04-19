package mycom.dept.test;

import java.util.Random;

public class Player {
	
	private int x;
	private int y;
	private String shape;
	
	// 생성자 = constructor
	public Player() {
		Random rand = new Random();
		x = rand.nextInt(800);
		y = rand.nextInt(600);
		shape = "Player";
	}

	// 메소드의 오버로딩(overloading)
	public Player(int mx, int my) {
		x = mx;
		y = my;
		shape = "Player";
	}
	
	public void display() {
		System.out.print(this.x + ", " + this.y + ": ");
		System.out.println(this.shape);
	}
	
	public void moveLeft() {
		this.x -= 1;
		display();
	}
	
	public void moveRight() {
		this.x += 1;
		display();
	}
}
