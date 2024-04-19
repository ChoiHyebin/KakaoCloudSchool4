package mycom.mytest.gui;

import java.awt.Frame;
import java.awt.Graphics;

import mycom.mytest.duck.DuckManager;

public class MyFrame extends Frame {

	public static int FRAME_WIDTH = 800;
	public static int FRAME_HEIGHT = 600;
	
//	DuckManager mgr = new DuckManager();

	DuckManager mgr = DuckManager.getInstance();
	
	public MyFrame() {
		super(); // Frame f = new Frame();
		
		this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		this.setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		if(mgr!=null) {
			mgr.displayAllDucks(g);
			mgr.swimAllDucks(g);
			mgr.quackAllDucks(g);
			mgr.flyAllDucks(g);
		}
	}
}
