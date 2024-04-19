package duck;

public class RedDuck extends Duck {

	public RedDuck(){
		super();
	}
	
	public RedDuck(int x, int y) {
		super(x, y);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
		this.myShape = "RedDuck";
		System.out.println(x + ", " + y + " = " + myShape);
	}
}
