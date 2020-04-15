import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetEx {
	
	//Duplicates not allowed. Elements accessed and stored in sorted order

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("D");
		ts.add("B");
		ts.add("E");
		ts.add("A");
		ts.add("C");
		ts.add("B");		//duplicates are not stored
		ts.add(null);
		System.out.println("Elements of TreeSet:\n" + ts);
		
		SortedSet<String> ts2 = new TreeSet<String>();	//SortedSet is an interface
		ts2 = ts.subSet("B", "D");
		System.out.println(ts2);
		
		ts2 = ts.subSet("B", false, "E", true);
		System.out.println(ts2);
	}
}
