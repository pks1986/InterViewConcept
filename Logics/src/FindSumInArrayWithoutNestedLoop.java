import java.util.Scanner;

/* Given an array and a number, say a[] = new int[]1, 2, 5, 7, 12}; and number 12.
 * Find the first two number whose sum is equal to that number 12. The condition is that you cannot use nested loop.
 * eg, The output will be 5 + 7 = 12 */
public class FindSumInArrayWithoutNestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number of elements in the array:");
		int numElements = sc.nextInt();

		int arr[] = new int[numElements];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter element " + i);
			arr[i] = sc.nextInt();
		}

		System.out.println("\nEnter the summed up number: ");
		int sum = sc.nextInt();

		sc.close();

		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] + arr[i] == sum) {
				System.out.println(arr[i - 1] + " + " + arr[i] + " = " + sum);
				break;
			}
		}
	}
}
