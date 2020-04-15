
public class SBuffinsertreplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s = new StringBuffer("Sachin");
		s.insert(2, " Tendulkar ");
		System.out.println(s);
		
		StringBuffer s2 = new StringBuffer("Tendulkar");
		s2.replace(1, 4, "Sachin");
		System.out.println(s2);

	}

}
