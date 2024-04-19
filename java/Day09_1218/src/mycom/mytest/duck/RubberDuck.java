package mycom.mytest.duck;

import java.awt.Color;
import java.awt.Graphics;

public class RubberDuck extends Duck implements Quackable {

	public RubberDuck() {
		super();
	}
	
	public RubberDuck(int x, int y) {
		super(x, y);
	}
	
	@Override
	public void display(Graphics g) {
		// TODO Auto-generated method stub
		
		g.setColor(Color.ORANGE);
		g.fillOval(x, y, Duck.DUCK_SIZE, Duck.DUCK_SIZE);
	}

	@Override
	public void quack(Graphics g) {
		g.setColor(Color.ORANGE);
		g.drawString("»à»à", x+DUCK_SIZE,y-1);
	}

}
