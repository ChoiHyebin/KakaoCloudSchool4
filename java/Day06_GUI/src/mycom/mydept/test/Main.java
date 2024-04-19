package mycom.mydept.test;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Frame f = new Frame();
		
		// 화면 구성
		Button btn = new Button("배경색 바꾸기");
		Button btnExit = new Button("종료하기");
		
		Panel pNorth = new Panel();
		
		// 계층 구조
		pNorth.add(btn);
		pNorth.add(btnExit);
		
		f.add("North", pNorth);
		
//		Color bgColor = new Color(190, 0, 255);
//		f.setBackground(bgColor);
		
		f.setSize(800, 600);
		f.setVisible(true); // OS 부탁
	}

}
