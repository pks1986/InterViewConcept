import java.util.Scanner;

public class PrimeNumberChkOptimized {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		sc.close();
		int flag = 0;
		System.out.println("Before: " + System.currentTimeMillis());
		int sqrt = (int) Math.sqrt(num);
		for (int i = 2; i < sqrt; i++) {
			if (num % i == 0) {
				flag = 1;
				break;
			}
		}

		System.out.println("After:  " + System.currentTimeMillis());
		if (flag == 0) {
			System.out.println(num + " is a prime number");
		} else {
			System.out.println(num + " is not a prime number");
		}

	}
}
