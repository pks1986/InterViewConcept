import java.io.*;
public class FileInputStreamEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		FileInputStream fis = new FileInputStream("G:/JAVA/JataTPoint/CORE JAVA/My Pic.JPG");
		FileInputStream fis = new FileInputStream("E:/SONGS/MOVIES' SONGS/Mere-Brother-Ki-Dulhan/Mere Brother Ki Dulhan - Front.JPG");
		FileOutputStream fos = new FileOutputStream("C:/Users/RAKESH/Desktop/Copy2.JPG");
		int size = fis.available();
		System.out.println("Number of bytes in file: " + size);
//		for(int i = 0; i < size ; i++){
//			System.out.print((char)fis.read());
//		}
		
		int i = fis.read();
		while(i != -1){
			fos.write((byte)fis.read());
		}
		fis.close();
		fos.flush();
	}
}
