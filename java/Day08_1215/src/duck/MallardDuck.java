package duck;

import java.awt.Color;
import java.awt.Graphics;

public class MallardDuck extends Duck {
	
	public MallardDuck() {
//		super();
	}
	
	public MallardDuck(int x, int y) {
		super(x, y);
	}

	@Override
	public void display(Graphics g) {
		g.setColor(new Color(0, 200, 0));
		g.fillOval(x, y, 50, 50);
		System.out.println(super.n);
	}

	@Override
	public void display() {
		this.myShape = "MallardDuck";
		System.out.println(x + ", " + y + " = " + this.myShape);
	}
	
}
