
public class SBuffCapacity {

	//If it is greater than the current capacity, 
	//it increases the capacity by (oldcapacity*2)+2
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s = new StringBuffer();
		System.out.println(s.capacity());
		
		StringBuffer s2 = new StringBuffer("Tendulkar");
		System.out.println(s2.capacity());
		
		s2.ensureCapacity(5);
		System.out.println(s2.capacity());
		
//		s.append("Sachin");
//		System.out.println(s.capacity());
//		
//		s.append("Increasing the capacity of StringBuffer");
//		System.out.println(s.capacity());

	}

}
