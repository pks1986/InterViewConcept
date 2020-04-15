
public class SplitEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("This string contains 7 string of stringr arrays");
		String str2[] = str.split(" ");
		System.out.println(str2.length + "\n" );
		int count = 0;
		for(String str3: str2){
			if(str3.equals("string"))
				count++;
			System.out.print(str3 + " ");			
		}
		System.out.println("\nString keyword is repeated " + count +" times");
	}
}
