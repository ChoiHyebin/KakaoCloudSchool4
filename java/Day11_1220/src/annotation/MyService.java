package annotation;

public class MyService {

	@PrintAnnotation
	public void printTest() {
		// ���� �ڵ�
		System.out.println("�μ� ����");
	}
	
	@PrintAnnotation(value = "*", number = 2)
	public void printTest2() {
		System.out.println("�μ� ����2");
	}
	
	@PrintAnnotation(value = "-", number = 2)
	public void printTest3() {
		System.out.println("�μ� ����3");
	}
}
