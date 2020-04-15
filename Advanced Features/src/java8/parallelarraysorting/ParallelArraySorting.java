package java8.parallelarraysorting;

import java.util.Arrays;

public class ParallelArraySorting {

	public static void main(String[] args) {
		int arr[] = {5, 1, 3, 2, 8, 0, 3, 10};
		Arrays.parallelSort(arr);
		
		for (int i : arr) {
			System.out.print(i + "\t");
		}
	}
}
