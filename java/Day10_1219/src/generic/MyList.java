package generic;

import java.util.ArrayList;

public class MyList<T> {

	ArrayList<T> arr = new ArrayList<T>();

	public void add(T obj) {
		arr.add(obj);
	}
	
	public T get(int index) {
		return arr.get(index);
	}
	
}
