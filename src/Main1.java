import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static final int NUM_SCORE = 150;
	
	
	public static void main(String[] args) throws Exception{
    	Scanner scan = new Scanner(System.in);
    	
    	int n = scan.nextInt();
    	int[] scores = new int[n+1];
    	int[] counts = new int[NUM_SCORE + 1];
    	for(int i=1; i<=n; i++) {
    		scores[i] = scan.nextInt();
    		counts[scores[i]]++;
    	}
    	
    	int q = scan.nextInt();
    	List<Double> ranks = new ArrayList<>();
    	for(int i=0; i<q; i++) {
    		double cou = 0;
    		for(int sco = scores[scan.nextInt()]; sco >= 0; sco--) {
    			cou += counts[sco];
    		}
    		ranks.add((cou - 1) / n * 100);
    	}
    	
    	for(Double rank : ranks) {
    		System.out.printf("%.6f\n", rank);
    	}
    	
    	
    }
}
