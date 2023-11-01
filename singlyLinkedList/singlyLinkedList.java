package singlyLinkedList;

public class singlyLinkedList {
	private Node head;

	public static class Node {
		private int data;
		private Node next;
		//private Node currentNode;

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
			
		} 
		else {
			Node currentNode=head;					//adding node to existing linkedlist
			while (currentNode.next != null) {
				currentNode = currentNode.next;
			}
			currentNode.next = newNode;
			System.out.println("Added new node!");
		}
	}
	
	public void print() {							//printing linkedlist elements
		Node currentNode = head;
		while (currentNode!= null) {
			System.out.println(currentNode.data);
			currentNode=currentNode.next;
		}
		System.out.println();
	}

}