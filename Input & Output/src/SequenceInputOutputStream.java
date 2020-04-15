import java.io.*;

public class SequenceInputOutputStream {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileInputStream fis1 = new FileInputStream("C:/Users/RAKESH/Desktop/Tutorial.txt");
		FileInputStream fis2 = new FileInputStream("C:/Users/RAKESH/Desktop/Tutorial2.txt");
		
		SequenceInputStream sis = new SequenceInputStream(fis1, fis2);
		FileOutputStream fos = new FileOutputStream("C:/Users/RAKESH/Desktop/Tutorial5.txt");
		
		
		//available() of SequenceInputStream Determines only number of bytes available in first Stream.
		int size = fis1.available() + fis2.available();
		int k;
		System.out.println("Size: " + size);
		for(int i = 0; i < size; i ++){
			k = sis.read();
			fos.write(k);
		}
		System.out.println("Copy Paste Completed");
	}

}
