package algorithm;

import java.util.Comparator;

public class MComparator<T> implements Comparator<T> {
	public int compare(T t1, T t2) {
		if(t1 instanceof String) {
            int sign = 1;
			String s1 = (String)t1;
			String s2 = (String)t2;
			if(s1.length() == s2.length())
				return s1.compareTo(s2);
			else if(s1.length() > s2.length()) {
				String s3 = null;
				s3 = s1;
				s1 = s2;
				s2 = s3;
                sign = -1;
			}
		} else if(t1 instanceof Integer) {
			Integer i1 = (Integer)t1;
			Integer i2 = (Integer)t2;
			if(i1 > i2)	return -1;
			else if(i1 < i2)	return 1;
		}
		return 0;
	}
}

