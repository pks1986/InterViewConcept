package concurrency.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Worker implements Runnable {

	private CyclicBarrier cb;
	private long delay;

	public Worker(CyclicBarrier cb, long sleepDelay) {
		this.cb = cb;
		this.delay = sleepDelay;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread() + " is going to sleep");
		try {
			Thread.sleep(delay);
			System.out.println(Thread.currentThread() + " wokeup from sleep");
			System.out.println(Thread.currentThread() + " waiting for threads to reach at barrier");
			try {
				// When all parties have invoked await
				cb.await();
				System.out.println(Thread.currentThread() + " barrier wait finished");
			} catch (BrokenBarrierException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
