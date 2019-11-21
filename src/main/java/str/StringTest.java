package str;

public class StringTest {
	public static void main(String[] args) {
		String st1 = "zhou";
		String st2 = "zhou";
		String st3 = new String("zhou");
		String st4 = new String("zhou");
		String st5 = st3;
		
		System.out.println(st1 == st2);
		System.out.println(st1 == st3);
		System.out.println(st1 == st4);
		System.out.println(st2 == st3);
		System.out.println(st2 == st4);
		System.out.println(st3 == st4);
		
		System.out.println(st3.replace("z", "a"));
		System.out.println(st3);
	}
}
