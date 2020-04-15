
public class SBuffDeleteReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s = new StringBuffer("Sachin");
		s.reverse();
		System.out.println(s);
		s.delete(1, 4);
		System.out.println(s);
	}
}
