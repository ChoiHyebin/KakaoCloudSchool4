package duck;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.util.Random;

import myShape.MyShape;

public class MyFrame extends Frame {

	public static final int FRAME_WIDTH = 800;
	public static final int FRAME_HEIGHT = 600;
	
	MallardDuck mallard[] = new MallardDuck[5];
	RedDuck red[] = new RedDuck[5];
	
	public MyFrame() {
		super(); // Frame f = new Frame();
		this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		this.setVisible(true);
		Duck.n += 1;
		
		makeDuck();
//		Random rand = new Random();
	}
	
	private void makeDuck() {
		if(mallard != null) {
			for(int i = 0; i < mallard.length; i++) {
				mallard[i] = new MallardDuck();
			}
		}
	}
	
	@Override
	public void paint(Graphics g) {
		if(mallard != null) {
			for(MallardDuck d:mallard) {
				if(d != null) {
					d.display(g);
				}
			}
		}
	}
	
}