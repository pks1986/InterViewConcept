import java.io.*;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		FileReader fr = new FileReader("C:/Users/RAKESH/Desktop/Tutorial.txt");
		
		int i;
		while((i = fr.read()) != -1){
			System.out.print((char)i);
		}
		fr.close();
	}
}
