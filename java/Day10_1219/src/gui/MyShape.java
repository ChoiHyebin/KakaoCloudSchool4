package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class MyShape {
	
	private int x;
	private int y;
	public final static int SHAPE_SIZE = 30;

	private Color color;
	
	public MyShape() {
		Random rand = new Random();
		x = rand.nextInt(MyFrame.FRAME_WIDTH-100)+50;
		y = rand.nextInt(MyFrame.FRAME_HEIGHT-140)+70;
	}
	
	public MyShape(int mx, int my) {
		this.x = mx;
		this.y = my;
	}
	
	public void display(Graphics g) {
		Random rand = new Random();
		color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
		g.setColor(color);
		g.fillOval(x, y, SHAPE_SIZE, SHAPE_SIZE);
	}
}
