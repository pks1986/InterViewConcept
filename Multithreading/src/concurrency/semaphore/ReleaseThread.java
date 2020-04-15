package concurrency.semaphore;

public class ReleaseThread implements Runnable {

	private MySemaphore semaphore;
	private CountingSemaphore countingSemaphore;

	public ReleaseThread(MySemaphore semaphore) {
		this.semaphore = semaphore;
	}

	public ReleaseThread(CountingSemaphore countingSemaphore) {
		this.countingSemaphore = countingSemaphore;
	}

	@Override
	public void run() {
		while (true) {

			if (semaphore != null) {
				try {
					semaphore.release();
					System.out.println("Receive Signal, Then do something");
					// receive signal, then do something...
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				try {
					countingSemaphore.release();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}
}
