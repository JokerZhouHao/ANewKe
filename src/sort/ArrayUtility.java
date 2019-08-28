package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayUtility {
	public static void display(int[] objs) {
		for(int i=0; i<objs.length; i++) {
			System.out.print(objs[i] + " ");
		}
		System.out.println();
	}
	
	public static int[] getTestArray() {
		return new int[]{4, 5, 3, 1, -2, -3, 4, 4, 4, 7, 9};
	}
	
	public static List<Integer> getTestList() {
		List<Integer> li = new ArrayList<Integer>();
		for(int i : getTestArray()) {
			li.add(i);
		}
		return li;
	}
}
