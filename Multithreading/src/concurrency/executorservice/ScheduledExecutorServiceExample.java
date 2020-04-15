package concurrency.executorservice;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceExample {

	static int counter = 0;
	
	public static void main(String[] args) {

		ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(5);

		ScheduledFuture<?> scheduledFuture = scheduledExecutorService.schedule(new Callable<Object>() {
			public Object call() throws Exception {
				System.out.println("Executed!");
				return "Called!";
			}
		}, 2, TimeUnit.SECONDS);

		// scheduledFuture.cancel(true);

		try {
			System.out.println("result = " + scheduledFuture.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
			@Override
			public void run() {
				try {
					counter ++;
					if(counter == 5) {
						Thread.currentThread().interrupt();
					}
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Repeadted Task");

			}
		}, 2, 3, TimeUnit.SECONDS);
		
		scheduledExecutorService.scheduleWithFixedDelay(new Runnable() {
			@Override
			public void run() {
				try {
					counter ++;
					if(counter == 5) {
						Thread.currentThread().interrupt();
					}
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Repeadted Task");

			}
		}, 2, 3, TimeUnit.SECONDS);
	}

}
