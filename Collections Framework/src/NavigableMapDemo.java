import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Spliterator;
import java.util.TreeMap;

public class NavigableMapDemo {

	public static void main(String[] args) {
		NavigableMap<Integer, String> map = new TreeMap<>();
		map.put(1, "A");
		map.put(4, "B");
		map.put(2, "C");
		map.put(3, "F");

		System.out.println("Map: " + map);
		
		NavigableSet<Integer> navigableSet = map.descendingKeySet();
		NavigableMap<Integer, String> descendingMap = map.descendingMap();
		System.out.println("descendingKeySet(): " + navigableSet);
		System.out.println("descendingMap(): " + descendingMap);
		
	}

}
