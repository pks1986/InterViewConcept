import java.io.*;
import java.util.zip.*;
public class InflaterUncompression {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("C:/Users/RAKESH/Desktop/Resume.docx");
		FileOutputStream fos = new FileOutputStream("C:/Users/RAKESH/Desktop/Resume2.docx");
		
		InflaterInputStream iis = new InflaterInputStream(fis);
		
		int i;
		while((i = iis.read()) != -1){
			fos.write((char)i);
		}
		fos.flush();
		iis.close();
		System.out.println("Task Completed");

	}

}
