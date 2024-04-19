package annotation;

import java.lang.reflect.Method;

// Entry Point Class
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Method[] declaredList = MyService.class.getDeclaredMethods();

		for(Method m:declaredList) {
			PrintAnnotation printAnno = m.getAnnotation(PrintAnnotation.class);
			
			System.out.println(printAnno.value());
			System.out.println(printAnno.number());
		}
	}

}
