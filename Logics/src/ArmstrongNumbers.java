import java.util.Scanner;


public class ArmstrongNumbers {

	/**
	 * An Armstrong numbers is equal to sum of cubes of its digits
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the 3 digit range for finding Armstrong Numebrs: ");
		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		int n1, n2, n3, n4;
		for(int i = 1; i <= range; i++){
			n1 = i/100; 	//first digit 1
			n2 = i%100; 	//last 2 digits 53
			n3 = n2/10;		//2nd last digit 5
			n4 = n2%10;		//last digit
			int num = n1*n1*n1 + n3*n3*n3 + n4*n4*n4;
			if(num == i){
				System.out.println(i);
			}
		}

	}

}
