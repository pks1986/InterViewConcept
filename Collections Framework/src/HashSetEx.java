import java.util.HashSet;


public class HashSetEx {
	
	//duplicates are not allowed, elements are stored and accessed in random order

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		hs.add("D");
		hs.add("B");
		hs.add("E");
		hs.add("A");		
		hs.add("B");		//duplicates are not stored
		hs.add(null);
		System.out.println("Elements of HashSet are: " + hs);
	}
}
