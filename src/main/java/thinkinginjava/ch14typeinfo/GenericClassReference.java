package thinkinginjava.ch14typeinfo;

public class GenericClassReference {
	public static void main(String[] args) {
		Class intClass = int.class;
		Class<Object> objClass = int.class;
		Class<Integer> genericIntClass = int.class;
		genericIntClass = Integer.class;
		intClass = double.class;
		
	}
}
