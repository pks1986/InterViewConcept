package concurrency.exchanger;

import java.util.concurrent.Exchanger;

public class ExchangerDemo {

	public static void main(String[] args) {
		Exchanger<Object> exchanger = new Exchanger<>();
		new Thread(new Worker(exchanger, "A")).start();
		new Thread(new Worker(exchanger, "B")).start();

		/*
		 * new Thread(new Worker(exchanger, "C")).start(); new Thread(new
		 * Worker(exchanger, "D")).start(); new Thread(new Worker(exchanger,
		 * "E")).start();
		 */
	}
}
