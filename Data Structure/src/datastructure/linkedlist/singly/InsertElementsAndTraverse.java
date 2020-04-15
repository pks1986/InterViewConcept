package datastructure.linkedlist.singly;

import java.util.Scanner;

public class InsertElementsAndTraverse {

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
		
		insertElementAfterANode(headNode);
		sc.close();
		traverseList();
	}
	//End of main()
	
	private static void insertElementAtFirstPosition(int data) {
		Node newNode = new Node(data);
		newNode.next = headNode;	//null		//By Default it will be null but only in java
		headNode = newNode;			
	}
	
	private static void insertElementAtLastPosition(int data) {
		if(headNode == null) {
			insertElementAtFirstPosition(data);
			return;
		}
		
		Node lastNode = headNode;
		while(lastNode.next != null) {
			lastNode = lastNode.next;
		}
		Node newNode = new Node(data);
		lastNode.next = newNode;
	}
	
	static void insertElementAfterANode(Node node) {
		System.out.println("\nEnter data: ");
		int data = sc.nextInt();
		sc.close();
		
		if(node != null) {
			Node newNode = new Node(data);
			newNode.next = node.next;
			node.next = newNode;
		}
	}
	
	static void traverseList() {
		System.out.println("Traversing List: \n");
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
