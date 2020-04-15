package concurrency.reentrantlock.lockunlockexample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
	
	private static final int THREAD_COUNT = 3;

	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(THREAD_COUNT);
		Task task = new TaskImplementor();
		
		for(int i = 0; i < 10; i ++) {
			service.execute(new Worker(task));
		}
		service.shutdown();

	}

}
