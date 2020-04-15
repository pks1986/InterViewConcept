import java.util.TreeMap;
import java.util.Map;
import java.util.Set;


public class TreeMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, Double> hm = new TreeMap<String, Double>();
		
		//Put the elements of the TreeMap
		hm.put("John Doe", new Double(12000));
		hm.put("Jane Smith", new Double(223344));
		hm.put("Tod Hall", 334455d);
		hm.put("Alice", 12000d);
		
		System.out.println("Elements of Map:\n" + hm);
		
//		Set set = hm.entrySet();
//		System.out.println(set);
		System.out.println();
		Set<Map.Entry<String, Double>> set = hm.entrySet();
		for(Map.Entry<String, Double> me: set){
			System.out.print(me.getKey()+ ": ");
			System.out.println(me.getValue());
		}
		// Deposit 1000 into John Doe's account.
		double balance = hm.get("John Doe");
		hm.put("John Doe", balance + 1000);
		System.out.println();
		System.out.println("John Doe's new balance: " +
		hm.get("John Doe"));

	}

}
