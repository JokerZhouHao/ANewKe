package algorithm;

public class PriorityDeque<T extends Comparable<? super T>> {
	private T[] arr = null;
	private int size = 0;
	
	public PriorityDeque(int cap) {
		arr = (T[])new Comparable[cap];
	}
	
	private void adjust(int i, int len) {
		T vFather = arr[i];
		int left = 0;
		while((left = (i * 2 + 1)) < len) {
			if((left + 1) < arr.length && arr[left].compareTo(arr[left+1]) > 0) {
				left++;
			}
			if(vFather.compareTo(arr[left]) > 0) {
				arr[i] = arr[left];
				i = left;
			} else break;
		}
		arr[i] = vFather;
	}
	
	public void add(T t) {
		
	}
}
