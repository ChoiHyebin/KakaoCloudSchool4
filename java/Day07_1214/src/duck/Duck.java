package duck;

import java.util.Random;

public abstract class Duck {
	
	protected int x;
	protected int y;
	protected static String myShape = "Duck";
	
	public Duck(){
		Random rand = new Random();
		x = rand.nextInt(800);
		y = rand.nextInt(600);
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
	
}
