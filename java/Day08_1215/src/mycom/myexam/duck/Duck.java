package mycom.myexam.duck;

import java.awt.Graphics;
import java.util.Random;

import mycom.myexam.gui.MyFrame;

public abstract class Duck {
	
	protected int x;
	protected int y;
	public static final int DUCK_SIZE = 30;
	
	public Duck() {
		Random rand = new Random();
		x = rand.nextInt(MyFrame.FRAME_WIDTH-100)+50;
		y = rand.nextInt(MyFrame.FRAME_HEIGHT-140)+70;
	}
	
	public Duck(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public abstract void display(Graphics g);
	
	public final void swim(Graphics g) {
		g.drawString("¼ö¿µ", x-20, y-1);
	}
	
}
