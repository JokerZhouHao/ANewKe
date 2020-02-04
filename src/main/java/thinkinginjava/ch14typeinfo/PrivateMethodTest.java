package thinkinginjava.ch14typeinfo;

import java.lang.reflect.Method;

class Dog {
	private void wangwang() {
		System.out.println("wang wang . . . ");
	}
}

public class PrivateMethodTest {
	public static void main(String[] args) throws Exception{
		Dog dog = Dog.class.newInstance();
		Method method = Dog.class.getDeclaredMethod("wangwang");
		method.setAccessible(true);
		method.invoke(dog);
	}
}
