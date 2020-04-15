package concurrency.blockingqueue.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class ArrayBlockingQueueExample {

	public static void main(String[] args) throws InterruptedException {
		BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<String>(2);
		blockingQueue.offer("1");
		blockingQueue.offer("2", 100, TimeUnit.MILLISECONDS);
		System.out.println(blockingQueue.element());
		System.out.println(blockingQueue.poll());
		System.out.println(blockingQueue.element());
		System.out.println(blockingQueue.offer("1"));
		System.out.println(blockingQueue.offer("1")); // List is full

	}

}
