import java.io.*;
public class BufferedInputStreamDemo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("C:/Users/RAKESH/Desktop/Tutorial.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		int i;
		
		while((i = bis.read())!= -1 ){
			System.out.print((char)i);
		}
	}
}
