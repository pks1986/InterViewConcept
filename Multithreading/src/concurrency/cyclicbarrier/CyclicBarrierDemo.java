package concurrency.cyclicbarrier;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * CyclicBarrier ccl = new CyclicBarrier(3);
		 * 
		 * new Thread(new Worker(ccl, 1000)).start(); new Thread(new Worker(ccl,
		 * 2000)).start(); new Thread(new Worker(ccl, 3000)).start();
		 */

		CyclicBarrier ccl = new CyclicBarrier(3, new Runnable() {

			@Override
			public void run() {
				System.out.println("\n\nRunnable executed after barrier is reached\n\n");
			}
		});

		new Thread(new Worker(ccl, 1000)).start();
		new Thread(new Worker(ccl, 2000)).start();
		new Thread(new Worker(ccl, 3000)).start();

	}

}
