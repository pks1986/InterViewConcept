package concurrency.blockingqueue.blockingqueue;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

public class PriorityBlockingQueueExample {

	public static void main(String[] args) throws InterruptedException {
		PriorityBlockingQueue<String> blockingQueue = new PriorityBlockingQueue<String>(2); // Initial Capacity, natural
																							// ordering if no comparable
		blockingQueue.offer("2", 100, TimeUnit.MILLISECONDS);
		blockingQueue.offer("1");
		System.out.println(blockingQueue.element());
		System.out.println(blockingQueue.take());
		System.out.println(blockingQueue.element());
		System.out.println(blockingQueue.offer("1"));
		System.out.println(blockingQueue.offer("1")); // List is full
	}

}
