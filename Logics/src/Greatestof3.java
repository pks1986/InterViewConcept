import java.util.Scanner;

public class Greatestof3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please input 3 numbers:");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
//		if(n1>n2 && n1>n3)
//			System.out.println(n1 + " is greatest");
//		if(n2>n1 && n2>n3)
//			System.out.println(n2 + " is greatest");
//		if(n3>n1 && n3>n2)
//			System.out.println(n3 + " is greatest");
		
		if(n1>n2){
			if(n1>n3){
				System.out.println(n1 + " is greatest");
			}
		}
		else if(n2>n3){
			System.out.println(n2 + " is greatest");
		}
		else{
			System.out.println(n3 + " is greatest");
		}
			
	}
}

