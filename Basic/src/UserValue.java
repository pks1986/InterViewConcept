import java.util.*;
public class UserValue {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter first integer: ");
		int num1 = s.nextInt();
		System.out.println("Enter second integer: ");
		int num2 = s.nextInt();
		System.out.println(num1 + num2);
	
		System.out.println("Enter first double: ");
		double d1 = s.nextDouble();
		System.out.println("Enter second double: ");
		double d2 = s.nextDouble();
		
		System.out.println(d1 + d2);
		
		System.out.println("Enter first String: ");
		String s1 = s.next();
		System.out.println("Enter second String: ");
		String s2 = s.next();
		
		System.out.println(s1 + s2);
//		System.out.println("Enter first Character: ");
//		char c1 = ()s.next();
//		
//		
//		System.out.println(s1 + s2);
	}

}
