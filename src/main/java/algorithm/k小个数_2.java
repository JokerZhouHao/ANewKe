package algorithm;

class MComparator<T> implements Comparator<T> {
	public int compare(T t1, T t2) {
		if(t1 instanceof Integer) {
			Integer i1 = (Integer)t1;
			Integer i2 = (Integer)t2;
			if(i1 > i2)	return -1;
			else if(i1 < i2)	return 1;
		}
		return 0;
	}
}

public class k小个数_2 {
	public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList();
        if(k > input.length || k < 1)    return list;
        PriorityQueue<Integer> pq = new PriorityQueue(new MComparator<Integer>());
        for(int i=0; i<k; i++)    pq.add(input[i]);
        for(int i=k; i<input.length; i++){
            if(pq.peek() > input[i]){
                pq.poll();
                pq.add(input[i]);
            }
        }
        list.addAll(pq);
        //Collections.reverse(list);
        return list;
    }
}
