import java.io.*;
public class ReadingDataKeyboard {

	/**
	 * Reading data from Keyboard using BufferedReader and InputStreamReader
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Please Enter Your Name: \n");
		String name = br.readLine();
		
		br.close();
		System.out.println("Welcome " + name);

	}

}
