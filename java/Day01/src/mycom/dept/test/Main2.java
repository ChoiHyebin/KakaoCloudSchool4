package mycom.dept.test;

public class Main2 {
	public static void main(String[] args) {
		int x = 254;
		float d = 25.2f;
		
		// 형변환 = cast
		float f = (float) 25.2;
		
		double di = 25; // 8byte(4+4) = (4)
		
		int y = (int)25.678989; // 4(정수부) = (정수 + 소수) 8byte
		System.out.println(y);
		
		int ch = 'A';
		System.out.println((char)ch);
	}

}
