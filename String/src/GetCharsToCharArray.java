
public class GetCharsToCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("Hello, Have a nice day");
		//char ch[] = new char[11];
		//s1.getChars(7, 18, ch, 0);
		//for(char ch2: ch3){
		
		
		char ch3[] = s1.toCharArray();
		for(char ch2: ch3){
			System.out.print(ch2);
		}
		System.out.println("\n");
		byte[] b = s1.getBytes();
		for(byte b2: b){
			System.out.print((char)b2);
		}
	}

}
