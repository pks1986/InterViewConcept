package concurrency.semaphore;

public class CountingSemaphore {
	private int signal = 0;

	public synchronized void take() {
		this.signal++;
		System.out.println("take() Signal:" + signal);
		this.notify();
	}

	public synchronized void release() throws InterruptedException {
		while (this.signal == 0) { // without signal how will it decrease
			wait();
		}
		this.signal--;
		System.out.println("release() Signal:" + signal);
	}
}
