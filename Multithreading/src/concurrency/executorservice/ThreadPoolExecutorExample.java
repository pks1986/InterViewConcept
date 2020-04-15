package concurrency.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorExample {

	public static void main(String[] args) {
		int  corePoolSize  =    2;
		int  maxPoolSize   =   5;
		long keepAliveTime = 500;
		
		ExecutorService service = new ThreadPoolExecutor(
                corePoolSize,
                maxPoolSize,
                keepAliveTime,
                TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>()
                );
		
		for(int i = 0; i < 50; i ++) {
			service.execute(new Runnable() {
				
				@Override
				public void run() {
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Current Thread: " + Thread.currentThread());	
				}
			});
		}
		service.shutdown();
	}

}
