class Exc3 extends Exception{
	Exc3(String s){
		super(s);
	}
}

public class CustomExc{
	
	static void vote(int age) throws Exc3 {
		if(age<18)
			throw new Exc3("Your Age is less than 18");
		else
			System.out.println("Welcome to vote");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try {
				vote(1);
			} catch (Exc3 e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Rest of the code");
	}

}
