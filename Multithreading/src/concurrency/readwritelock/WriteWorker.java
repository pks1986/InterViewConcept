package concurrency.readwritelock;

import java.util.concurrent.locks.ReadWriteLock;

public class WriteWorker implements Runnable {

	private ReadWriteLock lock;

	public WriteWorker(ReadWriteLock lock) {
		this.lock = lock;
	}

	@Override
	public void run() {
		lock.writeLock().lock();
		System.out.println("\nExecuting: " + Thread.currentThread());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Execution Completed: " + Thread.currentThread());
		lock.writeLock().unlock();

	}

}
