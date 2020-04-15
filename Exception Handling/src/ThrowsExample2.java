import java.io.IOException;

class Excep2{
	void thro() throws IOException{
		System.out.println("Exception may occur now");
		throw new IOException("IOException Occured");
	}
}
public class ThrowsExample2 {
	/**
	*@ Exception declared by thro() and main()
	*/
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Excep2 ex = new Excep2();
		try {
			ex.thro();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//System.out.println(e);
			e.printStackTrace();
		}
		System.out.println("Rest of the code of main fn");

	}
}