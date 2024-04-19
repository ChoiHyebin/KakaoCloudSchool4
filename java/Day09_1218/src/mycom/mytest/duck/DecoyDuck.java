package mycom.mytest.duck;

import java.awt.Color;
import java.awt.Graphics;

public class DecoyDuck extends Duck {

	public DecoyDuck() {
		super();
	}
	
	public DecoyDuck(int x, int y) {
		super(x, y);
	}
	
	@Override
	public void display(Graphics g) {
		// TODO Auto-generated method stub
		
		g.setColor(Color.GREEN);
		g.fillOval(x, y, Duck.DUCK_SIZE, Duck.DUCK_SIZE);
	}

}
