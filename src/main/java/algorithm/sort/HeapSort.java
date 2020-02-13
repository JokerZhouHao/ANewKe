package algorithm.sort;

public class HeapSort extends SortInf {
	private int leftChild(int i) {
		return i * 2 + 1;
	}
	
	private void adjustHeap(int[] arr, int len, int i) {
		int father = arr[i], childI = -1;
		while((childI = leftChild(i)) < len) {
			if(leftChild(i) + 1 < len && arr[leftChild(i)] < arr[leftChild(i) + 1]) {
				childI++;
			}
			
			if(father < arr[childI]) {
				arr[i] = arr[childI];
				i = childI;
			} else break;
		}
		arr[i] = father;
	}
	
	@Override
	public void sort(int[] arr) {
		int i = 0;
		for(i = arr.length/2; i>=0; i--) {
			adjustHeap(arr, arr.length, i);
		}
		
		for(i = arr.length - 1; i > 0; i--) {
			swap(arr, 0, i);
			adjustHeap(arr, i, 0);
		}
	}
	
	public static void main(String[] args) {
		new HeapSort().test();
	}
}
