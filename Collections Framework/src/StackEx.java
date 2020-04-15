import java.util.Iterator;
import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.add(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);

		System.out.println("Stack elements: " + stack);

		System.out.println("Popping stack : " + stack.pop());
		System.out.println("After pop(), Stack elements: " + stack);

		System.out.println("Peeking stack : " + stack.peek());
		System.out.println("After peek(), Stack elements: " + stack);

		System.out.println("\nIterating elements");
		Iterator<Integer> itr = stack.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + "\t");
		}

	}

}
