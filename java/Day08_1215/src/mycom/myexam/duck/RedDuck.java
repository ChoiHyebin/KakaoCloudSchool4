package mycom.myexam.duck;

import java.awt.Color;
import java.awt.Graphics;

public class RedDuck extends Duck {
	
	public RedDuck() {
		super();
	}
	
	public RedDuck(int x, int y) {
		super(x, y);
	}

	@Override
	public void display(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.RED);
		g.fillOval(x, y, Duck.DUCK_SIZE, Duck.DUCK_SIZE);
		quack(g);
		fly(g);
	}
	
	public void quack(Graphics g) {
		g.drawString("�в�", x + Duck.DUCK_SIZE, y - 1);
	}
	
	public void fly(Graphics g) {
		g.drawString("����", x - 20, y + Duck.DUCK_SIZE);
	}
}
