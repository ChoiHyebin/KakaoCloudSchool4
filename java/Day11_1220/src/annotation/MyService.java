package annotation;

public class MyService {

	@PrintAnnotation
	public void printTest() {
		// 실행 코드
		System.out.println("인쇄 실행");
	}
	
	@PrintAnnotation(value = "*", number = 2)
	public void printTest2() {
		System.out.println("인쇄 실행2");
	}
	
	@PrintAnnotation(value = "-", number = 2)
	public void printTest3() {
		System.out.println("인쇄 실행3");
	}
}
