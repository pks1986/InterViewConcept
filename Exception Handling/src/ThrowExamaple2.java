
public class ThrowExamaple2 {
	static void thro(){
		try{
			throw new NullPointerException("Exception Thrown");
		}catch (NullPointerException npe){
			System.out.println("Excpetion Caught by Catch block");
			System.out.println(npe);
			throw npe;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			thro();
		}catch (Exception e){
			System.out.println("Exception caught again by calling function");
			System.out.println(e);
		}
		

	}

}
