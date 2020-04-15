package datastructure.linkedlist.singly;

import java.util.Scanner;

public class ReversePrintRecursion {

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
		System.out.println("\nReverse Print Elements: ");
		reversePrint(headNode);
		
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
	
	private static void reversePrint(Node node) {
		if(node == null) {
			return;
		}
		
		reversePrint(node.next);
		System.out.print(node.data + "	");
	}
}
