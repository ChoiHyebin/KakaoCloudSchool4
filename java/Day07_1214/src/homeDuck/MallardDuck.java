package homeDuck;

public class MallardDuck extends Duck {
	
	public MallardDuck() {
//		super();
	}
	
	public MallardDuck(int x, int y) {
		super(x, y);
	}

	@Override
	public void display() {
		
		this.myShape = "MallardDuck";
		System.out.println(x + ", " + y + " = " + this.myShape);
	}
	
}
