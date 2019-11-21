package sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class  BubbleSort{
private static <T extends Comparable<? super T>> void swap(List<T> li, int i1, int i2) {
	T t = li.get(i1);
	li.set(i1, li.get(i2));
	li.set(i2, t);
}

private static <T extends Comparable<? super T>> int compare(T t1, T t2, boolean isAsc) {
	int i = ((Comparable)t1).compareTo(t2);
	if(isAsc)	return i;
	else	return -i;
}

public static <T extends Comparable<? super T>>void sort(List<T> li) {
	sort(li, true);
}

public static <T extends Comparable<? super T>> void sort(List<T> li, boolean isAsc) {
	for(int i=0; i<li.size() - 1; i++) {
		boolean hasSwap = false;
		for(int j=0; j<li.size() - 1 - i; j++) {
			if(compare(li.get(j), li.get(j+1), isAsc) > 0) {
				swap(li, j, j + 1);
				hasSwap = true;
			}
		}
		if(!hasSwap)	return;
	}
}

	public static void main(String[] args) {
		List<Integer> li = ArrayUtility.getTestList();
		System.out.println(li);
		sort(li, Boolean.TRUE);
		System.out.println(li);
	}
}
