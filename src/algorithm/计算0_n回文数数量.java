import java.io.*;
import java.util.*;

public class 计算0_n回文数数量
{
    public static void main(String args[])
    {
        Scanner sca = new Scanner(System.in);
        Long x = sca.nextLong();
        
        if(x==1) {
        	System.out.println(2);
        	return;
        }
        
        long num = 2;
        String xBin = Long.toBinaryString(x);
        
        for(int i=2; i < xBin.length(); i++) {
        	if(i % 2 == 1) num += (long)Math.pow(2, i/2);
        	else num += (long)Math.pow(2, i / 2 - 1);
        }
        
        if(xBin.length() % 2 == 1) {
        	x = (long)Long.parseLong(xBin.substring(0, xBin.length() / 2 + 1) + xBin.substring(xBin.length() / 2), 2);
        	xBin = Long.toBinaryString(x);
        }
        
        String tStr = "1";
        for(int i=2; i<=xBin.length() / 2; i++)	tStr += "0";
        
        long start = Long.parseLong(tStr, 2);
        long end = Long.parseLong(xBin.substring(0, xBin.length() / 2), 2);
        
        num = num + end - start;
        if(getReverse(end) <= x)	num += 1;
        System.out.println(num);
    }
    
    public static long getReverse(long x) {
    	String xStr = Long.toBinaryString(x);
    	StringBuffer sb = new StringBuffer();
    	sb.append(xStr);
    	for(int i=xStr.length()-1; i>=0; i--)	sb.append(xStr.charAt(i));
    	return Long.parseLong(sb.toString(), 2);
    }
    
}
