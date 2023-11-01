package doublyCircularLinkedList;

import circularLinkedList.circularLinkedList.Node;

public class doublyCircularLinkedList {
	private Node head;
	private Node tail;

	public doublyCircularLinkedList() {
		this.head = null;
		
	}

	public boolean isEmpty() {
		return head == null;
	}

	public static class Node {
		int data;
		Node next;
		Node prev;

		public Node(int data) {
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}

	public void addNode(int data) {					//adding a New node
		Node newNode = new Node(data);
		if (isEmpty()) {							//Checking if linkedlist is empty  
			head = newNode;
			newNode.prev=head;
			newNode.next=head;
			
			
		} else {
			Node currentNode = head;				//adding node to existing linkedlist
			while (currentNode.next != head) {
				currentNode = currentNode.next;
			}
			newNode.prev = currentNode;
			currentNode.next = newNode;
			newNode.next=head;
			System.out.println("Added new node!");
		}
	}

	public void print() { 						// printing linkedlist elements
		Node currentNode = head;
		System.out.println(currentNode.data);
		currentNode=currentNode.next;
		while (currentNode != head) {
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}
		System.out.println();
	}
}

