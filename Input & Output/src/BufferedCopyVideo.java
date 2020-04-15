import java.io.*;
public class BufferedCopyVideo {

	/**
	 * Trying to copy 2 video files into 1 video file
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileInputStream fis1 = new FileInputStream("C:/Users/RAKESH/Desktop/B.flv");
		FileInputStream fis2 = new FileInputStream("C:/Users/RAKESH/Desktop/A.flv");
		SequenceInputStream sir = new SequenceInputStream(fis1, fis2);
		
		BufferedInputStream bis = new BufferedInputStream(sir);
		
		FileOutputStream fos = new FileOutputStream("C:/Users/RAKESH/Desktop/C.MP4");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		System.out.println("Starting copying operation");
		
		
		int size = fis1.available() + fis2.available();
		int k;
		for(int i = 0; i < size; i ++){
			k = bis.read();
			bos.write(k);
		}
		bos.close();
		bis.close();
		fis1.close();
		fis2.close();
		System.out.println("Combined Operation Successfully Completed");

	}

}
