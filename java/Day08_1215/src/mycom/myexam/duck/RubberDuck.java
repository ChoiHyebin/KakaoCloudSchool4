package mycom.myexam.duck;

import java.awt.Color;
import java.awt.Graphics;

public class RubberDuck extends Duck {
	
	public RubberDuck() {
		super();
	}
	
	public RubberDuck(int x, int y) {
		super(x, y);
	}

	@Override
	public void display(Graphics g) {
		g.setColor(Color.ORANGE);
		g.fillOval(x, y, Duck.DUCK_SIZE, Duck.DUCK_SIZE);
		quack(g);
	}
	
	public void quack(Graphics g) {
		g.drawString("»à»à", x + Duck.DUCK_SIZE, y - 1);
	}
}
