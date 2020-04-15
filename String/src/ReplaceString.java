
public class ReplaceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Good Morning";
		char ch[] = {'a', 'b', 'c'};
		System.out.println(s.replace("Morning", "Evening"));
		System.out.println(s.replaceAll("o", "u"));
		System.out.println(s.valueOf(ch));
	}
}
