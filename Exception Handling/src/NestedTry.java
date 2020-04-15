import java.util.Scanner;


public class NestedTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Scanner s = new Scanner(System.in);
			System.out.println("First Number: ");
			int num1 = s.nextInt();
			System.out.println("Second Number:");
			int num2 = s.nextInt();
			System.out.println(num1/num2);
			try{
				int val = Integer.parseInt(args[0]);
			}catch(NumberFormatException nfe){
				System.out.println(nfe);
			}
		}catch(ArithmeticException ae){
			System.out.println(ae);
		}catch(Exception e){
			System.out.println(e);
		}
		System.out.println("Statements after try catch block");
	}

}
