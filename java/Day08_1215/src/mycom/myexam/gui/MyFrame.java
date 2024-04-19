package mycom.myexam.gui;

import java.awt.Frame;
import java.awt.Graphics;
import java.util.Random;

import mycom.myexam.duck.DecoyDuck;
import mycom.myexam.duck.Duck;
import mycom.myexam.duck.MallardDuck;
import mycom.myexam.duck.RedDuck;
import mycom.myexam.duck.RubberDuck;

public class MyFrame extends Frame {
	public static final int FRAME_WIDTH = 800;
	public static final int FRAME_HEIGHT = 600;
	
	Duck[] darr = new Duck[20];
	
	public MyFrame() {
		super(); // Frame f = new Frame();
		
		makeDucks();
		
		this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		this.setVisible(true);
	}

	private void makeDucks() {
		//Duck d = new MallardDuck(); // 업캐스팅
		
		// 업캐스팅이 되면 change() 메소드 접근 불가
		
//		if(darr!=null) {
//			for(int i = 0; i < darr.length / 2; i++) {
//				darr[i] = new MallardDuck();
//			}
//			for(int i = darr.length / 2; i < darr.length; i++) {
//				darr[i] = new RedDuck();
//			}
//		}
		
		Random rand = new Random();
		int type = 0;
		
		for(int i = 0; i < darr.length; i++) {
			type = rand.nextInt(4); // 0, 1
			
			switch(type) {
			case 0:
				// 업캐스팅
				darr[i] = new MallardDuck();
				break;
			case 1:
				darr[i] = new RedDuck();
				break;
			case 2:
				darr[i] = new RubberDuck();
				break;
			case 3:
				darr[i] = new DecoyDuck();
				break;
			default:
				darr[i] = new MallardDuck();
			}
		}
	}
	
	@Override
	public void paint(Graphics g) {
		if(darr!=null) {
			for(Duck d:darr) {
				if(d!=null) {
					d.display(g);
					d.swim(g);
				}
			}
		}
	}
	
}
