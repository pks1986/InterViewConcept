import java.io.*;
public class ReadDataDemo2 {

	/**
	 * Reading data until user writes stop word
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String name = "";
		
		System.out.println("Please Start Entering Your String");
		
		while(name != "stop"){		//Infinite Loop
			System.out.println("Enter data, stop to terminate");
			name = br.readLine();
			if(name.equals("stop")){
				break;
			}
			else
				System.out.println("Data is " + name);
		}
		
		isr.close();
		br.close();
		System.out.println("Program Terminated");
	}
}
