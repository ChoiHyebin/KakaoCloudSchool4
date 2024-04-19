package Inheritance;

public class Player extends Character {
	
	public Player() {
		super();
	}
	
	public Player(int x, int y) {
		super(x, y);
	}

	@Override
	public void display() {
		this.myShape = "Player";
		super.display();
	}
}
