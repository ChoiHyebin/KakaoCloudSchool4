package duck;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		MallardDuck md = new MallardDuck();
//		md.display();
//		
//		RedDuck rd = new RedDuck();
//		rd.display();
		
		int[] iarr = new int[10];
		
		for(int v:iarr) {
			System.out.println(v);
		}
		System.out.println("================");
		
		// 참조형의 정적 배열
		MallardDuck[] marr = new MallardDuck[10];
		for(MallardDuck v:marr) {
			v.display();
		}
	}

}
