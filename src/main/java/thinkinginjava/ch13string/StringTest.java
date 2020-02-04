package thinkinginjava.ch13string;

public class StringTest {
	public static void main(String[] args) {
		String s1 = "111";
		String s2 = new String("111");
		String s3 = "111";
		System.out.println("s1 == s2 > " + (s1 == s2));
		System.out.println("s1 == s3 > " + (s1 == s3));
		System.out.println("s2 == s3 > " + (s2 == s3));
		
		// 线程不安全
		StringBuilder sb = new StringBuilder();
		
		// 线程安全
		StringBuffer sbuf = new StringBuffer();
	}
}
