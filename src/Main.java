import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static Boolean isYes(boolean signs[][], int c, int d, int x, int y) {
		int sx = x;
		int sy = y;
		
		if(sx + c > signs.length || 
		   sy + d > signs[0].length)	return Boolean.FALSE;
		
		int n = sx + c -1;
		int m = sy + d - 1;
		
		int mx = -1;
		int my = -1;
		for(; sx <= n; sx++) {
			for(sy = y; sy <= m; sy++) {
				if(signs[sx][sy]) {
					mx = mx >= sx ? mx : sx;
					my = my >= sy ? my : sy;
				}
			}
		}
		if(mx == -1 && my == -1) {
			return Boolean.TRUE;
		}
		
		return isYes(signs, c, d, mx+1, y) || isYes(signs, c, d, x, my+1); 
	}
	
	public static void main(String[] args) throws Exception{
    	Scanner scan = new Scanner(System.in);
    	
    	int t = scan.nextInt();
    	
    	List<String> res = new ArrayList<>();
    	
    	for(int i=0; i<t; i++) {
    		int n = scan.nextInt();
    		int m = scan.nextInt();
    		boolean signs[][] = new boolean[n+1][m+1];
    		int k = scan.nextInt();
    		for(int j=0; j<k; j++) {
    			signs[scan.nextInt()][scan.nextInt()] = true;
    		}
    		int c = scan.nextInt();
    		int d = scan.nextInt();
    		if(isYes(signs, c, d, 1, 1))	res.add("Yes");
    		else res.add("No");
    	}
    	
    	for(String st : res)
    		System.out.println(st);
    }
}
