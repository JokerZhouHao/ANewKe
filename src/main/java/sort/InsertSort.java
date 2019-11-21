package sort;

public class  InsertSort{
	public static void sort(int[] array) {
		for(int i=1; i<array.length; i++) {
			int cur = array[i];
			int pre = i - 1;
			while(pre >= 0 && array[pre] > cur) {
				array[pre + 1] = array[pre];
				pre--;
			}
			array[pre + 1] = cur;
		}
	}

	public static void main(String[] args) {
		int[] arr = ArrayUtility.getTestArray();
		sort(arr);
		ArrayUtility.display(arr);

	}
}
