import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating an ArrayList
		ArrayList<String> al = new ArrayList<String>();
		System.out.println("Size of List before Entering values: " + al.size());
		System.out.println(al.isEmpty());

		// Adding Elements to the List
		al.add("A");
		al.add("A");
		al.add("K");
		al.add("E");
		al.add("S");
		al.add("12");
		al.add(null);
		al.add(3, "Yadav");
		al.set(2, "J");

		// Incompatible Values
		// al.add(32);
		// al.add('Y');
		System.out.println("Size of List after Entering Values: " + al.size());
		System.out.println("Elements of Arraylist after Entering Values:\n" + al);
		System.out.println(al.isEmpty());

		// Deleting elements of the ArrayList
		al.remove("K");
		al.remove("A");
		al.remove(3);

		System.out.println("Size of List after Deleting Values: " + al.size());
		System.out.println("Elements of Arraylist after Deleting Values:\n" + al);

		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Y");
		al2.add("A");
		al2.add("D");
		al2.add("A");
		al2.add("V");

		// Adding elements of an ArrayList
		// al.addAll(al2); //adding at last of the list
		al.addAll(3, al2); // adding elements at a specific index
		al.add(5, "Hello");
		System.out.println("Size of List after Deleting Values: " + al.size());
		System.out.println("Elements of Arraylist after Deleting Values:\n" + al);

		al.clear();
		System.out.println("Size of List after Deleting Values: " + al.size());
		System.out.println("Elements of Arraylist after Deleting Values:\n" + al.get(5)); // ArrayIndexOutOfBoundsException
	}

}
