import java.io.*;
public class FileWriterDemo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("C:/Users/RAKESH/Desktop/Tutorial.txt", true);
		fw.write("Appending data to the previous saved data");
		fw.flush();
		fw.close();
	}
}
