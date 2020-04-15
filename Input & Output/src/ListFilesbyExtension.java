import java.io.File;
import java.io.FilenameFilter;

class FileExtension3 implements FilenameFilter {
	
	String extension;
	FileExtension3(String extension){
		this.extension = extension;
	}
	public boolean accept(File dir, String name){
		String ext = "." + extension;
		return name.endsWith(ext);
	}
}
public class ListFilesbyExtension{
	
	//Selecting files by their extensions and use of listFiles()
	
	public static void main(String[] args){
		File f = new File("C:/Users/RAKESH/Desktop");
//		File f = new File("C:/Users/RAKESH/Desktop/");		//Will also work
		File[] dir = f.listFiles(new FileExtension3("pdf"));
		System.out.println("List of JPEG files on Desktop:-\n");
		for(int i = 0; i <dir.length; i ++){
			System.out.println(dir[i].getName());
		}
	}
}
