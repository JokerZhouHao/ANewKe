package thinkinginjava.ch15generics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayMaker<T> {
	private Class<T> kind;
	public ArrayMaker(Class<T> kind) { this.kind = kind; }
	
	@SuppressWarnings("unchecked")
	T[] create(int size) {
		return (T[])Array.newInstance(this.kind, 10);
	}
	
	public static void main(String[] args) {
		ArrayMaker<String> StringMaker = new ArrayMaker<>(String.class);
		String[] stringArray = StringMaker.create(9);
		System.out.println(Arrays.toString(stringArray));
	}
}
