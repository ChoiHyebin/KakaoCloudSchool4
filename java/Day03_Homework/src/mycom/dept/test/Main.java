package mycom.dept.test;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("1�� ��");
		for(int i = 1; i < 6; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print('*');
			}
			System.out.println("");
		}
		
		System.out.println("2�� ��");
		for(int i = 5; i > 0; i--) {
			for(int j = i; j > 0; j--) {
				System.out.print('*');
			}
			System.out.println("");
		}
		
		System.out.println("3�� ��");
		for(int i = 5; i > 0; i--) {
			for(int j = 5 - i; j > 0; j--) {
				System.out.print(' ');
			}
			for(int j = i; j > 0; j--) {
				System.out.print('*');
			}
			System.out.println("");
		}
		
		System.out.println("4�� ��");
		for(int i = 1; i < 5; i++) {
			for(int j = 4 - i; j > 0; j--) {
				System.out.print(' ');
			}
			for(int j = 0; j < i * 2 - 1; j++) {
				System.out.print('*');
			}
			System.out.println("");
		}
	}

}
