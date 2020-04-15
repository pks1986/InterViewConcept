import java.io.*;
public class ReadingCharacter {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		char ch;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please input Character:");
		ch = (char)br.read();
		System.out.println("Entered Character is " + ch);
	}
}
