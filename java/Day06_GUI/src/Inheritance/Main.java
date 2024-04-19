package Inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Player pobj = new Player(300, 400);
		pobj.display();
		
		Enemy eobj = new Enemy(200, 500);
		eobj.display();
		eobj.moveLeft();
		eobj.moveRight();
		eobj.moveUp();
		eobj.moveDown();
	}

}
