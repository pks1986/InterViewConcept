import java.util.Scanner;


public class LeftRightTrim2 {
	
	//incomplete
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any String with spaces:\n");
		String str = sc.nextLine();
		System.out.println(str.length());
		System.out.println(str);
		String[] str2 = str.split(" ");
		String str3 = new String(str2[0]);
		System.out.println(str3.length());
		System.out.println(str3);

	}

}
