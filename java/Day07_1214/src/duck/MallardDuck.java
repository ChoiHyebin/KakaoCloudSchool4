package duck;

public class MallardDuck extends Duck {
	
	public MallardDuck() {
//		super();
	}
	
	public MallardDuck(int x, int y) {
		super(x, y);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		this.myShape = "MallardDuck";
		System.out.println(x + ", " + y + " = " + this.myShape);
	}
	
}
