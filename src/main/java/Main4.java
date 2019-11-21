import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception{
    	Scanner scan = new Scanner(System.in);
    	
    	int n = scan.nextInt();
    	int q = scan.nextInt();
    	int[] counts = new int[n + 1];
    	for(int i=1; i<=n; i++) {
    		counts[scan.nextInt()]++;
    	}
    	
    	List<Integer> numOpt = new ArrayList<>();
    	for(int i=0; i<q; i++) {
    		int num = 0;
    		for(int x = scan.nextInt(); x <= n; x++) {
    			num += counts[x];
    			counts[x-1] += counts[x];
    			counts[x] = 0;
    		}
    		numOpt.add(num);
    	}
    	
    	for(int num : numOpt) {
    		System.out.println(num);
    	}
    	
    	
    }
}
