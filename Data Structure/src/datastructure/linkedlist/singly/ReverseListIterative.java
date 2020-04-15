package datastructure.linkedlist.singly;

import java.util.Scanner;

public class ReverseListIterative {

	static Node headNode;
	static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		System.out.println("Enter the number of elements to insert into the list\n");
		int numOfElements = sc.nextInt();

		for (int i = 0; i < numOfElements; i++) {
			System.out.println("Enter Data: ");
			int data = sc.nextInt();
			insertElementAtLastPosition(data);
		}
		traverseList();
		//reverseListMySolution();
		reverseListGeeksForGeeksSolution();
		System.out.println("\nAfter Reversing List: ");
		traverseList();

	}
	// End of main()

	private static void insertElementAtFirstPosition(int data) {
		Node newNode = new Node(data);
		newNode.next = headNode; // null //By Default it will be null but only
									// in java
		headNode = newNode;
	}

	private static void insertElementAtLastPosition(int data) {
		if (headNode == null) {
			insertElementAtFirstPosition(data);
			return;
		}

		Node lastNode = headNode;
		while (lastNode.next != null) {
			lastNode = lastNode.next;
		}
		Node newNode = new Node(data);
		lastNode.next = newNode;
	}

	static void insertElementAfterANode(Node node) {
		System.out.println("\nEnter data: ");
		int data = sc.nextInt();
		sc.close();

		if (node != null) {
			Node newNode = new Node(data);
			newNode.next = node.next;
			node.next = newNode;
		}
	}

	static void traverseList() {
		System.out.println("\nTraversing List:");
		if (headNode == null) {
			System.out.println("No Data");
		} else {
			Node ptr = headNode;
			while (ptr != null) {
				System.out.print(ptr.data + "\t");
				ptr = ptr.next;
			}
		}
	}

	private static void reverseListMySolution() {
		if (headNode == null || headNode.next == null) {
			System.out.println("\nData same as reversed");
		} else {
			Node newHead = null;
			while (headNode != null) {
				Node ptr = headNode;
				
				Node prev = ptr;
				while (ptr.next != null) {
					prev = ptr;
					ptr = ptr.next;
				}
				
				Node newPtr = newHead;
				if(newPtr == null) {		//For first Time
					newHead = ptr;
				} else {
					while(newPtr.next != null) {
						newPtr = newPtr.next;
					}
					newPtr.next = ptr;
				}
				
				if(prev.next == null) {		//It was last element
					headNode = null;
				} else {
					prev.next = null;
				}
			}
			headNode = newHead;
		}
	}
	
	private static void reverseListGeeksForGeeksSolution(){
		
		Node prev = null;
        Node current = headNode;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        headNode = prev;
        //return headNode;
	}

}
