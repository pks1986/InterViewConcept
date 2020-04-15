import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ComparatorEx {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(5, "D");
		map.put(10, "C");

		System.out.println("Without Comparator List: " + map);

		
		System.out.println("Sorted in Based on value: " + getSortedMapByValue(map));
	}
	
	public static Map<Integer, String> getSortedMapByValue(Map<Integer, String> map) {
		List<Map.Entry<Integer, String>> list = new ArrayList<Entry<Integer, String>>(map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {
			@Override
			public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {		

				int compareResult = o1.getValue().compareTo(o2.getValue());
				System.out.println("O1 Value: " + o1.getValue() + ", O2 Value: " + o2.getValue()
				+ ", Result: " + compareResult);
				
				return compareResult;
				
			}
		});
		
		Map<Integer, String> sortedMap = new LinkedHashMap<>();
		
		list.forEach(entry -> {
			sortedMap.put(entry.getKey(), entry.getValue());
		});
		return sortedMap;
	}
	
}
