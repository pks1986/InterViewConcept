package com.concept.string;

public class AnagramString {

	public AnagramString() {
		
	}
	
	
	public static void main(String args[])
	{
		String s1 = "test";
		String s2 = "test";
		s1 = s1.replaceAll("\\s", "").toLowerCase();
		s2 = s2.replaceAll("\\s", "").toLowerCase();
		char[] ch1 = s1.toCharArray(); 
		char[] ch2 = s2.toCharArray(); 
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@"+ch1);
		int n1 = ch1.length;
		int n2 = ch2.length;
		if(n1!=n2)
		{
			System.out.println("@@@@@@@@@@@@@@@@ Ingram is npt possible" );
		}
		else
		{
			for(int i =0 ; i<s1.length() ; i++)
				{
					for(int j = 0 ; j<s2.length() ; j++)
						{
							if(s1.charAt(i) == s2.charAt(j))
								{
								s2 = s2.substring(0, j) + s2.substring(j + 1);
								break;
								}
						}
				
				}
			if (s2.length() == 0)
			{
				System.out.println("True");
			} else
			{
				System.out.println("False");
			}
		}
		
		
		
		
		
	}

}
