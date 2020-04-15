import java.io.*;
public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("C:/Users/RAKESH/Desktop/Tutorial.txt", true);
		BufferedWriter bw = new BufferedWriter(fw);
		
		String str = "Now appending data with BufferedWriter Class";
		
		bw.write(str);
		bw.flush();
		bw.close();
		System.out.println("Write Operation Completed");

	}

}
