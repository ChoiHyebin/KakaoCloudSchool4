package mycom.mydept.test;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Frame f = new Frame();
		Color bgColor = new Color(0, 0, 200);
		Color textColor = new Color(255, 255, 255);
		
		Label title = new Label("�α��� ȭ��");
		Label id = new Label("���̵�: ");
		Label pw = new Label("��й�ȣ: ");
		title.setBackground(bgColor);
		title.setForeground(textColor);
		title.setAlignment(Label.CENTER);
		
		TextField inputId = new TextField();
		TextField inputPw = new TextField();
		
		Button loginBtn = new Button("�α���");
		Button cancelBtn = new Button("���");
		loginBtn.setBackground(bgColor);
		cancelBtn.setBackground(bgColor);
		loginBtn.setForeground(textColor);
		cancelBtn.setForeground(textColor);
		
		Panel p = new Panel();
		GridLayout layout = new GridLayout(5, 4);
		// ��ġ�� ���� ��ġ ����
		p.setLayout(layout);
		
		Panel btnPanel = new Panel();
		
		p.add(title, "North");
		p.add(id, "Center");
		p.add(inputId, "Center");
		p.add(pw, "Center");
		p.add(inputPw, "Center");
		btnPanel.add(loginBtn);
		btnPanel.add(cancelBtn);
		
		f.add(p);
		f.add(btnPanel, "South");

		f.setSize(500, 350);
		f.setVisible(true);
	}

}
