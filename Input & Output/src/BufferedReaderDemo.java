import java.io.*;
public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		FileReader fr = new FileReader("C:/Users/RAKESH/Desktop/Tutorial.txt");
		BufferedReader br = new BufferedReader(fr);
		
		int i;
		while((i = br.read()) != -1){
			System.out.print((char)i);
		}
	}
}
