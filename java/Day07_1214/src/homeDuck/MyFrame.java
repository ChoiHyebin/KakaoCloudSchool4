package homeDuck;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.util.Random;

public class MyFrame extends Frame {

	public final int FRAME_WIDTH = 800;
	public final int FRAME_HEIGHT = 600;
	
	private int r;
	private int g;
	private int b;

	MyShape[] myShape = new MyShape[10];
	
	public MyFrame() {
		super(); // Frame f = new Frame();
		this.setSize(FRAME_WIDTH, FRAME_HEIGHT); // 유지보수 할 때 다 변경 가능하도록
		this.setVisible(true);
		
		Random rand = new Random();
		r = rand.nextInt(256);
		g = rand.nextInt(256);
		b = rand.nextInt(256);
	}
	
	@Override
	public void paint(Graphics g) {
		for(int i = 0; i < 10; i++) {
			myShape[i] = new MyShape(g);
		}
		
		for(int i = 0; i < 10; i++) {
			myShape[i].display();
		}
	}
}
