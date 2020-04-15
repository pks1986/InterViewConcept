package practice.com.linkedlist;

public class SinglyLinkedList {

	public SinglyLinkedList() {
		// TODO Auto-generated constructor stub
	}
	
	public Node head = null;  
	public Node tail = null; 
	
	class Node
	{
		int data;
		Node next;
		 
		
		public Node(int data)
		{
			this.data = data;
			this.next = next;
		}
	}	
		public void addNode(int data) 
		{  
			
			Node newNode = new Node(data);
			if(head==null)
			{
				head = newNode;
				tail = newNode;
			}
			else
			{
				tail.next = newNode;
				tail = newNode;
			}
		}
		public void display()
		{
			Node current =  head;
			if(head==null)
			{
				System.out.println("Linked List Is Empty");
			}
			while(current != null) 
			{
				System.out.println(""+ current.data);
				current = current.next;
			}
			System.out.println();
		}
		
		public static void main(String[] args) {
			SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
			singlyLinkedList.addNode(1);
			singlyLinkedList.addNode(2);
			singlyLinkedList.addNode(3);
			singlyLinkedList.addNode(4);
			singlyLinkedList.addNode(5);
			singlyLinkedList.display();
			
			
		}
		
	}
	

