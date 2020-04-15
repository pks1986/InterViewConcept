import java.io.*;
public class CharArrayWriterDemo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		CharArrayWriter caw = new CharArrayWriter();
		caw.write("My Name is Rakesh");
		
		FileWriter fw1 = new FileWriter("C:/Users/RAKESH/Desktop/Tutorial.txt", true);
		FileWriter fw2 = new FileWriter("C:/Users/RAKESH/Desktop/Tutorial2.txt", true);
		FileWriter fw3 = new FileWriter("C:/Users/RAKESH/Desktop/Tutorial5.txt", true);
		
		caw.writeTo(fw1);
		caw.writeTo(fw2);
		caw.writeTo(fw3);
	
		caw.flush();
		caw.close();
		
		
		fw1.flush();
		fw2.flush();
		fw3.flush();
//		fw1.close();
//		fw2.close();
//		fw3.close();
		System.out.println("Write Operation Completed");

	}

}
