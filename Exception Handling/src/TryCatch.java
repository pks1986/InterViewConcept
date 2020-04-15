public class TryCatch {
	
	public static void main(String[] args) {
		try{
			int a, n;
			a = 5;
			n = a/0;
			System.out.println("This will not be printed");
		}catch(ArithmeticException ae){
			System.out.println(ae);
		}
		System.out.println("Statements after try catch blocks");

	}

}
