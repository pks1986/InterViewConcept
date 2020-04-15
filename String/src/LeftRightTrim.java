import java.util.Scanner;


public class LeftRightTrim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any String with spaces:\n");
		String str = sc.nextLine();
		System.out.println("Length Before Trimming: " + str.length());
		System.out.println("String Before Trimming: " + str);
		
		System.out.println("\nString After Trimming:-");
		char[] str2 = str.toCharArray();
		int len = str.length();
		int count = 0;
		char[] str3 = new char[len];
		for(int i = 0; i <len; i++){
			if(str2[i]==(char)32){
				count++;
			}
			else
				str3[i-count]= str2[i];					
		}
		char[] str4 = new char[len-count];
		for(int i = 0; i < str4.length; i++){
			str4[i]=str3[i];
		}
		String str5 = new String(str4);
		System.out.println("Length After Trimming: " + str5.length());
		System.out.println("Value after trimming: " + str5);
	}

}
