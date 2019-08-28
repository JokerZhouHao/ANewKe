package multhread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
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
import java.util.stream.LongStream;

public class Test {

	public static void main(String[] args) throws Exception{
		
		// ReentrantLockʹ��
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
		
		// ���������ǻ���states������ڻ����������˴���
		// 1����doReleaseShared()ִ��ʱ���ͷ���
		// 2��������doAcquireShared(int)���߳�ִ��
		// 3������setHeadAndPropagate()��ִ��1
		
		
		// Semaphoreʹ�ã��ж��permit�����У�����͵ȴ�; �̳�AbstractQueuedSynchronizerʵ�֣�ʹ�ù�����
		Semaphore sema = new Semaphore(10);
		sema.acquire();
		sema.acquire(2);
		sema.drainPermits();
		
		sema.release();
		sema.release(3);
		
		
		// CountDownLatchʹ�ã���latchΪ0�ǣ�֮ǰawait���߳�ȫ�����ѣ����У��̳�AbstractQueuedSynchronizer��ʹ�ù�����
		CountDownLatch latch = new CountDownLatch(10);
		latch.countDown();
		latch.countDown();
		latch.await();
		latch.await();
		
		// CyclicBarrierʹ�ã�ʹ��ReentrantLock����������ʵ��
		// 1����await��0ʱ�������������е������̷߳ŵ��ȴ������У�
		// 2�����ѵȴ������еĵ�һ���߳�
		// 3���̻߳��Ѻ����finally����ִ��unlock������ִ��2
		CyclicBarrier barrier = new CyclicBarrier(10);
		barrier.await();
		barrier.await();
		
		// ArrayBlockingQueueʹ�ã�ʹ��ReentrantLock���������������б���NotFull��NotEmpty
		ArrayBlockingQueue<Integer> abq = new ArrayBlockingQueue<>(10);
		abq.take();
		abq.put(23);
		
		// ConcurrentLinkedQueue����ƽt != (t = tail)
		ConcurrentLinkedQueue<Integer> clq = new ConcurrentLinkedQueue<>();
		clq.add(12);
		clq.remove();
		
		// PriorityBlockingQueueʹ�ã�ʹ��ReentrantLock���������������б���NotFull��NotEmpty
		PriorityBlockingQueue<Integer> pbq = new PriorityBlockingQueue<>();
		
		// CopyOnWriteArrayListʹ��
		CopyOnWriteArrayList<Integer> cowal = new CopyOnWriteArrayList<>();
		cowal.add(12);
		
		// ConcurrentHashMapʹ��
		ConcurrentHashMap<Integer, Integer> chm = new ConcurrentHashMap<Integer, Integer>();
		
		// SynchronousQueue
		SynchronousQueue<Integer> 
		
		
	}

}
