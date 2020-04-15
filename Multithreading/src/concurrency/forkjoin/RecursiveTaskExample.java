package concurrency.forkjoin;

import java.util.concurrent.ForkJoinPool;

public class RecursiveTaskExample {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 6, 4, 3, 2, 3, 1, 2, 2, 1 };

		MyRecursiveTask task = new MyRecursiveTask(arr);
		ForkJoinPool forkJoinPool = new ForkJoinPool(4);
		forkJoinPool.execute(task);
		// forkJoinPool.
		int result = task.join();

	}

}
