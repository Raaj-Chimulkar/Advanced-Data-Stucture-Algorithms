/*
 * Write a program to perform the following operations using Java.
1. Read the count of elements from user to create the stack using array.
2. Create the class and functions for the following and call them using a menu based program.
a. Display the stack
b. Push the data on the stack
c. Pop the data from the stack
d. Check how many elements are there on the stack.
e. Check to see if the stack is full?
f. Check to see if stack is empty.
 */
package Stack;

import java.util.Scanner;

import Arrays.Display;

public class stackUsingArrays {
	
	private static final int MAX_SIZE=100;
	private static int[] stack ;//
	private static int top;
	
	
	public stackUsingArrays()
	{
		this.stack= new int[MAX_SIZE];
		this.top=-1;
	}
	
	public static  void displayStack() {
		if(top==-1)
		{
			System.out.println("Stack is empty!!");
			return;
		}
		for (int i=0;i<=top;i++) {
			System.out.println(stack[i]);
		}
	}
	
	public void push(int element) {
		if(top==MAX_SIZE-1)
		{
			System.out.println("Stack is full!!");
			return;
		}
		stack[++top]=element;
	}
	
	public  void pop() {
		if(top==-1)
		{
			System.out.println("stack is empty!!");
		}
		int e=stack[top];
		--top;
		 
		System.out.println("Popped element :: "+e );
		
	}
	
	public boolean isFull()
	{
		return(top==MAX_SIZE-1);
	}
	public boolean isEmpty()
	{
		return(top==-1);
	}
	public int count()
	{
		return top+1;
	}
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		stackUsingArrays stack=new stackUsingArrays();
		System.out.println("*****Lets Get Started!!*****");


		while (!exit) {
			System.out.println("Choose the opertaion to be performed\n" + "1.Display the stack\n"
					+ "2.Push the data on the stack\n" + "3.Pop the data from the stack\n"
					+ "4.Check how many elements are there on the stack\n" + "5.Check to see if the stack is full?\n"
					+ "6.Check to see if stack is empty\n" + "0.Exit");
			switch (sc.nextInt()) {
			case 1:
				stack.displayStack();
				break;

			case 2:
				System.out.println("Enter the element to be added ::");
				stack.push(sc.nextInt());
				break;

			case 3:
				stack.pop();
				break;

			case 4:
				System.out.println("Number of elements in stack :: "+ stack.count());

				break;

			case 5:
				if(stack.isFull()==true)
					System.out.println("Stack is full!!");
				else
					System.out.println("Stack is  not full!!");
				break;

			case 6:
				if(stack.isEmpty()==true)
				{
					System.out.println("Stack is empty!!");
				}
				else 
					System.out.println("Stack is not empty!!");

				break;

			case 0:

				break;

			default:

				break;
			}
		}

	}
}
