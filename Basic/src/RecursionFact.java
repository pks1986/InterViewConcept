import java.util.Scanner;


public class RecursionFact {

	/**
	 * Factorial of a number using recursion
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a number: ");
		int num = sc.nextInt();
		System.out.println("Factorial of " + num + " is " + factorial(num));

	}
	static int factorial(int num){
		int fact = 1;
		if(num == 1)
			return 1;
		else{
			fact = fact * factorial(num - 1);
			return fact;
		}
			
	}

}
