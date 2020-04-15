import java.io.*;

public class PushbackReaderDemo {

	/**
	 *  How a programming language parser can use a pushback stream to deal with the difference between the == operator for comparison and the = operator for assignment
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		String str = "if (a == 4) a = 0;\n";
		char[] ch = str.toCharArray();
		CharArrayReader isr = new CharArrayReader(ch);
		PushbackReader push = new PushbackReader(isr);
		
		int i;
		while((i = push.read()) != -1){
			switch(i){
				case '=':{
					if((i = push.read()) == '='){
						System.out.print(" .eq. ");
					}
					else{
						System.out.print(" <- ");
						push.unread(i);
					}
					break;
				}
				default:
					System.out.print((char)i);
				
			}
			
		}
		
	}

}
