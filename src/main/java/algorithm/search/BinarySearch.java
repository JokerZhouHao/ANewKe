package algorithm.search;

public class BinarySearch {
	
	public static int binarySearch(int[] arr, int x) {
		int left = 0, right = arr.length - 1, mid = (left + right) / 2;
		while(left <= right) {
			mid = (left + right) / 2;
			if(x == arr[mid])	return mid;
			else if(x < arr[mid]) right = mid;
			else left = mid + 1;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		System.out.println(binarySearch(new int[]{1, 3, 4, 5, 8, 9}, 9));
	}

}
