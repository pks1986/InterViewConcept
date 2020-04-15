package concurrency.semaphore;

public class MySemaphore {

	private boolean signal = false;

	public synchronized void take() {
		this.signal = true;
		this.notify();
	}

	public synchronized void release() throws InterruptedException {
		while (this.signal == false) { // without signal how will it release
			wait();
		}
		this.signal = false;
	}

}
