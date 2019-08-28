package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Test {
	
	public static int tableSizeFor(int cap) {
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return n + 1;
    }
	
	
	public static void main(String[] args) {
		/*** ArrayList
		扩容策略：如果创建实力时不设置capacity，0 --> 10 --> 每次扩容1.5倍，最大至Integer.MAX_VALUE
		线程不安全
		1、为什么数组使用transient修饰？
			因为数组中存在空闲空间，这部分序列化后会浪费空间，而且ArrayList重写了writeObject和readObject
			用于序列号和反序列化存放的数据。
		2、如何使用线程安全的ArrayList？
		 	使用Collections.synchronizedList()方法
		 	ArrayList是线程不安全的，Vector是线程安全的
			扩容时候ArrayList扩0.5倍，Vector扩1倍
		***/
		ArrayList<Integer> list = new ArrayList<>();
		list.add(12);
		list.remove(0);
		
		
		/*** LinkedList
		双向链表
		线程不安全
		1、如何使用线程安全的LinkedList？
		 	使用Collections.synchronizedList()方法
		***/
		LinkedList<Integer> list1 = new LinkedList<>();
		list1.add(12);
		list1.remove();
		
		
		/*** hashMap
		 *	哈希值：obj.hashcode & (obj.hashcode >>> 16) & (n-1)
		 *	散列方法：拉链法，桶中元素大于8，转为红黑树；等于或小于6时，红黑树转化为链表
		 *	resize：如果只有一个元素，直接放到新位置；红黑树，拆分红黑树后，如果拆分出的红黑树节点数不大于6，则将其转化为链表；
		 *			链表，拆分为两个链表，hash & oldCap == 0放到一个链表，==1的放到另外一个链表，前者还是放在数组中原来的位置，
		 *			后者放在原始位置 + oldCap的位置
		（1）HashMap允许NULL值，NULL键
		（2）不要轻易改变负载因子，负载因子过高会导致链表过长，查找键值对时间复杂度就会增高，负载因子过低会导致hash桶的数量过多，空间复杂度会增高
		（3）Hash表每次会扩容长度为以前的2倍
		（4）HashMap是多线程不安全的，我在JDK 1.7进行多线程put操作，之后遍历，直接死循环，CPU飙到100%，在JDK 1.8中
		进行多线程操作会出现节点和value值丢失，为什么JDK1.7与JDK1.8多线程操作会出现很大不同，是因为JDK 1.8的作者对resize
		方法进行了优化不会产生链表闭环。这也是本章的重点之一，具体的细节大家可以去查阅资料。这里我就不解释太多了
		（5）尽量设置HashMap的初始容量，尤其在数据量大的时候，防止多次resize
		（6）HashMap在JDK 1.8在做了很好性能的提升，我看到过在JDK1.7和JDK1.8get操作性能对比JDK1.8是要优于JDK 1.7的，
		大家感兴趣的可以自己做个测试，所以还没有升级到JDK1.8的小伙伴赶紧的吧。
		*/
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		System.out.println(tableSizeFor(7));
		
		System.out.println((655376666 >>> 16) & (7846) );
	}

}
