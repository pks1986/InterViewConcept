import java.io.*;

class FileExtension2 implements FilenameFilter {
	
	String extension;
	FileExtension2(String extension){
		this.extension = extension;
	}
	public boolean accept(File dir, String name){
		String ext = "." + extension;
		return name.endsWith(ext);
	}
}
public class FileExtension{
	
	//Selecting files by their extensions
	
	public static void main(String[] args){
		File f = new File("C:/Users/RAKESH/Desktop/");
		String[] dir = f.list(new FileExtension2("JPG"));
//		String[] dir = f.list(new FileExtension2("pdf"));
		System.out.println("List of JPEG files on Desktop:-\n");
		for(int i = 0; i <dir.length; i ++){
			System.out.println(dir[i]);
		}
	}
}
