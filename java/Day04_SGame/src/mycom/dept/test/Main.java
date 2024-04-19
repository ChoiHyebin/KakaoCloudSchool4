package mycom.dept.test;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// player1
		Player pobj = new Player();
		pobj.display(); // pobj.x ==> display(this, h)
		pobj.moveLeft();
		pobj.moveRight();
		System.out.println("---------");
		
		Player pobj2 = new Player(156, 200);
		pobj2.display(); // pobj2.x
		System.out.println("---------");
		
		// enemy1, 2, 3, 4
		Enemy eobj = new Enemy();
		eobj.display();
		eobj.moveLeft();
		eobj.moveRight();
		eobj.moveUp();
		eobj.moveDown();
		System.out.println("---------");
		
		Enemy eobj2 = new Enemy(150, 200);
		eobj2.display();
		System.out.println("---------");
		
		Enemy eobj3 = new Enemy();
		eobj3.display();
		System.out.println("---------");
		
		Enemy eobj4 = new Enemy();
		eobj4.display();
	}

}