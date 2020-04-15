package concurrency.countdownlatchdemo;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {

	public static void main(String[] args) throws InterruptedException {
		CountDownLatch ccl = new CountDownLatch(3);

		new Thread(new Worker(ccl, 1000)).start();
		new Thread(new Worker(ccl, 2000)).start();
		new Thread(new Worker(ccl, 3000)).start();

		System.out.println("Current Thread is going to wait for countdown latch to reach 0");
		ccl.await();
		System.out.println("Current Thread wait completed");

	}

}
