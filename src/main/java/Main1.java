import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main1 {
	
	
	public static void main(String[] args) throws Exception{
    	Scanner scan = new Scanner(System.in);
    	
    	String arr[] = scan.nextLine().split(" ");
    	
    	int n = Integer.parseInt(arr[0]);
    	int k = Integer.parseInt(arr[1]);
    	
    	int counts[] = new int[101];
    	int i = 0;
    	for(i=0; i<counts.length; i++)	counts[i] = -1;
    	
    	int min =0, max = 0;
    	
    	for(i=0; i<n; i++) {
    		arr = scan.nextLine().split(" ");
    		min = Integer.parseInt(arr[0]);
    		max = Integer.parseInt(arr[1]);
    		for(int j=min; j<=max; j++) {
    			if(counts[j+50]==-1)	counts[j+50] += 2;
    			else counts[j+50]++;
    		}
    	}
    	
    	min = max = Integer.MIN_VALUE;
    	for(i=0; i<counts.length; i++) {
    		if(counts[i] >= k)	{
    			min = max = i - 50;
    			break;
    		}
    	}
    	for(; i<counts.length; i++) {
    		if(counts[i] < k)	break;
    	}
    	max = i-51;;
    	
    	if(min != Integer.MIN_VALUE)	System.out.println(min + " " + max);
    	else System.out.println("error");
    }
}













