package mycom.mytest.duck;

import java.awt.Graphics;
import java.util.Random;

public class DuckManager {
	
	private static DuckManager duckManager = new DuckManager();

	private Duck[] darr = new Duck[20];
	
	public DuckManager() {
		makeDucks();
	}
	
	private void makeDucks() {
		Random rand = new Random();
		int type = 0;
		
		for(int i = 0; i < darr.length; i++) {
			type = rand.nextInt(4); // 0, 1, 2, 3
			
			switch(type) {
			case 0:
				darr[i] = new MallardDuck(); // upcasting
				break;
			case 1:
				darr[i] = new RedDuck();
				break;
			case 2:
				darr[i] = new RubberDuck();
				break;
			case 3:
				darr[i] = new DecoyDuck();
				break;
			default:
				darr[i] = new MallardDuck();
			}
		}
	}
	
	public static DuckManager getInstance() {
		return duckManager;
	}
	
	public void displayAllDucks(Graphics g) {
		if(darr!=null) {
			for(Duck d:darr) {
				if(d!=null) {
					d.display(g); // ��ĳ������ �ƴ��� �����ε��� �޼ҵ�� �ڽ� ���� �Ҹ�
				}
			}
		}
	}
	
	public void swimAllDucks(Graphics g) {
		for(Duck d:darr) {
			d.swim(g);
		}
	}
	
	public void quackAllDucks(Graphics g) {
		for(Duck d:darr) {
			// �ڽ�(quack) --> Duck ��ĳ���� --> �ڽ�(quack)
			if(d instanceof Quackable) {
				((Quackable)d).quack(g);
			}
		}
	}
	
	public void flyAllDucks(Graphics g) {
		for(Duck d:darr) {
			if(d instanceof Flyable) {
				((Flyable)d).fly(g);
			}
		}
	}
}
