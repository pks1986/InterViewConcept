package concurrency.readwritelock;

import java.util.concurrent.locks.ReadWriteLock;

public class ReadWorker implements Runnable {

	private ReadWriteLock lock;

	public ReadWorker(ReadWriteLock lock) {
		this.lock = lock;
	}

	@Override
	public void run() {
		lock.readLock().lock();
		System.out.println("Executing: " + Thread.currentThread());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Execution Completed: " + Thread.currentThread());
		lock.readLock().unlock();

	}

}
