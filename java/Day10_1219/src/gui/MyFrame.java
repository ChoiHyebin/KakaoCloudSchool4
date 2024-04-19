package gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class MyFrame extends Frame {
	
	public static final int FRAME_WIDTH = 800;
	public static final int FRAME_HEIGHT = 600;

	private ArrayList<MyShape> list = new ArrayList<MyShape>();
	
	Button btn_color = new Button("배경색 바꾸기");
	Button btn_exit = new Button("종료하기");
	
	Panel pNorth = new Panel();

	public MyFrame() {
		// 이벤트 처리기 선언 이후, 등록
		btn_color.addActionListener(new MyHandler());
		btn_exit.addActionListener(new MyHandler());
		this.addMouseListener(new MyMouseHandler());
		
		pNorth.add(btn_color);
		pNorth.add(btn_exit);
		
		this.add(BorderLayout.NORTH, pNorth);
		
		this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		this.setVisible(true);
	}
	
	// --- inner class
	class MyHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
//			System.out.println(e.getActionCommand());
			if(e.getSource() == btn_color) {
				MyFrame.this.setBackground(new Color(255, 255, 0));
			}
			else if(e.getSource() == btn_exit) {
				System.exit(0);
			}
		}
		
	}
	
	// --inner
	class MyMouseHandler extends MyMouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			int mx = e.getX();
			int my = e.getY();
			
			list.add(new MyShape(mx, my));
			repaint(); // repaint => update(g) => paint(g)
		}
	}
	
	@Override
	public void paint(Graphics g) {
		if(list != null) {
			for(MyShape s:list) {
				s.display(g);
			}
//			for(Object s:list) {
//				((MyShape)s).display(g);
//			}
		}
	}
	
}
