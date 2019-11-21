package multhread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;
import java.util.stream.LongStream;

public class Test {

	public static void main(String[] args) throws Exception{
		
		Thread t = new Thread(null);
		
		
		ReentrantReadWriteLock rrwLock = new ReentrantReadWriteLock();
		ReadLock readLock = rrwLock.readLock();
		readLock.lock();
		readLock.unlock();
		WriteLock writeLock = rrwLock.writeLock();
		writeLock.lock();
		writeLock.unlock();
				
		
		
		// ReentrantLock使用
		ReentrantLock rLock = new ReentrantLock();
		
		rLock.lock();
		rLock.lockInterruptibly();
		
		rLock.tryLock();
		rLock.tryLock(1000, TimeUnit.DAYS);
		
		Condition cond = rLock.newCondition();
		cond.await();
		cond.awaitNanos(1000);
		cond.awaitUninterruptibly();
		
		cond.signal();
		
		rLock.unlock();
		
		Thread.sleep(1000);
		
		// 共享锁，是基于states，相对于互斥锁，多了传递
		// 1、当doReleaseShared()执行时，释放锁
		// 2、阻塞在doAcquireShared(int)的线程执行
		// 3、调用setHeadAndPropagate()，执行1
		
		
		// Semaphore使用，有多的permit就运行，否则就等待; 继承AbstractQueuedSynchronizer实现，使用共享锁
		Semaphore sema = new Semaphore(10);
		sema.acquire();
		sema.acquire(2);
		sema.drainPermits();
		
		sema.release();
		sema.release(3);
		
		
		// CountDownLatch使用，当latch为0是，之前await的线程全部唤醒，运行；继承AbstractQueuedSynchronizer，使用共享锁
		CountDownLatch latch = new CountDownLatch(10);
		latch.countDown();
		latch.countDown();
		latch.await();
		latch.await();
		
		// CyclicBarrier使用；使用ReentrantLock的条件队列实现
		// 1、当await数0时，将条件队列中的所有线程放到等待队列中，
		// 2、唤醒等待队列中的第一个线程
		// 3、线程唤醒后会在finally块中执行unlock，程序执行2
		CyclicBarrier barrier = new CyclicBarrier(10);
		barrier.await();
		barrier.await();
		
		// ArrayBlockingQueue使用；使用ReentrantLock和其类中条件队列变量NotFull和NotEmpty
		ArrayBlockingQueue<Integer> abq = new ArrayBlockingQueue<>(10);
		abq.take();
		abq.put(23);
		
		// ConcurrentLinkedQueue，问平t != (t = tail)
		ConcurrentLinkedQueue<Integer> clq = new ConcurrentLinkedQueue<>();
		clq.add(12);
		clq.remove();
		
		// PriorityBlockingQueue使用；使用ReentrantLock和其类中条件队列变量NotFull和NotEmpty
		PriorityBlockingQueue<Integer> pbq = new PriorityBlockingQueue<>();
		
		// CopyOnWriteArrayList使用
		CopyOnWriteArrayList<Integer> cowal = new CopyOnWriteArrayList<>();
		cowal.add(12);
		
		// ConcurrentHashMap使用
		// put：cas和synchronized锁，当没冲突时，直接用cas直接设置头结点；否则对头结点用synchronized加锁，添加put的值
		// 扩容：
		ConcurrentHashMap<Integer, Integer> chm = new ConcurrentHashMap<Integer, Integer>();
		chm.put(1, 1);
		
		
		
	}

}
