package sort;

public class  SelectSort {
	public static void sort(int[] array) {
		int minIndex = -1;
		for(int i=0; i<array.length - 1; i++) {
			minIndex = i;
			for(int j=i+1; j<array.length; j++) {
				if(array[minIndex] > array[j])	minIndex = j;
			}
			if(minIndex != i) {
				int t = array[i];
				array[i] = array[minIndex];
				array[minIndex] = t;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = ArrayUtility.getTestArray();
		sort(arr);
		ArrayUtility.display(arr);

	}
}
