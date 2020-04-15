import java.io.File;

public class MakeDirectory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("C:/Users/RAKESH/Desktop/Mydir/Welcome 1/Welcome2r");
		System.out.println("Creating Directory using mkdir: " + f.mkdir());
		System.out.println("Creating Directory Using mkdirs: " + f.mkdirs());
	}
}
