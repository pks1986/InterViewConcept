package concurrency.reentrantlock.trylockexample;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class TaskImplementor implements Task {

	private ReentrantLock reentrantLock = new ReentrantLock();

	@Override
	public void permormTask() {

		try {
			System.out.println("Trying to get lock " + Thread.currentThread().getName());
			boolean gotLock = reentrantLock.tryLock(10000, TimeUnit.MILLISECONDS);

			if (gotLock) {
				try {
					System.out.println("\nLock acquired by " + Thread.currentThread().getName());
					System.out.println("Processing...");
					Thread.sleep(15000);

				} catch (Exception e) {

					e.printStackTrace();

				} finally {
					System.out.println("Releasing Lock by " + Thread.currentThread().getName());
					reentrantLock.unlock();
					// reentrantLock.unlock();
				}
			} else {

				System.out.println("Could not get lock " + Thread.currentThread().getName());
			}
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
