import java.io.*;
import java.util.Enumeration;
import java.util.Vector;
public class SequenceInputEnum {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Opening 3 files to read
		FileInputStream fis1 = new FileInputStream("C:/Users/RAKESH/Desktop/Tutorial.txt");
		FileInputStream fis2 = new FileInputStream("C:/Users/RAKESH/Desktop/Tutorial2.txt");
		FileInputStream fis3 = new FileInputStream("C:/Users/RAKESH/Desktop/Tutorial5.txt");
		
		//Creating a Vector
		Vector<FileInputStream> v = new Vector<FileInputStream>();
		
		//Adding files to Vector
		v.addElement(fis1);
		v.addElement(fis2);
		v.addElement(fis3);
		
		//Creating Enumeration
		Enumeration<FileInputStream> en = v.elements();
		
		//Creating object of SequenceInputStream and passing Enumeration to it.
		SequenceInputStream sis = new SequenceInputStream(en);
		int i;
		
		System.out.println("Reading Data from 3 Files Now:\n");
		while( (i = sis.read())!=  -1){
			System.out.print((char)i);
		}
		System.out.println("\n\nData of 3 Files Read Successfully...");
	}

}
