import java.util.Scanner;


public class Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Scanner s = new Scanner(System.in);
			System.out.println("First Number: ");
			int num1 = s.nextInt();
			System.out.println("Second Number:");
			int num2 = s.nextInt();
			System.out.println(num1/num2);
			s.close();
		}catch(NullPointerException e){      
			System.out.println(e);
		}
//		catch(Exception e){
//			System.out.println(e);
//		}
		finally{
			
			System.out.println("\nFinally Block executed");
		}
		System.out.println("Rest of the code");

	}

}
