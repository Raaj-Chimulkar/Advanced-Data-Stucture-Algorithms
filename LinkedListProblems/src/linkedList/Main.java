package linkedList;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		linkedList ll = new linkedList();

		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		System.out.println("*****Lets Get Started!!*****");

		while (!exit) {
			System.out.println("Choose the opertaion to be performed\n" + "1.Show the contents of linked list\n"
					+ "2.Insert the data in the linked list\n" + "3.Check how many elements are there in the linked list\n"
					+ "4.Check to see if linked list is empty\n"
					+ "0.Exit");
			switch (sc.nextInt()) {
			case 1:
				ll.print();
				break;

			case 2:
				System.out.println("Enter the element to be added ::");
				ll.addNode(sc.nextInt());
				break;

			case 3:
				System.out.println("Number of elements :: " +ll.count());
				break;

			case 4:
				if(ll.isEmpty()==true){
				System.out.println("LinkedList is empty!!");
				}
				else
					System.out.println("Linked list is not empty!!");
				break;

			}
		}
	}
}