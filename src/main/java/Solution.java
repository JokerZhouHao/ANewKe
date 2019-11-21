import java.util.*;

public class Solution {
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        // 用双端队列实现
        ArrayList<Integer> res = new ArrayList();
        ArrayDeque<Integer> deque = new ArrayDeque();
        if(num == null)    return res;
        for(int i=0; i<num.length; i++){
            if(deque.isEmpty()){    deque.add(num[i]);    continue;}
            if(num[deque.getLast()] <= num[i]){
                while(num[deque.getLast()] <= num[i])    deque.pollLast();
                deque.add(i);
            }
            if(i >= size - 1) {
                if(i > deque.getFirst())    deque.pollFirst();
                res.add(num[deque.getFirst()]);
            }
        }
        if(num.length < size)    res.add(num[deque.pollFirst()]);
        return res;
    }
    
    public static void main(String[] args) {
    	int[] arr = {1,  2, 2, 3};
    	System.out.println(new Solution().maxInWindows(arr, 2));
    }
}