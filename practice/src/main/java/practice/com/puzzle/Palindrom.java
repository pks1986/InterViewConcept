package practice.com.puzzle;

public class Palindrom {

	public Palindrom() {
		// TODO Auto-generated constructor stub
	}
	
	private static int countPS(String str) {
		String temp ="";
		StringBuffer stf;
		int count=0;
		
		for(int i=0 ; i<str.length() ; i++)
		{
			for(int j = i+1 ; j<=str.length();j++)
			{
				temp = str.substring(i,j);
				System.out.println(temp);
				if(temp.length()>=2)
				{
					stf = new StringBuffer(temp);
					stf.reverse();
					if(stf.toString().compareTo(temp)==0)
					{
						count++;
					}
				}
			}
			//return count;
		}
		return count;
		
	
		
	}
	
	public static void main(String[] args) {
		String str = "abbaccd"; 
        System.out.println(countPS(str));
	}

	

}
