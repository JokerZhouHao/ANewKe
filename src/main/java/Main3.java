import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class Main3 {
	
	private int sum = 0;
	private int minSpan = Integer.MAX_VALUE;
	private int[] res = null;
	private boolean sign[] = null;
	private List<Integer> scores = null;
	
	public Main3(List<Integer> scores) {
		this.scores = scores;
		sum = sum(scores);
		minSpan = Integer.MAX_VALUE;
		res = new int[2];
		sign = new boolean[scores.size()];
	}
	
	private int sum(List<Integer> scores) {
		int i = 0;
		for(int s : scores)	i += s;
		return i;
	}
	
	private int abs(int a, int b) {
		if(a >= b)	return a - b;
		return b - a;
	}
	
	public static int[] minGroup(List<Integer> scores) {
		Collections.sort(scores);
		int res[] = new int[2];
		for(int i=scores.size() - 1; i>=0; i--) {
			if(res[0] <= res[1]) res[0] += scores.get(i);
			else res[1] += scores.get(i);
		}
		Arrays.sort(res);
		return res;
	}
	
	private void mG1(int curSum, int i, int n) {
		if(n==0) {
			if(abs(curSum, sum - curSum) < minSpan) {
				minSpan = abs(curSum, sum - curSum);
				res[0] = curSum;
				res[1] = sum - curSum;
			}
			return;
		}
		
		if(i >= scores.size())	return;
		
		for(int t = i; t <= scores.size() - n; t++) {
			sign[t] = true;
			curSum += scores.get(t);
			mG1(curSum, t + 1, n - 1);
			sign[t] = false;
			curSum -= scores.get(t);
		}
	}
	
	public int[] minGroup1() {
		mG1(0, 0, scores.size() / 2);
		Arrays.sort(res);
		return res;
	}
	
	public static void main(String[] args) throws Exception{
    	Scanner scan = new Scanner(System.in);
    	
    	int T = Integer.parseInt(scan.nextLine());
    	
    	List<Integer> scores = new ArrayList<>();
    	List<int[]> res = new ArrayList<>();
    	for(int i=0; i<T; i++) {
    		int n = scan.nextInt();
    		scores.clear();
    		for(int j = 0; j<n; j++) {
    			scores.add(scan.nextInt());
    		}
    		
    		res.add(new Main3(scores).minGroup1());
    	}
    	
    	for(int[] re : res) {
    		System.out.println(re[0] + " " + re[1]);
    	}
    }
}
