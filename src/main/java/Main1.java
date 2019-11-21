import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

class IntPointer{
	public int v = 0;
	public IntPointer(int x) {
		this.v = x;
	}
}

public class Main1 {
	
	public static String isAvailable(String st) {
		if(st.length() < 11)	return "NO";
		int i = st.indexOf('8');
		if(i == -1)	return "NO";
		else if(st.length() - i>= 11)	return "YES";
		return "NO";
	}
	
	public static void main(String[] args) throws Exception{
    	Scanner scan = new Scanner(System.in);
    	
    	int t = Integer.parseInt(scan.nextLine());
    	List<String> res = new ArrayList<>();
    	for(int i=0; i<t; i++) {
    		scan.nextLine();
    		res.add(isAvailable(scan.nextLine()));
    	}
    	
    	for(String st : res) System.out.println(st);
    }
}
