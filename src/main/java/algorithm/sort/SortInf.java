package algorithm.sort;

import java.util.Arrays;

public abstract class SortInf {
	public abstract void sort(int[] arr);
	
	public void swap(int[] arr, int i, int j) {
		int x = arr[i];
		arr[i] = arr[j];
		arr[j] = x;
	}
	
	public void test() {
		int arr[] = {1, 89, 33, 23, 90, 33, 100, 20};
		System.out.println(Arrays.toString(arr));
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
