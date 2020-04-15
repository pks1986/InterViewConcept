import java.io.*;

public class ByteArrayInputOutputEx {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("C:/Users/RAKESH/Desktop/Tutorial.txt");
		int size = fis.available();
		byte[] b = new byte[size];
		for(int i = 0; i < size; i ++){
			b[i] = (byte)fis.read();
	//		System.out.print((char)b[i]);
		}
		
		//Creating object by passing array.
		ByteArrayInputStream bais = new ByteArrayInputStream(b);
		
		//Accessing data from ByteArrayInputStream
		size = bais.available();
		for(int i = 0; i < size; i++){
			System.out.print((char)bais.read());
		}
		
		//Writing data to OutputStream Using ByteArrayOutputStream write
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		//Writing data to BytArrayOutputStream
		baos.write(b);
		
		//Writing data of baos to a file using FileOutputStream
		FileOutputStream fos = new FileOutputStream("C:/Users/RAKESH/Desktop/Tutorial5.txt");
		baos.writeTo(fos);

	}
}
