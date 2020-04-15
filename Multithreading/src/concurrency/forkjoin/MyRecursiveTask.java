package concurrency.forkjoin;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class MyRecursiveTask extends RecursiveTask<Integer> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final int THRESHOLD = 2;
	private final int arr[];

	public MyRecursiveTask(int arr[]) {
		this.arr = arr;
	}

	@Override
	protected Integer compute() {

		if (arr.length > THRESHOLD) {
			ForkJoinTask.invokeAll(createSubtasks());
		} else {
			return findGreatest(arr);
		}
		return 0;
	}

	private List<MyRecursiveTask> createSubtasks() {

		List<MyRecursiveTask> subtask = new ArrayList<>();

		return subtask;

	}

	private int findGreatest(int arrOfTwo[]) {

		if (arrOfTwo.length == 1) {
			return arrOfTwo[0];

		} else {

			if (arrOfTwo[0] > arrOfTwo[1]) {
				System.out.println(arrOfTwo[0] + " is greater than " + arrOfTwo[1]);
				return arrOfTwo[0];

			} else if (arrOfTwo[0] < arrOfTwo[1]) {
				System.out.println(arrOfTwo[0] + " is smaller than " + arrOfTwo[1]);
				return arrOfTwo[1];

			} else {
				System.out.println(arrOfTwo[0] + " is equal to " + arrOfTwo[1]);
				return arrOfTwo[0];
			}
		}
	}
}
