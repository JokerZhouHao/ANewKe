package algorithm.sort;

public class QuickSort extends SortInf {
	
	private void qSort(int[] arr, int left, int right) {
		if(left >= right) return;
		int pivot = arr[left];
		int i = left, j = right;
		while(i != j) {
			while(i < j && pivot < arr[j])	j--;
			if(i < j) swap(arr, i++, j);
			while(i < j && arr[i] < pivot) i++;
			if(i < j) swap(arr, i, j--);
		}
		arr[i] = pivot;
		qSort(arr, left, i - 1);
		qSort(arr, i+1, right);
	}
	
	@Override
	public void sort(int[] arr) {
		qSort(arr, 0, arr.length - 1);
	}
	
	
	public static void main(String[] args) {
		new QuickSort().test();
	}
}
