package mycom.mytest.exception;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 0;
		int j = 100;
		int z = 0;
		
//		if(i != 0) {
//			z = j / i;
//		}
		
		try {
			z = j / i;
			System.out.println(z);
		}
		catch(ArithmeticException e) {
			System.out.println("분모는 0이 될 수 없음.");
		}
	}

}
