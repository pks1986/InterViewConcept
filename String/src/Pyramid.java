import java.util.Scanner;


public class Pyramid {

	/**
	 * Example
	 * j
	 * ja
	 * jav
	 * java
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input String: ");
		String str = sc.nextLine();
		char ch[] = str.toCharArray();
		
		for(int i = 0; i < ch.length; i++){
			for(int j = 0; j < i+1; j ++){
				System.out.print(ch[j]);
			}
			System.out.println();
		}
		

	}

}
