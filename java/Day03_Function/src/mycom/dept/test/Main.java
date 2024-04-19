package mycom.dept.test;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10, b = 20;
		int max = a;
		
		if(max < b) {
			max = b;
		}
		System.out.println(max);
		
		a = 30;
		b = 40;
		
		if(max < b) {
			max = b;
		}
		System.out.println(max);

		int mmax = 0;
		
		a = 30; b = 40;
		mmax = getMax(a, b);
		
		a = -100; b = -200;
		mmax = getMax(a, b);
		
	}
	
	private static int getMax(int a, int b) { // 원형부
		// 구현부
		int max = a;
		
		if(max < b) {
			max = b;
		}
		
		System.out.println("getMax: " + max);
		
		return max;
	}

}
