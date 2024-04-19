package mycom.mytest.duck;

import java.awt.Color;
import java.awt.Graphics;

public class MallardDuck extends Duck implements Quackable, Flyable {
	
	public MallardDuck() {
		super();
	}
	
	public MallardDuck(int x, int y) {
		super(x, y);
	}
	
	@Override
	public void display(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillOval(x, y, Duck.DUCK_SIZE, Duck.DUCK_SIZE);
	}
	
	@Override
	public void quack(Graphics g) {
		g.setColor(Color.BLUE);
		g.drawString("�в�", x+DUCK_SIZE,y-1);
	}

	@Override
	public void fly(Graphics g) {
		g.setColor(Color.BLUE);
		g.drawString("����", x, y+DUCK_SIZE);
	}

}
