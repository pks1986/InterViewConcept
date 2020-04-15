import java.io.File;

public class FileDirTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("E:/PHOTOS");
		String[] dir = f.list();
		if(f.isDirectory()){
			System.out.println("Direcotry Structure of " + f);
			for(int i = 0; i < dir.length; i ++){
				File f2 = new File("E:/PHOTOS/" + dir[i]);
				if(f2.isDirectory()){
					System.out.println(f2 + " is a directory");
				}
				else{
					System.out.println(f2 + " is a file");
				}
			}
		}
		else
		System.out.println(f + " is not a directory");
	}
}
