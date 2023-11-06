/*
 * Write a program to perform the following operations using Java.
1. Read the count of elements from user to create the doubly linked list.
2. Create the class and methods for the following and call them using a menu based program and
call them using a loop.
a. Show the contents of doubly linked list
b. Insert the data in the doubly linked list
c. Check how many elements are there in the doubly linked list.
d. Check to see if doubly linked list is empty.
 */

package doublyLinkedList;

import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		doublyLinkedList dll=new doublyLinkedList();
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
				dll.print();
				break;

			case 2:
				System.out.println("Enter the element to be added ::");
				dll.addNode(sc.nextInt());
				break;

			case 3:
				System.out.println("Number of elements :: " +dll.count());
				break;

			case 4:
				if(dll.isEmpty()==true){
				System.out.println("LinkedList is empty!!");
				}
				else
					System.out.println("Linked list is not empty!!");
				break;

			}
		}
	
}
}