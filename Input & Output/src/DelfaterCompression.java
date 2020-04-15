import java.io.*;
import java.util.zip.DeflaterOutputStream;
public class DelfaterCompression {

	/**
	 * Compressing a file using DeflaterOutputStream
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("C:/Users/RAKESH/Desktop/Rakesh Resume.docx");
		FileOutputStream fos = new FileOutputStream("C:/Users/RAKESH/Desktop/Resume.docx");
		DeflaterOutputStream dos = new DeflaterOutputStream(fos);
		
		int i;
		
		while((i = fis.read()) != -1){
			dos.write((char)i);
		}		
		
		dos.flush();
		dos.close();
		fis.close();
		fos.close();
		System.out.println("Operation Completed");

	}

}
