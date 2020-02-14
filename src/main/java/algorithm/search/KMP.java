package algorithm.search;

public class KMP {
	private static int[] next(String str) {
		int next[] = new int[str.length()];
		next[0] = -1;
		int i = 0, j = -1;
		while(i < str.length() - 1) {
			if(j==-1 || str.charAt(i) == str.charAt(j)) {
				i++;
				j++;
				next[i] = j;
			} else j = next[j];
		}
		return next;
	}
	
	private static int find(String str, String pattern) {
		int next[] = next(pattern);
		int i = 0, j = 0;
		while(i < str.length() && j < pattern.length()) {
			if(j == -1 || str.charAt(i) == pattern.charAt(j)) {
				i++;
				j++;
			} else j = next[j];
		}
		if(j == pattern.length()) return i - pattern.length();
		return -1;
	}
	
	public static void main(String[] args) {
		System.out.println(find("abcddber", "bcd"));
	}
}
