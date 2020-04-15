package concurrency.readwritelock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockExample {

	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(5);
		ReadWriteLock lock = new ReentrantReadWriteLock();

		for (int i = 0; i < 10; i++) {
			service.execute(new ReadWorker(lock));
			// service.execute(new WriteWorker(lock));
		}
	}
}
