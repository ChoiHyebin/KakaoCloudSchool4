package mycom.mydept.test;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Frame f = new Frame();
		
		// ȭ�� ����
		Button btn = new Button("���� �ٲٱ�");
		Button btnExit = new Button("�����ϱ�");
		
		Panel pNorth = new Panel();
		
		// ���� ����
		pNorth.add(btn);
		pNorth.add(btnExit);
		
		f.add("North", pNorth);
		
//		Color bgColor = new Color(190, 0, 255);
//		f.setBackground(bgColor);
		
		f.setSize(800, 600);
		f.setVisible(true); // OS ��Ź
	}

}
