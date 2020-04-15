package concurrency.semaphore;

public class TakeThread implements Runnable {

	private MySemaphore semaphore;
	private CountingSemaphore countingSemaphore;

	public TakeThread(MySemaphore semaphore) {
		this.semaphore = semaphore;
	}

	public TakeThread(CountingSemaphore countingSemaphore) {
		this.countingSemaphore = countingSemaphore;
	}

	@Override
	public void run() {
		while (true) {
			if (semaphore != null) {
				System.out.println("Do Something, then signal");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				semaphore.take();
			} else {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				countingSemaphore.take();
			}
		}

	}
}
