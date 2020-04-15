import java.io.*;

class Excep{
	void thro() throws IOException{
		System.out.println("Exception may occur now");
		throw new IOException("IOException Occured");
	}
}
public class ThrowsExample {
	/**
	*@ Exception declared by thro() and main()
	*/
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Excep ex = new Excep();
		ex.thro();
		System.out.println("Rest of the code of main fn");

	}

}
