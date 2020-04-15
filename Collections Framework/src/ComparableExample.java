import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {

	public static void main(String[] args) {
		List<IntegerTest> list = new ArrayList<>();
		list.add(new IntegerTest(1));
		list.add(new IntegerTest(2));
		list.add(new IntegerTest(5));
		list.add(new IntegerTest(6));

		System.out.println("Without Comparable List: " + list);

		Collections.sort(list);

		System.out.println("Sorted in Descending order: " + list);
	}
}

class IntegerTest implements Comparable<IntegerTest> {

	int value;

	public IntegerTest(int value) {
		this.value = value;
	}

	@Override
	public int compareTo(IntegerTest o) {
		if (value > o.value) {
			return -1;
		} else if (value < o.value) {
			return 1;
		} else {
			return 0;
		}
	}
}
