import java.util.Scanner;

public class ReverseOfaNumber {

	public static void main(String[] args) {
		System.out.println("Please enter an integer: ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		System.out.println("Reverse of " + input + " is " + reverse(input));
		sc.close();
	}
	
	
	public static int reverse(int input) {
		int reverse = 0;
		while (input != 0) {
			reverse = reverse * 10 + input % 10;
			input = input / 10;
		}
		
		return reverse;
	}

}
