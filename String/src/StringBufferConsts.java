
public class StringBufferConsts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s1 = new StringBuffer();
		System.out.println(s1.capacity());
		
		s1 = new StringBuffer(10);
		System.out.println(s1.capacity());
		
		s1 = new StringBuffer("Sachin");
		System.out.println(s1);

	}

}
