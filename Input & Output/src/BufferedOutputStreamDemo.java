import java.io.*;
public class BufferedOutputStreamDemo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		FileOutputStream fos = new FileOutputStream("C:/Users/RAKESH/Desktop/Tutorial.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		String s = "This will override the data of tutorial.txt";
		byte[] b = s.getBytes();
		
		bos.write(b);
		
		bos.flush();
		
		bos.close();
		fos.close();
		
		System.out.println("Operation Complete");

	}

}
