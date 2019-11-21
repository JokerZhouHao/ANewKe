package algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;

public class k小个数_3 {
	static class Solutation {
		TreeMap<Integer, ArrayList<Integer>> v2poses = null;
		int counter = 0;
		int k = 0;
		
		public Solutation(int k) {
			v2poses = new TreeMap<>(DescIntComparator());
			this.k = k;
		}
		
		private void add(int x, int pos) {
			ArrayList<Integer> poses = null;
			if((poses = v2poses.get(x)) == null) {
				poses = new ArrayList<>();
				v2poses.put(x, poses);
			}
			poses.add(pos);
			counter++;
		}
		
		private void adjust() {
			if(counter - v2poses.lastEntry().getValue().size() >= k) {
				counter -= v2poses.lastEntry().getValue().size();
				v2poses.pollLastEntry();
			}
		}
		
		public void insert(int x, int pos) {
			if(counter < k)	add(x, pos);
			else if(x <= v2poses.lastKey()) {
				add(x, pos);
				adjust();
			}
		}
		
		public void insertAll(int[] arr) {
			for(int i=0; i<arr.length; i++) insert(arr[i], i);
		}
		
		public List<Integer> getKLessest() {
			if(counter < k)		return null;
			List<Integer> res = new ArrayList<>();
			Entry<Integer, ArrayList<Integer>> en = v2poses.lastEntry();
			res.add(en.getKey());
			for(Integer pos : en.getValue())	res.add(pos);
			return res;
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 99, 1, 3, 2, 6, 8, 19};
		Solutation sol = new Solutation(19);
		sol.insertAll(arr);
		System.out.println(sol.getKLessest());
	}
}
