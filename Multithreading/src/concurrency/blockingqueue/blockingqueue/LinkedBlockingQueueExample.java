package concurrency.blockingqueue.blockingqueue;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class LinkedBlockingQueueExample {

	public static void main(String[] args) throws InterruptedException {
		LinkedBlockingQueue<String> blockingQueue = new LinkedBlockingQueue<String>(2);
		blockingQueue.offer("2", 100, TimeUnit.MILLISECONDS);
		blockingQueue.offer("1");
		System.out.println(blockingQueue.element());
		System.out.println(blockingQueue.take());
		System.out.println(blockingQueue.element());
		System.out.println(blockingQueue.offer("1"));
		System.out.println(blockingQueue.offer("1")); // List is full

	}

}
