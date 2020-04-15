
public class Contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Good Morning India";
//		System.out.println(s.contains("Mo"));
//		System.out.println(s.contains("Mon"));
		
//		String s2 = new String("Good Morning India");
//		String s3 = "Good Hi";
//		System.out.println(s.contentEquals(s2));
//		System.out.println(s.contentEquals(s3));
		
		String[] str = s.split("o", 6);
		System.out.println(str.length);
		for(String str2: str){
			System.out.println(str2);
		}
	}

}
