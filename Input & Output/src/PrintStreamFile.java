import java.io.*;
public class PrintStreamFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileOutputStream fos = new FileOutputStream("C:/Users/RAKESH/Desktop/Tutorial.txt", true);
		PrintStream pout = new PrintStream(fos);
		
		pout.println(235);
		pout.println("Hello");
		pout.println("Writing data using PrintStream Class");
		
		pout.flush();
		fos.flush();
		pout.close();
		fos.close();
	}
}
