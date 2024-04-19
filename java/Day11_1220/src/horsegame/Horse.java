package horsegame;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Horse extends Canvas implements Runnable {

	public static final int HORSE_SIZE = 30;
	private int x;
	private int y;
	
	public Horse() {
		x = 10;
		y = 10;
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		
		g.setColor(Color.ORANGE);
		g.fillOval(x, y, HORSE_SIZE, HORSE_SIZE);
		
		if(x == 710) {
			rankPaint(g);
		}
	}
	
	public void rankPaint(Graphics g) {
		g.setColor(Color.BLACK);
		g.drawString("бу", x + HORSE_SIZE, y);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		Random rand = new Random();
		
		for(int i = 0; i < 70; i++) {
			x += 10;
			repaint();
			try {
				Thread.sleep(100 + rand.nextInt(100));
			} catch(Exception e) {
				System.out.println("");
			}
		}
	}
}
