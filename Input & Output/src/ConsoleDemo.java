import java.io.*;
public class ConsoleDemo {
	
	//This program is not working in Eclipse
	//Because it is not able to get the Console object
	//It is working fine in Command Prompt

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Console con = System.console();
		System.out.println(con);
		System.out.println("Please enter your name: ");
		String name = "";
		name = con.readLine();
		System.out.println("Your have Entered\n\n" + name);

	}
}
