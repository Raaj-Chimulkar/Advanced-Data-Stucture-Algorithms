/*
 * Write a program to perform the following operations using Java.
1. Read the count of elements from user to create the circular queue using array.
2. Create the class and methods for the following and call them using a menu based program and
call them using a loop.
a. Show the contents of circular queue
b. Enqueue the data in the circular queue
c. Access the data from the circular queue
d. Check how many elements are there in the circular queue.
e. Check to see if the circular queue is full?
f. Check to see if circular queue is empty.
 */

package cirularQueue;

import java.util.Scanner;

public class CirularQueue {
	private int front;
	private int rear;
	private int[] queue;
	private int size;

	public CirularQueue(int size) {
		this.queue = new int[size];
		this.front = -1;
		this.rear = -1;
		this.size = size;
	}

	public boolean isEmpty() {
		return (front == rear);
	}

	public boolean isFull() {
		return ((rear + 1) % size) == front;
	}

	public void show() {
		if (front == rear) {
			System.out.println("Queue is empty");
		} else {
			for (int i = front; i <=rear; i++) {
				System.out.println(queue[i]);
			}
		}
	}

	public void add(int data) {
		if ((rear + 1) % size == front) {
			System.out.println("Queue is full!");
		} else {

			rear = (rear + 1) % size;
			queue[rear] = data;

			if (front == -1) {
				front = rear;
			}
		}
	}

	public int delete() {
		if (rear == front) {
			System.out.println("Queue is empty!");
			return -1;
		}
		int element = queue[front];
		--front;
		return element;
	}

	public int check(int index) {
		if (index > rear) {
			System.out.println("Invalid index number!!");
			return -1;
		}
		return queue[index];

	}

	public int count() {
		return rear + 1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("******Lets get started******");
		System.out.println("Enter the size of Cicularqueue");
		int size = sc.nextInt();
		boolean exit = false;

		CirularQueue c1 = new CirularQueue(size);

		while (!exit) {
			System.out.println("Choose the operation to be performed!");
			System.out.println("1.Show the contents of circular queue\n" + "2.Enqueue the data in the circular queue\n"
					+ "3.Access the data from the circular queue\n"
					+ "4.Check how many elements are there in the circular queue\n"
					+ "5.Check to see if the circular queue is full?\n" + "6.Check to see if circular queue is empty.\n"
					+ "0.Exit");
			switch (sc.nextInt()) {
			case 1:
				c1.show();
				break;
			case 2:
				c1.isFull();
				System.out.println("Enter data to be added ::");
				int data = sc.nextInt();
				c1.add(data);
				break;
			case 3:
				System.out.println("Enter the index to check for element ::");
				int ind = sc.nextInt() - 1;
				System.out.println(c1.check(ind));
				break;
			case 4:
				System.out.println("Total number of elements :: " + c1.count());

				break;
			case 5:
				if (c1.isFull() == true) {
					System.out.println("Queue is full!!");
				}
				System.out.println("Queue is not full!!");

				break;
			case 6:
				if (c1.isEmpty() == true) {
					System.out.println("Queue is Empty!!");
				}
				System.out.println("Queue is not Empty!!");

				break;
			case 0:
				exit = true;
				break;
			default:
				System.out.println("Enter valid input!!");
				break;
			}

		}
	}
}
