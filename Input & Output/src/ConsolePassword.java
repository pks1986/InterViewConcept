import java.io.*;
public class ConsolePassword {
	//This program is not working in Eclipse
	//Because it is not able to get the Console object
	//It is working fine in Command Prompt	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Console con = System.console();
		System.out.println(con);
		System.out.println("Please enter your name: ");
		char[] name ;
		name = con.readPassword();
		for(char ch: name){
			System.out.println(ch);
		}

	}
}