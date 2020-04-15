package datastructure.linkedlist.singly;

import java.util.Scanner;

public class DeletingFromLinkedList {

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
		deleteElementAtFirstPosition();

		deleteElementFromLastPosition();

		deleteElementAtNthPosition();

		sc.close();
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

	private static void deleteElementAtFirstPosition() {

		System.out.println("\n\nDeleting item at first position");
		if (headNode != null) {
			Node ptr = headNode;
			int data = ptr.data;
			headNode = ptr.next;
			// Delete Node
			ptr.data = 0;
			ptr.next = null;
			System.out.println("Item Deleted: " + data);
			traverseList();
		} else {
			System.out.println("No data to delete in list");
		}
	}

	static void deleteElementFromLastPosition() {
		System.out.println("\n\nDeleting Item at Last Position");
		Node ptr = headNode;
		Node prev = headNode;
		if (ptr == null) {
			System.out.println("No Elements in list");
		} else {
			if (headNode.next == null) { // Only 1 node is left
				System.out.println("ItemDeleted: " + ptr.data);
				headNode = null;
			} else {
				while (ptr.next != null) {
					prev = ptr;
					ptr = ptr.next;
				}
				System.out.println("Item Deleted: " + ptr.data);
				prev.next = null;
			}
			traverseList();
		}
	}

	static void deleteElementAtNthPosition() {
		System.out.println("\nDeleting Item at Nth Position");
	
		if (headNode == null) {
			System.out.println("List is empty");
			return;
		}

		System.out.print("\nEnter the position to delete: ");
		int pos = sc.nextInt();
		
		if (pos == 0) {
			deleteElementAtFirstPosition();
			return;
		} else {
			Node ptr = headNode;
			for (int i = 0; ptr != null && i < pos - 1; i++) {
				ptr = ptr.next;
			}
			if (ptr == null || ptr.next == null) {
				System.out.println("Element Not found at position: " + pos);
				return;
			}
			Node toDelete = ptr.next;
			System.out.println("Item Deleted: " + toDelete.data);
			ptr.next = toDelete.next; // or ptr.next = ptr.next.next
			traverseList();
		}
	}

	static void traverseList() {
		System.out.println("Traversing List:");
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
}
