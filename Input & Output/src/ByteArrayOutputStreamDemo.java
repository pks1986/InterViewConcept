import java.io.*;
public class ByteArrayOutputStreamDemo {

	/**
	 * @Rakesh Yadav
	 *	16th January 2014
	 *	Writing data specified in the write() to two files
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream out1 = new FileOutputStream("C:/Users/RAKESH/Desktop/Tutorial.txt");
		FileOutputStream out2 = new FileOutputStream("C:/Users/RAKESH/Desktop/Tutorial2.txt");
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		String str = "Yuvraj will not play Cricket World Cup 2015";
		byte[] b = str.getBytes();
		baos.write(b);
		
		baos.writeTo(out1);
		baos.writeTo(out2);
		baos.flush();
		System.out.println("Operation Completed");
		
	}

}
