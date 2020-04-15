/**
 * 
 */
package practice.com.example;

/**
 * @author SAMSUNG
 *
 */
public class Test {

	/**
	 * 
	 */
	public Test() {
		// TODO Auto-generated constructor stub
	}
	private static int stringReverse(String s) {
		// TODO Auto-generated method stub
		//System.out.println(s);
		int i;
		int count = 0;
		
		  for(i=0 ; i < s.length() ; i++) {
			  char ch=s.charAt(i);
	            if(ch==' ')
	            	//System.out.println(count++);
	           count++;
	            
		}
		return count;
		
		
	 } 

	private static int stringRev(String s) {
		// TODO Auto-generated method stub
		//System.out.println(s);
		int i;
		int count = 0;
		String rev = null;
		
		  for(i=s.length()-1 ; i>=0 ; i--) {
			  char ch=s.charAt(i);
	            if(ch==' ')
	           System.out.println(rev.substring(i, i));
	           count++;
	            
		}
		return count;
		
		
	 } 
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "My Name Is Puneet";
		System.out.println(stringReverse(s));
		System.out.println(stringRev(s));
	}
	
}
