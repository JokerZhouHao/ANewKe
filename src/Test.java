import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

interface Iface {}

class Dog implements Iface{}

class Dog1 extends Dog{}

public class Test {
	
	public static  int a = 0;
	
	public static void div() throws Exception {
		int j = 1 / 0;
	}
	
	public static int testTryCatch() {
		int i = 1, b = 3;
		try {
			div();
		} catch (Exception e) {
			i++;
			return i * b;
		} finally {
			i++;
			b++;
			System.out.println("finally");
		}
		return 1;
	}
	
	public static void main(String[] args) {
//		ConcurrentHashMap<Integer, Integer> map = new ConcurrentHashMap<>();
//		map.clear();
		
//		try {
//			div();
//		} catch (Exception e) {
////			e.printStackTrace();
//		}
		
//		System.out.println(testTryCatch());
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(12);
		
		LinkedList<Integer> llist = new LinkedList<>();
		llist.add(12);
		
		
		Semaphore sema = new Semaphore(12);
		
		ReentrantLock lock = new ReentrantLock();
		lock.lock();
		lock.unlock();
		Condition cond = lock.newCondition();
		cond.await();
		cond.signal();
		
		ConcurrentHashMap<Integer, Integer> map = new ConcurrentHashMap<>();
		map.put(1, 2);
		
		ReentrantReadWriteLock l = new ReentrantReadWriteLock();
	}
}	
