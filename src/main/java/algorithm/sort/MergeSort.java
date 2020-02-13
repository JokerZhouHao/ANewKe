package algorithm.sort;

public class MergeSort extends SortInf {
	
	private void merge(int[] arr, int[] copy, int s, int m, int e) {
		int i = s, j = m + 1, k = s;
		while(i <= m && j <= e) {
			if(arr[i] <= arr[j]) copy[k++] = arr[i++];
			else copy[k++] = arr[j++];
		}
		while(i <= m) copy[k++] = arr[i++];
		while(j <= e) copy[k++] = arr[j++];
		k = s;
		while(k <= e) {
			arr[k] = copy[k];
			k++;
		}
	}
	
	private void mergeSort(int[] arr, int[] copy, int s, int e) {
		if(s >= e)	return;
		int mid = (s + e) / 2;
		mergeSort(arr, copy, s, mid);
		mergeSort(arr, copy, mid + 1, e);
		merge(arr, copy, s, mid, e);
	}
	
	@Override
	public void sort(int[] arr) {
		int[] copy = new int[arr.length];
		mergeSort(arr, copy, 0, arr.length - 1);
	}
	
	public static void main(String[] args) {
		new MergeSort().test();
	}
}
