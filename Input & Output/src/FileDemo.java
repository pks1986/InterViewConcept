import java.io.File;


public class FileDemo {
	static void print(String s){
		System.out.println(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("E:/PHOTOS");
		print("File Name: " + f.getName());
		print("Path: " + f.getPath());
		print("Abs Path = " + f.getAbsolutePath());
		print("Parent: " + f.getParent());
		print(f.exists()? "Exists" : " does not exist");
		print(f.canWrite()? "Writable" : "Not Writable");
		print(f.canRead()? "Readable" : "Not Readable");
		print(f.isDirectory()? "Directory" : "Not a direcotry");
		print("Last Modified: " + f.lastModified());
		print("Length: " + f.length() + " Bytes");

	}

}
