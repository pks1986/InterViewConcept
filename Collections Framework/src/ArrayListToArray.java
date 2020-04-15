import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(14);
		al.add(52);
		al.add(34);

		Collections.sort(al, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
				/*if (01 < o2) {
					return 1;
				} else if (o1 > o2) {
					return -1;
				} else {
					return 0;
				}*/
			}
		});
		System.out.println(al);
		// Integer[] arr2 = al.toArray(new Integer[0]);

		// or
		Integer[] arr2 = new Integer[0];
		arr2 = al.toArray(arr2);
		int sum = 0;

		for (int i : arr2)

		{
			sum += i;
			System.out.print(i + "\t");
		}
		System.out.println("\nSum = " + sum);

	}

}
