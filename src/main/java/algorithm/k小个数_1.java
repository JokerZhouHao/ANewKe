package algorithm;

import java.util.*;

public class k小个数_1 {
	
	
	private void swap(int[] input, int i, int j) {
        int t = input[i];
        input[i] = input[j];
        input[j] = t;
    }
    
    private int partition(int[] input, int start, int end){
    	int pivot = input[start];
    	int i = start, j = end;
    	while(i < j) {
    		while(i < j && input[j] > pivot)	j--;
    		if(i < j)	input[i++] = input[j];
    		while(i < j && input[i] <= pivot) i++;
    		if(i < j)	input[j--] = input[i];
    	}
    	input[i] = pivot;
    	return i;
    }
    
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList();
        if(k > input.length || k < 1)    return list;
        int start = 0, end = input.length - 1;
        int pos = partition(input, start, end);
        while(pos != k - 1) {
            if(pos < k - 1)    start = pos + 1;
            else end = pos - 1;
            pos = partition(input, start, end);
        }
        for(int i=0; i<k; i++)    list.add(input[i]);
        return list;
    }
	
	public static void main(String[] args) {
		int[] input = {4,5,1,1,1,1,1,1,1,6,2,7,3,8};
		System.out.println(new k小个数_1().GetLeastNumbers_Solution(input, 8));
	}
}

