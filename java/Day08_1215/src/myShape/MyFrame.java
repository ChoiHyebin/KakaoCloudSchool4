package myShape;

import java.awt.Frame;
import java.awt.Graphics;

public class MyFrame extends Frame {
	
	public static final int FRAME_WIDTH = 800;
	public static final int FRAME_HEIGHT = 600;

	private MyShape[] arr = new MyShape[10];
	
	public MyFrame() {
		super(); // Frame f = new Frame();
		
		makeShape();
		
		this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		this.setVisible(true);
	}

	private void makeShape() {
		if(arr != null) {
			for(int i = 0; i < arr.length; i++) {
				arr[i] = new MyShape();
			}
		}
	}
	
	@Override
	public void paint(Graphics g) { // graphic context
		if(arr != null) {
			for(MyShape s:arr) {
				if(s != null) {
					s.display(g);
				}
			}
		}
	}
}
