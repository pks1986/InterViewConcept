
public class ThrowExample {
	
	static void validate(int age){		
		if(age<18){
			throw new ArithmeticException("Age is less");		
		}
		else{
			System.out.println("Welcome to vote");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		validate(2);
		System.out.println("Rest of the code");
	}
}
