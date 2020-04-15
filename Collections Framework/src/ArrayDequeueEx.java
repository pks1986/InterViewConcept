import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> adq = new ArrayDeque<String>();
		adq.add("A");
		adq.add("B");
		adq.add("D");
		adq.add("F");
		
		System.out.println("ArrayDeque Elements: " + adq);
		
		adq.push("R");
		System.out.println("First Element: " + adq.getFirst());
		System.out.println(adq.pop());
		System.out.println("ArrayDeque Elements: " + adq);
		adq.peek();
		System.out.println("ArrayDeque Elements: " + adq);

	}

}
