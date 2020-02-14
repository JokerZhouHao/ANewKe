package multhread;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class TestThreadPool {
	static class TestTP implements Runnable {
		private static int count = 1;
		
		
		public void run() {
			try {
				int c = count;
				count++;
				System.out.println("into " + c);
				Thread.sleep(1000);
				System.out.println("out " + c);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		ExecutorService exec = Executors.newSingleThreadExecutor();
		exec.execute(new TestTP());
		exec.execute(new TestTP());
		exec.execute(new TestTP());
		System.out.println("main");
	}
}
