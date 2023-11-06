package doublyLinkedList;

import doublyLinkedList.doublyLinkedList.Node;

public class doublyLinkedList {
	private Node head;
	private Node tail;

	public doublyLinkedList() {
		this.head = null;
		this.tail = null;
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

	public void addNode(int data) { 								// adding a New node
		Node newNode = new Node(data);	
		if (isEmpty()) { 											// Checking if linkedlist is empty
			head = newNode;
		} else {
			Node currentNode = head; 								// adding node to existing linkedlist
			while (currentNode.next != null) {
				currentNode = currentNode.next;
			}
			newNode.prev = currentNode;
			currentNode.next = newNode;
			System.out.println("Added new node!");
		}
	}

	public void print() {											 // printing linkedlist elements
		if (head == null) {
			System.out.println("LinkedList is empty!!");
			return;
		}
		
		Node currentNode = head;
		while (currentNode != null) {
			System.out.print(currentNode.data+"->");
			currentNode = currentNode.next;
		}
		System.out.println();
	}

	public int count() {
		int counter = 0;
		if (head == null) {
			return 0;
		} else {
			Node currentNode = head;
			while (currentNode != null) {
				++counter;
				currentNode = currentNode.next;
			}
		}
		return counter;
	}
}