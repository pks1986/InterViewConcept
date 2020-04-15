import java.util.Scanner;


public class Palindrome {

	/**
	 * Check whether a number is palindrome or not 1234
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a 4 digit number: ");
		int num = sc.nextInt();
		int n1, n2, n3, n4, n5, n6;
	
		n5 = num%1000; //last 3 digits   234
		n4 = num/1000; //1st digit		1
		
		n3 = n5/100; 	//2nd digit		2
		n6 = n5%100;	//last 2 digits	34
		
		n1 = n6%10;		//last digit	4
		
		n2 = n6/10;		//3rd digit		3
		
		int rev = n1*1000 + n2*100 + n3*10 + n4;
		System.out.println("Reverse si: " + rev);		
	}

}
