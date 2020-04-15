import java.util.LinkedHashSet;

public class LinkedHashSetEx {
	
	//Duplicates not allowed. Elements accessed and stored in FIFO format of LinkedList

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("D");
		lhs.add("B");
		lhs.add("E");
		lhs.add("A");		
		lhs.add("B");		//duplicates are not stored
		lhs.add(null);
		System.out.println("Elements of LinkeHashSet are: " + lhs);
	}
}
