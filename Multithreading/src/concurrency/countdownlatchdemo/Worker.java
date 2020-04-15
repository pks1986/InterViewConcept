package concurrency.countdownlatchdemo;

import java.util.concurrent.CountDownLatch;

public class Worker implements Runnable {

	private CountDownLatch ccl;
	private long delay;

	public Worker(CountDownLatch ccl, long sleepDelay) {
		this.ccl = ccl;
		this.delay = sleepDelay;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread() + " is going to sleep");
		try {
			Thread.sleep(delay);
			System.out.println(Thread.currentThread() + " wokeup from sleep");
			ccl.countDown();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
