package horsegame;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends Frame {
	 public static final int FRAME_WIDTH=800;
	 public static final int FRAME_HEIGTH=600;
	 
	 private Button btn1 = new Button();
	 private Button btn2 = new Button();
	 
	 public final int HORSE_ARR_SIZE=5;
	 private Horse[] arr =new Horse[HORSE_ARR_SIZE];
	 
	 private boolean start;
	 
	 public MyFrame() {
		 makeHorse();
		 makeMainUi(); //ȭ�鱸��
		 setSize(FRAME_WIDTH, FRAME_HEIGTH);
		 setVisible(true);
	 }
	 
	 public void makeHorse() {
		 for(int i=0; i<arr.length; i++){
			 arr[i]=new Horse();
		 }
	 }
	 
	 private void makeMainUi(){
		 //��� �׷���
		 Panel pNorth = new Panel();
		 Panel pCenter = new Panel();
		 
		 btn1.setLabel("����");
		 btn1.addActionListener(new MyBtnHandler());
		 btn2.setLabel("����");
		 btn2.addActionListener(new MyBtnHandler());
		 
		 pNorth.add(btn1);
		 pNorth.add(btn2);
		 
		 pCenter.setLayout(new GridLayout(HORSE_ARR_SIZE,1));
		 
		 for(Horse h:arr){
			 pCenter.add(h);
		 }
		 
		 this.add("North",pNorth);
		 this.add("Center", pCenter);
	 }

	 class MyBtnHandler implements ActionListener {
		 Thread t[] = new Thread[HORSE_ARR_SIZE];
		 
		 @Override
		 public void actionPerformed(ActionEvent e) {
			 if(e.getSource() == btn1) {
				 for(int i = 0; i < HORSE_ARR_SIZE; i++) {
					 t[i] = new Thread(arr[i]);
				 }
				 for(int i = 0; i < HORSE_ARR_SIZE; i++) {
					 t[i].start();
				 }
			 }
			 else if(e.getSource() == btn2) {
				 System.exit(0);
			 }
		 }
	 }
}
