import java.util.Scanner;


public class FactorialFor {

	/**
	 * Factorial using for loop
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number whose factorial you want to calculate");
		int num = sc.nextInt();
		int fact = 1;
		for(int i = num; i > 0; i --){
			fact = fact*i;
		}
		System.out.println("Factorial of " + num + " is " + fact);
	}

}
