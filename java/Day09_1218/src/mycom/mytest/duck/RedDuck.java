package mycom.mytest.duck;

import java.awt.Color;
import java.awt.Graphics;

public class RedDuck extends Duck implements Quackable, Flyable {

	public RedDuck() {
		super();
	}
	
	public RedDuck(int x, int y) {
		super(x, y);
	}

	@Override
	public void display(Graphics g) {
		g.setColor(Color.RED);
		g.fillOval(x, y, Duck.DUCK_SIZE, Duck.DUCK_SIZE);
	}
	
	@Override
	public void quack(Graphics g) {
		g.setColor(Color.RED);
		g.drawString("²Ð²Ð", x+DUCK_SIZE,y-1);
	}

	@Override
	public void fly(Graphics g) {
		g.setColor(Color.RED);
		g.drawString("³¯´Ù", x, y+DUCK_SIZE);
	}

}
