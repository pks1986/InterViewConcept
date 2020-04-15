package concurrency.exchanger;

import java.util.concurrent.Exchanger;

public class Worker implements Runnable {

	private Exchanger<Object> exchanger;
	private Object object;

	public Worker(Exchanger<Object> exchanger, Object object) {
		this.exchanger = exchanger;
		this.object = object;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread() + " current object " + this.object);
		try {
			Thread.sleep(3000);

			Object previous = this.object;
			this.object = exchanger.exchange(this.object);

			System.out.println(Thread.currentThread() + " Exchanged " + object + " for " + previous);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
