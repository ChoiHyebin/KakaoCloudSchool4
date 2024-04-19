package Inheritance;

public class Enemy extends Character {
	
	public Enemy() {
		super();
	}
	
	public Enemy(int x, int y) {
		super(x, y);
	}
	
	@Override
	public void display() {
		this.myShape = "Enemy";
		super.display();
	}
	
	public void moveUp() {
		y += 1;
		System.out.println("moveUp: " + y);
	}
	
	public void moveDown() {
		y -= 1;
		System.out.println("moveDown: " + y);
	}
}
