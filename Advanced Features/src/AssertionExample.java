import java.util.Scanner;

public class AssertionExample {
	
	//will run using java -ea AssertionExample
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your age: ");
		int age = sc.nextInt();
		assert age>= 18: "Not Valid";
		
		System.out.println("Age is: " + age);

	}

}
