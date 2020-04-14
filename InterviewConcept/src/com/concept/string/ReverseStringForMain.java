package com.concept.string;

public class ReverseStringForMain {

	public ReverseStringForMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		
		String mainString = "java2blog";
		/////////////By Using For Loop///////////////////////////////////
		
		String reverseString = "";
		for(int i = mainString.length()-1;i>=0;i--)
		{
			reverseString = reverseString + mainString.charAt(i);
		}
			System.out.println("Reverse String are: "+reverseString);
			
	   ///////////////////By Using StringBuffer/////////////////////////
	   
	   StringBuffer dataString = new StringBuffer(mainString);
	   dataString = dataString.reverse();
	   System.out.println("Reverse String are:"+dataString);
	   
	   //////////////////By Using Recursion////////////////////////////
	   
	   ReverseStringForMain reverse = new ReverseStringForMain();
	   reverseString = reverserecursiveReverse(mainString);
	   System.out.println("Reverse String are:"+reverseString);
	}

	private static String reverserecursiveReverse(String mainString) {
		if(mainString.length()==1)
			   return mainString;
		else
			   return mainString.charAt(mainString.length()-1)+reverserecursiveReverse(mainString.substring(0,mainString.length()-1));
	}

}
