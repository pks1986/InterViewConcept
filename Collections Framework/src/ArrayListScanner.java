import java.util.ArrayList;
import java.util.Scanner;


public class ArrayListScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		System.out.println("Input 5 Integer Type ArrayList Elements: ");
		for(int i = 0; i < 5; i ++){
			al.add(sc.nextInt());
		}
		
	//	System.out.println("Size is :" + al.size());
	//	System.out.println("Index of 5 is :" + al.indexOf(5));
	//	System.out.println("Last Index of 5 is :" + al.lastIndexOf(5));
		
	//	System.out.println("ArrayList Contains 4: " + al.contains(4));
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(4);
		al2.add(5);
	//	System.out.println("ArrayList Contains 4 and 5: " + al.containsAll(al2));
		
		System.out.println("AL: " + al);
		System.out.println("AL2: " + al2);
	//	al.removeAll(al2);
		al.retainAll(al2);
		
		System.out.println("AL: " + al);
		
		
	}

}
