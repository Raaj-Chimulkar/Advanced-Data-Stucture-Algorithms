/*
 * Write a program to perform the following operations using Java.
1. Read the count of elements from user to create the array.
2. Inttialize the array using user input.
3. Create the functions for the following and call them using a menu based program.
a. Display the array
b. Reverse the array
c. Replace the nth element from the array and print
d. Find the addition of all elements of the array
e. Find the maximum number from the array
f. Print the average of all the elements from the array.
g. Display the even and odd number from the array separately.
 */
package Arrays;

import java.util.Scanner;
public class arrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("******Lets get started!******");
		System.out.println("Enter the size of array to be created ::");
		int size = sc.nextInt();

		int array[] = new int[size];
		boolean exit = false;
		
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the element ::");
			array[i]=sc.nextInt();
		}
		
		
		while (!exit) {
			System.out.println("Choose the operation to be performed on array ::\n"
					+ "1.Display the array\n"
					+ "2.Reverse the array\n"
					+ "3.Replace the nth element from the array and print\n"
					+ "4.Find the addition of all elements of the array\n"
					+ "5.Find the maximum number from the array\n"
					+ "6.Print the average of all the elements from the array\n"
					+ "7.Display the even and odd number from the array separately\n"
					+ "0.Exit\n");
			switch (sc.nextInt()) {
			case 1:
				Display.display(array);
				break;

			case 2:
				Reverse.reverse(array);

				break;

			case 3:
				System.out.println("Enter the value to replace nth element");
				int element=sc.nextInt();
				System.out.println(array[size-1]);
				array[size-1]=element;
				System.out.println("Replaced with ::" +array[size-1]);

				break;

			case 4:
				System.out.println("Addition of all elements is :: "+ Addition.addition(array));

				break;

			case 5:
				System.out.println("Maximum element in array is :: "+ Max.max(array));

				break;

			case 6:
				System.out.println("Average of all elements is ::" +Average.average(array));
				break;

			case 7:
				System.out.println("All even elements are ::");
				Even.even(array);
				System.out.println("All odd elements are ::");
				Odd.odd(array);
				break;
			case 0:
				System.out.println("Operation terminated\n Thank you!");
				exit=true;
				
				default:
					System.out.println("Enter valid input!");
					break;
					

			}
		}

	}
}
