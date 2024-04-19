package duck;

import java.awt.Color;
import java.awt.Graphics;

public class RedDuck extends Duck {

	public RedDuck(){
		super();
	}
	
	public RedDuck(int x, int y) {
		super(x, y);
	}

	public void display(Graphics g) {
		g.setColor(new Color(200, 0, 0));
		g.fillOval(x, y, 50, 50);
		System.out.println(super.n);
	}
	
	@Override
	public void display() {
		this.myShape = "RedDuck";
		System.out.println(x + ", " + y + " = " + myShape);
	}
}
