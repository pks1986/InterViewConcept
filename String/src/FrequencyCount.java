import java.util.Scanner;


public class FrequencyCount {
	
	public static void main(String[] args) {
		String str = new String("ababababababba");
		char ch[] = str.toCharArray();
		String str2 = "abc";
		char ch2[] = str2.toCharArray();
		
		int count = 0;
		int k = 0;
		for(int i = 0 + k; i < ch.length; i++){
			for(int j = 0; j < ch2.length; j ++){
				if(ch2[j]==ch[i]){
					count++;
					k++;
					break;
				}
				k++;				
				
			}
		}
		System.out.println(" abc is repeated " + count + " times");
		
		
	}

}
