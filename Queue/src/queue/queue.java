/*
 * Write a program to perform the following operations using Java.
1. Read the count of elements from user to create the simple queue using array.
2. Create the class and methods for the following and call them using a menu based program and
call them using a loop.
a. Show the queue
b. Store the data in the queue
c. Access the data from the queue
d. Check how many elements are there in the queue.
e. Check to see if the queue is full?
f. Check to see if queue is empty.
 */

package queue;

import java.util.Scanner;

public class queue {
	private int front;
	private int rear;
	private int[] queue;
	private int size;

	public queue(int size) {
		this.queue = new int[size];
		this.front = -1;
		this.rear = -1;
		this.size = size;
	}

	public void show() {
		if (rear == -1) {
			System.out.println("Queue is empty");
		} else {
			for (int i = 0; i <=rear; i++) {
				System.out.println(queue[i]);
			}
		}
	}

	public void add(int data) {
		if (rear == size - 1) {
			System.out.println("Queue is full!");
		} else {
			rear = rear + 1;
			queue[rear] = data;
		}
	}

	public int delete(int data) {
		if (rear == -1) {
			System.out.println("Queue is empty!");
		}
		int element = queue[rear];
		--rear;
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

	public boolean isFull() {
		return (rear == size - 1);
	}

	public boolean isEmpty() {
		return (rear == front);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("******Lets get started******");
		System.out.println("Enter the size of queue");
		int size = sc.nextInt();
		boolean exit = false;

		queue q = new queue(size);

		while (!exit) {
			System.out.println("Choose the operation to be performed!");
			System.out.println("1.Show the queue\n" + "2.Store the data in the queue\n"
					+ "3.Access the data from the queue\n" + "4.Check how many elements are there in the queue\n"
					+ "5.Check to see if the queue is full?\n" + "6.Check to see if queue is empty.\n" + "0.Exit");
			switch (sc.nextInt()) {
			case 1:
				q.show();
				break;
			case 2:
				System.out.println("Enter data to be added ::");
				int data = sc.nextInt();
				q.add(data);
				break;
			case 3:
				System.out.println("Enter the index to check for element ::");
				int index = sc.nextInt()-1;
				System.out.println(q.check(index));
				break;
			case 4:
				System.out.println("Total number of elemets :: " + q.count());

				break;
			case 5:
				if (q.isFull() == true) {
					System.out.println("Queue is full!!");
				}
				System.out.println("Queue is not full!!");

				break;
			case 6:
				if (q.isEmpty() == true) {
					System.out.println("Queue is Empty!!");
				}
				System.out.println("Queue is not Empty!!");

				break;
			case 0:
				exit=true;
				break;
			default:
				System.out.println("Enter valid input!!");
				break;
			}

		}
	}
}
