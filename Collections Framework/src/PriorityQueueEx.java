import java.util.PriorityQueue;

public class PriorityQueueEx {

	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<>();
		System.out.println("Trying with empty queue");
		System.out.println("peek(): " + queue.peek());
		//System.out.println("element(): " + queue.element());
		System.out.println("poll() cannot remove null: " + queue.poll());

		queue.add("Hello");
		queue.offer("Hi");	
		System.out.println("\nTrying with data");
		System.out.println("peek(): " + queue.peek());
		System.out.println("poll() will remove item: " + queue.poll());
		System.out.println("element(): " + queue.element());
		
	}

}
