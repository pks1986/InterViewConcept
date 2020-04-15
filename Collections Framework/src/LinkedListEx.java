import java.util.LinkedList;


public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		LinkedList<String> ll = new LinkedList<String>();
//		
//		//Adding Elements
//		ll.add("B");
//		ll.add("C");
//		ll.add("D");
//		ll.add("E");
//		
//		ll.addFirst("A");
//		ll.addLast("Z");
//		
//		System.out.println("Elements of Linked List:\n" + ll);	
//		
//		//Removing Elements
//		ll.remove("B");
//		ll.remove(1);
//		
//  		System.out.println("After Removing Elements of Linked List:\n" + ll);
//
//  		ll.removeFirst();
//		ll.removeLast();
//		System.out.println("Elements of Linked List:\n" + ll);
//		
//		//set() and get()
//		String val = ll.get(0);
//		System.out.println(val);
//		System.out.println("Elements of Linked List:\n" + ll);
//		ll.set(1, "Hello");
//		System.out.println("Elements of Linked List:\n" + ll);
//		
//		System.out.println(ll.element());		//Element at the head of the queue
		
		LinkedList<String> ll2 = new LinkedList<String>();
		ll2.add("F");
		ll2.add("B");
		ll2.add("K");
		
//		ll.offer("Hi");
//		System.out.println("Elements of Linked List:\n" + ll);
		System.out.println("Element at the Head of LL2: " + ll2.element());
		System.out.println("Element at the Head of LL2: " + ll2.peek());
		System.out.println("Elements of Linked List:\n" + ll2);
		
		System.out.println("Element at the head: " + ll2.poll());
		System.out.println("Elements of Linked List:\n" + ll2);
		
		ll2.remove();
		System.out.println("Element of LL2: " + ll2);

	}

}
