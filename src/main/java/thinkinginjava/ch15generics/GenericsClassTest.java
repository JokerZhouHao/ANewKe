package thinkinginjava.ch15generics;

import java.util.ArrayList;
import java.util.List;

class One<T> {
	List<T> list = new ArrayList<>();
	
	public void add(T t) {
		list.add(t);
	}
	
	public void instance() {
		System.out.println(list.get(0).getClass());
		System.out.println(Object.class.isInstance(list.get(0).getClass()));
		System.out.println(list.get(0).getClass().isInstance(Object.class));
		System.out.println(list.get(0).getClass().isInstance(int.class));
	}
	
	public void display() {
		System.out.println(list);
	}
	
	public <B> B genericsFunc(B b) {
		return b;
	}
}

class Two extends One {
}

public class GenericsClassTest {
	public static void main(String[] args) {
//		Two two = new Two();
//		two.add(12);
//		two.instance();
//		two.display();
	}
}
