package concurrency.forkjoin;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;

public class MyRecursiveAction extends RecursiveAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final int THRESHOLD = 2;
	private String workload = "";

	public MyRecursiveAction(String workload) {
		this.workload = workload;
	}

	@Override
	protected void compute() {
		if (workload.length() > THRESHOLD) {
			ForkJoinTask.invokeAll(createSubtasks());
		} else {
			processing(workload);
		}
	}

	private List<MyRecursiveAction> createSubtasks() {
		List<MyRecursiveAction> subtasks = new ArrayList<>();

		String partOne = workload.substring(0, workload.length() / 2);
		String partTwo = workload.substring(workload.length() / 2, workload.length());

		subtasks.add(new MyRecursiveAction(partOne));
		subtasks.add(new MyRecursiveAction(partTwo));

		return subtasks;
	}

	private void processing(String work) {
		String result = work.toUpperCase();
		System.out.println("This result - (" + result + ") - was processed by " + Thread.currentThread().getName());
	}
}
