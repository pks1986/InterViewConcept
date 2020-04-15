package concurrency.reentrantlock.lockunlockexample;

import java.util.concurrent.locks.ReentrantLock;

public class TaskImplementor implements Task {
	
	private ReentrantLock reentrantLock = new ReentrantLock();
	

	@Override
	public void permormTask() {
		
		reentrantLock.lock();
		
		try {
			
			//reentrantLock.lock();
			System.out.println("\nLock acquired by " + Thread.currentThread().getName());
			System.out.println("Lock Hold Count: " + reentrantLock.getHoldCount());
			//System.out.println("Processing...");
			Thread.sleep(500);
			
		} catch(Exception e) {
			
			e.printStackTrace();
			
		} finally {
			System.out.println("Releasing Lock by " + Thread.currentThread().getName());
			reentrantLock.unlock();
			//reentrantLock.unlock();
		}	
	}
}
