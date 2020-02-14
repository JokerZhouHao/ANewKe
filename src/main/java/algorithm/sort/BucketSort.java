package algorithm.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSort extends SortInf {
	
	private void bucketSort(int[] arr, int bucketSize) {
		int min = arr[0], max = min;
		for(int x : arr) {
			if(min > x)	min = x;
			else if(max < x)	max = x;
		}
		
		List<Integer>[] buckets = new ArrayList[(max - min) / bucketSize + 1];
		
		int index = 0;
		for(int x : arr) {
			index = (x - min) / bucketSize;
			if(buckets[index] == null)	buckets[index] = new ArrayList<>();
			buckets[index].add(x);
		}
		
		index = 0;
		for(List<Integer> list : buckets) {
			if(list != null) {
				Collections.sort(list);
				for(int x : list) {
					arr[index++] = x;
				}
			}
		}
	}
	
	@Override
	public void sort(int[] arr) {
		bucketSort(arr, 3);
	}
	
	public static void main(String[] args) {
		new BucketSort().test();
	}
}
