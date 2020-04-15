package concurrency.semaphore;

public class MySemaphoreTest {

	public static void main(String[] args) {

		/*
		 * MySemaphore semaphore = new MySemaphore(); ReleaseThread releaseThread = new
		 * ReleaseThread(semaphore); TakeThread takeThread = new TakeThread(semaphore);
		 */

		CountingSemaphore countingSemaphore = new CountingSemaphore();
		ReleaseThread releaseThread = new ReleaseThread(countingSemaphore);
		TakeThread takeThread = new TakeThread(countingSemaphore);

		new Thread(releaseThread).start();
		new Thread(takeThread).start();
	}

}
