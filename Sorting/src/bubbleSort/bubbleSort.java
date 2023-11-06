package bubbleSort;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class bubbleSort {

	public static void main(String[] args) {
		System.out.println("Lets sort array-Bubble sort!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array ::");
		int arr[] = new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the element ::");
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[i+1]) {
					int temp=arr[i+1];
					arr[i+1]=arr[i];
					arr[i]=temp;
				}
			}
		}
		for(int e:arr) {
			System.out.println(e);
		}
	}
}
