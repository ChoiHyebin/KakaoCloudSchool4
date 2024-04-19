package homeDuck;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class MyShape {

	private int x;
	private int y;
	private Graphics g;
	private Color color;
	private Random rand;
	
	private int shape;
	private int triangleX[] = { 20, 60, 110 };
	private int triangleY[] = { 100, 30, 100 };
	private int starX[] = {50,35,0,23,20,50,80,73,100,65};
	private int starY[] = {0,30,40,65,100,85,100,65,40,30};
	
	public MyShape(Graphics g) {
		this.g = g;
		rand = new Random();
		x = rand.nextInt(800);
		y = rand.nextInt(600);
		color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
		shape = rand.nextInt(4);
	}
	
	public void trianglePosition() {
		for(int i = 0; i < triangleX.length; i++) {
			triangleX[i] += x;
			triangleY[i] += y;
		}
	}
	
	public void starPosition() {
		for(int i = 0; i < starX.length; i++) {
			starX[i] += x;
			starY[i] += y;
		}
	}
	
	public void display() {
		g.setColor(color);
		
		if(shape == 0) {
			g.fillOval(x, y, 50, 50);
		}
		else if (shape == 1) {
			trianglePosition();
			g.fillPolygon(triangleX, triangleY, 3);
		}
		else if (shape == 2) {
			g.fillRect(x, y, 25, 25);
		}
		else {
			starPosition();
			g.fillPolygon(starX, starY, 10);
		}
	}
	
}
