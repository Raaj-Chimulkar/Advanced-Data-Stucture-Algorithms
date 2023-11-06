/*
 * Write a program to perform the following operations using Java.
1. Read the count of elements from user to create the simple linked list.
2. Create the class and methods for the following and call them using a menu based program and
call them using a loop.
a. Show the contents of linked list
b. Insert the data in the linked list
c. Check how many elements are there in the linked list.
d. Check to see if linked list is empty.
 */

package linkedList;

public class linkedList {

	private Node head;

	public static class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	// adding a node
	public void addNode(int data) {
		Node newNode = new Node(data);

		if (head == null) { // Checking if linkedlist is empty

			head = newNode;

		} else {
			Node currentNode = head; // adding node to existing linkedlist
			while (currentNode.next != null) {
				currentNode = currentNode.next;
			}
			currentNode.next = newNode;
			System.out.println("Added new node!");
		}
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
	
	
	
	public boolean isEmpty() {
		return (head==null);
	}
	
	
	public void print() { 											// printing linkedlist elements
		if (head == null) {
			System.out.println("LinkedList is empty!!");
			return;
		}

		else {
			Node currentNode = head;
			while (currentNode != null) {
				System.out.print(currentNode.data+"->");
				currentNode = currentNode.next;
			}
			System.out.println();
		}
	}
}
