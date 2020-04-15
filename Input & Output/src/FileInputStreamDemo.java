import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("G:/java2/Input & Output/src/FileInputStreamDemo.java");
		System.out.println("Available Bytes: " + fis.available());
		int n = fis.available()/20;
		System.out.println("Reading first " + n + " bytes, one read at a time\n");
		for(int i = 0; i < n; i++){
			System.out.print((char)fis.read());
		}
		System.out.println("\n\n\nAfter read() Available Bytes: " + fis.available());
		
		//Checking if n number of bytes are read or not
		byte[] b = new byte[n];
		if(fis.read(b)!=n){
			System.err.println("Could not read " + n + " bytes");
		}
		System.out.println(new String(b, 0, n));
		n = fis.available();
		System.out.println("\nStill Available " + n + " bytes");
		
		System.out.println("Skipping half of the remaining\n");
		fis.skip(n/2);
		System.out.println("Reading " + n/2 + " into the end of array");
//		if(fis.read(b, n/2, n/2) != n/2){
//			System.err.println("Could not read " + n/2 + " bytes");
//		}
//		for(int i = 0; i < n/2; i++){
//			System.out.print((char)fis.read(b));
//		}
		System.out.println(new String(b, 0, b.length));
		System.out.println("Still Available: " + fis.available());
	}
}





