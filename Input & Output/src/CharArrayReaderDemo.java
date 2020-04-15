import java.io.*;
public class CharArrayReaderDemo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char[] arr = str.toCharArray();
		CharArrayReader car = new CharArrayReader(arr);
		
		int i;
		while((i = car.read()) != -1){
			System.out.print((char)i);
		}
		car.close();
		System.out.println("\n\n");
		
		//Creating another Stream Reader
		CharArrayReader car2 = new CharArrayReader(arr, 0, 15);
		
		while((i = car2.read()) != -1){
			System.out.print((char)i);
		}
		car2.close();

	}

}
