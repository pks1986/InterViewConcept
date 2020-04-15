import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileInputStream2 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("C:/Users/RAKESH/Desktop/Tutorial.txt");
		FileOutputStream fos = new FileOutputStream("C:/Users/RAKESH/Desktop/Tutorial5.txt");
		int size = fis.available();
		System.out.println("Number of bytes in file: " + size);
	
		int i = fis.read();
		while(i != -1){
			fos.write((byte) i);
			i = fis.read();
		}
		System.out.println("Copy Operation Done");
		fis.close();
		fos.flush();
	}
}
