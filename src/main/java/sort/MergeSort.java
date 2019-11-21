package sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class  MergeSort {
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


private static <T extends Comparable<? super T>> void merge(List<T> li, T[] sortArr, int s, int m, int e, boolean isAsc) {
	int i = s;
	int j1 = s, j2 = m + 1;
	while(j1 <= m && j2 <= e) {
		if(compare(li.get(j1), li.get(j2), isAsc) <= 0) sortArr[i++] = li.get(j1++);
		else sortArr[i++] = li.get(j2++);
	}
	while(j1 <= m)	sortArr[i++] = li.get(j1++);
	while(j2 <= e)	sortArr[i++] = li.get(j2++);
	for(i = s; i <= e; i++)	li.set(i, sortArr[i]);
}

private static <T extends Comparable<? super T>> void mergeSort(List<T> li, T[] sortArr, int s, int e, boolean isAsc) {
	if(s == e)	return;
	int mid = (s + e) / 2;
	mergeSort(li, sortArr, s, mid, isAsc);
	mergeSort(li, sortArr, mid + 1, e, isAsc);
	merge(li, sortArr, s, mid, e, isAsc);
}


public static <T extends Comparable<? super T>>void sort(List<T> li) {
	sort(li, true);
}

public static <T extends Comparable<? super T>>void sort(List<T> li, boolean isAsc) {
	T[] sortArr = (T[])new Comparable[li.size()];
	mergeSort(li, sortArr, 0, li.size() - 1, isAsc);
}

public static void main(String[] args) {
	List<Integer> li = ArrayUtility.getTestList();
	sort(li, false);
	System.out.println(li);
}
}
