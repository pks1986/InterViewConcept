import java.util.Scanner;


public class LastIndexOf {
	
	//Last index of a string
	//This may help to find the occurance of Strings

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any String with spaces:\n");
		String str = sc.nextLine();
			
		String[] str2 = str.split(" ");
		int count = 0;
		for(String str3: str2){
			if(str3.matches("string"));
			count++;
		}		
		
//		System.out.println("string keyword is repeated " + count + " times");

	}

}
