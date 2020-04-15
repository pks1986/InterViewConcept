import java.io.*;
public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("G:/JAVA/JataTPoint/CORE JAVA/abc.txt");
		String s = "Yuvraj Singh is my Favourite Player";
		byte[] b = s.getBytes();
		fos.write(b);
		fos.flush();
		System.out.println("Success");
		fos.close();
	}
}
