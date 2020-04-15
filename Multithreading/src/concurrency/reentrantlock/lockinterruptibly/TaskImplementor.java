package concurrency.reentrantlock.lockinterruptibly;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.locks.ReentrantLock;

public class TaskImplementor implements Task {

	private ReentrantLock reentrantLock = new ReentrantLock();
	private static int counter = 0;

	@Override
	public void permormTask() {

		try {
			
			//Interrupting all threads except first thread;
			if(counter != 0) {

				System.out.println("Counter " + counter);
				Thread thread = Thread.currentThread();
				new Timer().schedule(new TimerTask() {
					
					@Override
					public void run() {
						thread.interrupt();						
					}
				}, 2000);	
			}
			counter ++;
			
			System.out.println("Trying to get lock " + Thread.currentThread().getName());
			reentrantLock.lockInterruptibly();

			
			
			try {
				System.out.println("\nLock acquired by " + Thread.currentThread().getName());
				System.out.println("Processing...");
				Thread.sleep(10000);

			} catch (Exception e) {

				e.printStackTrace();

			} finally {
				System.out.println("Releasing Lock by " + Thread.currentThread().getName());
				reentrantLock.unlock();
			}
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
