package concurrency.executorservice;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ExecutorServiceExamples {

	public static void main(String[] args) {

		ExecutorServiceExamples examples = new ExecutorServiceExamples();
		//examples.implementSingleThreadExample();
		//examples.implementFixedThreadPoolExample();
		//examples.implementScheduledThreadPoolExample();
		//examples.submitWithRunnableExample();
		examples.submitWithCallableExample();

	}

	private void implementSingleThreadExample() {
		System.out.println("Single Thread Executor");
		ExecutorService service = Executors.newSingleThreadExecutor();
		for (int i = 0; i < 10; i++) {
			service.execute(new Task());

		}
		service.shutdown();
	}

	private void implementFixedThreadPoolExample() {
		ExecutorService service = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 10; i++) {
			service.execute(new Task());

		}
		service.shutdown();
	}

	private void implementScheduledThreadPoolExample() {
		ExecutorService service = Executors.newScheduledThreadPool(2);
		for (int i = 0; i < 10; i++) {
			service.execute(new Task());
		}
		service.shutdown();
	}
	
	private void submitWithRunnableExample() {
		ExecutorService service = Executors.newScheduledThreadPool(2);
		Future<?> future = service.submit(new Task());
		try {
			System.out.println("Future get(): " + future.get());
			System.out.println("Future get() with max timeout: " + future.get(12000, TimeUnit.MILLISECONDS));
			
		} catch (InterruptedException | ExecutionException | TimeoutException e) {
			e.printStackTrace();
		}
	}
	
	private void submitWithCallableExample() {
		ExecutorService service = Executors.newScheduledThreadPool(2);
		Future<String> future = service.submit(new Callable<String>() {

			@Override
			public String call() throws Exception {
				
				return "Hello From Callable";
			}
		});
		try {
			System.out.println("Future get(): " + future.get());
			System.out.println("Future get() with max timeout: " + future.get(12000, TimeUnit.MILLISECONDS));
			
		} catch (InterruptedException | ExecutionException | TimeoutException e) {
			e.printStackTrace();
		}
	}
}

class Task implements Runnable {
	@Override
	public void run() {
		Thread thread = Thread.currentThread();
		System.out.println("\nExecuting: " + thread);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Execution Completed: " + Thread.currentThread());

	}
}
