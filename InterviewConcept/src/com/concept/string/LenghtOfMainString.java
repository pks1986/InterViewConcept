package com.concept.string;

public class LenghtOfMainString {

	public LenghtOfMainString() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	
		String mainString = "This is Hello World";
		System.out.println("Length of main string"+ mainString.length());
		
		int length = 0;
		char[] strCharArray = mainString.toCharArray();
		for(char c : strCharArray)
		{
			length++;
		}
		
		System.out.println("Length of main string"+ length);

	}

}
