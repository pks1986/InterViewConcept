package concurrency.forkjoin;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class RecursiveActionExample {

	public static void main(String[] args) {
		RecursiveAction recursiveAction = new MyRecursiveAction("Recursive Action Example");

		ForkJoinPool forkJoinPool = new ForkJoinPool(3);
		// ForkJoinPool forkJoinPool2 = ForkJoinPool.commonPool();
		forkJoinPool.invoke(recursiveAction);
	}
}
