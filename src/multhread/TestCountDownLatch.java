package multhread;

import java.util.concurrent.CountDownLatch;

public class TestCountDownLatch {
	private static CountDownLatch latch = new CountDownLatch(2);
	
	public static class CountDownRun implements Runnable {
		private boolean isDown = false;
		
		public CountDownRun(boolean isDown) {
			this.isDown = isDown;
		}
		
		
		@Override
		public void run() {
			try {
				if(isDown) {
					latch.countDown();
					System.out.println("count down");
				}
				else {
					latch.await();
					System.out.println("await");
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		
	}
	
	
	public static void main(String[] args) throws Exception {
		new Thread(new CountDownRun(false)).start();
		new Thread(new CountDownRun(false)).start();
		new Thread(new CountDownRun(true)).start();
//		new Thread(new CountDownRun(true)).start();
		
		Thread.sleep(100000);
	}
	
}
