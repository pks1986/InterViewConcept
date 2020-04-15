import java.util.Scanner;


public class TryFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Scanner s = new Scanner(System.in);
			System.out.println("First Number: ");
			int num1 = s.nextInt();
			System.out.println("Second Number:");
			int num2 = s.nextInt();
			System.out.println(num1/num2);
			System.exit(0);
		}
		finally{
			System.out.println("\nFinally Block executed");
		}
//		finally{
//			System.out.println("Second Finally Block"); //Error, only 1 finally block is permitted.
	}

}

