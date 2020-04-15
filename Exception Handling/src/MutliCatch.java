import java.util.Scanner;
public class MutliCatch {

	public static void main(String[] args) {
		try{
			Scanner s = new Scanner(System.in);
			System.out.println("First Number: ");
			int num1 = s.nextInt();
			System.out.println("Second Number:");
			int num2 = s.nextInt();
			System.out.println(num1/num2);
			
			int val = Integer.parseInt(args[0]);
			
		}catch(ArithmeticException ae){
			System.out.println(ae);
			
		}catch(NumberFormatException nfe){
			System.out.println(nfe);
			
		}catch(ArrayIndexOutOfBoundsException aiobe){
			System.out.println(aiobe);
			
		}catch(Exception e){
			System.out.println(e);
		}
		
		System.out.println("Rest of the code");
		
	}

}
