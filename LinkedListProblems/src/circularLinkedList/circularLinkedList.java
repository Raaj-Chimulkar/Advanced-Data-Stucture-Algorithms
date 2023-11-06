package circularLinkedList;

import circularLinkedList.circularLinkedList.Node;

public class circularLinkedList {
	private Node head;

	public static class Node {
		private int data;
		private Node next;
	
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

													//adding a node 
	public void addNode(int data) {
		Node newNode = new Node(data);

		if (head == null) {							//Checking if linkedlist is empty   
													
			head = newNode;
			newNode.next=head;						//self pointing node
			
		} 
		else {
			Node currentNode=head;					//adding node to existing linkedlist
			while (currentNode.next != head) {
				currentNode = currentNode.next;
			}
			currentNode.next = newNode;
			newNode.next=head;
			System.out.println("Added new node!");
		}
	}
	
	public void print() {							//printing linkedlist elements
		if(head==null)
		{
			System.out.println("LinkedList is empty!!");
			return;
		}
		
		Node currentNode = head;
		System.out.println(currentNode.data);
		currentNode=currentNode.next;
		while (currentNode!= head) {
			System.out.println(currentNode.data);
			currentNode=currentNode.next;
		}
		System.out.println();
	}

	public boolean isEmpty() {
		
		return (head==null);
	}
	
	
	public int count() {
		int counter = 1;
		if (head == null) {
			return 0;
		} else {
			Node currentNode = head;
			while (currentNode.next != head) {
				++counter;
				currentNode = currentNode.next;
			}
		}
		return counter;
	}

}
