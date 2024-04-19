package duck;

import java.awt.Graphics;
import java.util.Random;

public abstract class Duck {
	
	protected int x;
	protected int y;
	protected static String myShape = "Duck";
	
	public static int n = 0;
	
	public Duck(){
		Random rand = new Random();
		x = rand.nextInt(MyFrame.FRAME_WIDTH-100)+50;
		y = rand.nextInt(MyFrame.FRAME_HEIGHT-140)+70;
	}

	// overloading
	public Duck(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	// �߻� �޼ҵ� = ���� + ����(x)
	public abstract void display();
	
	public void swim() {
		System.out.println("���� �� . . .");
	}
	
	public void quack() {
		System.out.println("�в�");
	}

	public void display(Graphics g) {
		// TODO Auto-generated method stub
//		g.fillOval(x, y, 50, 50);
	}
	
}
