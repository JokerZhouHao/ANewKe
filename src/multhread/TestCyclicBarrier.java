package multhread;

import java.util.concurrent.CyclicBarrier;

public class TestCyclicBarrier {
	static class TestCB implements Runnable {
		private CyclicBarrier cb = null;
		private static int count = 1;
		
		public TestCB(CyclicBarrier cb) {
			this.cb = cb;
		}
		
		public void run() {
			try {
				int c = count;
				count++;
				System.out.println("into " + c);
				cb.await();
				System.out.println("out " + c);
				Thread.sleep(100000);
				count++;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		CyclicBarrier cb = new CyclicBarrier(3);
		new Thread(new TestCB(cb)).start();
		Thread.sleep(1000);
		new Thread(new TestCB(cb)).start();
		Thread.sleep(1000);
		new Thread(new TestCB(cb)).start();
	}
}
