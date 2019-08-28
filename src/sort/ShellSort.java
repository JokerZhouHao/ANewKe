package sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class  ShellSort{
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

public static <T extends Comparable<? super T>>void sort(List<T> li, boolean isAsc) {
	for(int d = li.size() / 2; d > 0; d /= 2) {
		for(int i = d; i < li.size(); i++) {
			T cur = li.get(i);
			int pre = i - d;
			while(pre >= 0 && compare(li.get(pre), cur, isAsc) > 0) {
				li.set(pre + d, li.get(pre));
				pre -= d;
			}
			li.set(pre + d, cur);
		}
	}
}

	public static void main(String[] args) {
		List<Integer> li = ArrayUtility.getTestList();
		sort(li, false);
		System.out.println(li);
	}
}
