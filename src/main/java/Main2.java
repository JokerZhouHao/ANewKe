import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Pkg implements Comparable{
	private int d = 0;
	private int speed = 0;
	
	public Pkg(int d, int speed) {
		super();
		this.d = d;
		this.speed = speed;
	}

	@Override
	public int compareTo(Object o) {
		Pkg pkg1 = (Pkg)o;
		if(d > pkg1.d)	return -1;
		else if(d == pkg1.d) {
			if(speed > pkg1.speed)	return -1;
			else if(speed == pkg1.speed)	return 0;
			return 1;
		} 
		return 1;
	}
	
	public void refresh() {
		if(d > 0) {
			d -= speed;
			if(d <= 0)	d = 0;
		}
	}

	public int getD() {
		return d;
	}
	
	public void setD(int d) {
		this.d = d;
	}
	
	public boolean available() {
		return d > 0;
	}
	
	@Override
	public String toString() {
		return "Pkg [d=" + d + ", speed=" + speed + "]";
	}

}


public class Main2 {


    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	
    	String arr[] = scan.nextLine().split(" ");
    	int n = Integer.parseInt(arr[0]);
    	int m = Integer.parseInt(arr[1]);
    	Pkg pkgs[] = new Pkg[n];
    	PriorityQueue<Pkg> queue = new PriorityQueue<>();
    	
    	int i = 0;
    	for(i=0; i<n; i++) {
    		arr = scan.nextLine().split(" ");
    		pkgs[i] = new Pkg(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]));
    		queue.add(pkgs[i]);
    	}
    	
    	Pkg pkg = null;
    	while(n >= m) {
    		while(!queue.isEmpty() && !(pkg = queue.poll()).available());
    		if(pkg.available()) {
    			pkg.setD(-1);
    			if(--n < m)	break;
    		}
    		if(queue.isEmpty())	break;
    		
    		while(!queue.isEmpty() && !(pkg = queue.poll()).available());
    		if(pkg.available()) {
    			pkg.setD(-1);
    			--n;
    		}
    		if(queue.isEmpty())	break;
    		
    		for(i=0; i<pkgs.length; i++) {
    			if(pkgs[i].available()) {
    				pkgs[i].refresh();
    				if(!pkgs[i].available()) n--;
    			}
    		}
    	}
    	
    	for(i=0; i<pkgs.length; i++)
    		System.out.println(pkgs[i].getD());
    }
}






