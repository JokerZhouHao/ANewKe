import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class Main {
	
	public static void main(String[] args) throws Exception{
    	Scanner scan = new Scanner(System.in);
    	
    	long n , k;
    	n = scan.nextLong();
    	k = scan.nextLong();
    	
    	ArrayList<Long> nums = new ArrayList<>();
    	for(int i=0; i<n; i++) {
    		nums.add(scan.nextLong());
    	}
    	
    	Collections.sort(nums);
    	int i = 0;
    	ArrayList<Long> res = new ArrayList<>();
    	while(k > 0 && i < nums.size()) {
    		if(i == 0) {
    			res.add(nums.get(i));
    			i++;
    			k--;
    		} else {
    			if(nums.get(i-1) == nums.get(i)) {
    				i++;
    				continue;
    			}
    			res.add(nums.get(i) - nums.get(i-1));
    			i++;
    			k--;
    		}
    	}
    	
    	for(Long r : res)	System.out.println(r);
    	while(k-->0)	{
    		System.out.println(0);
    	}
    }
}
