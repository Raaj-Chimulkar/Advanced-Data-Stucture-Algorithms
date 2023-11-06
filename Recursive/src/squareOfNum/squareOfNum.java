package squareOfNum;

import java.util.Scanner;

public class squareOfNum {

	public static int square(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		} else
			return square(n - 1) + 2 * n - 1;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("*****Lets find the square of a Number!!*****");
		System.out.println("Enter the number ::");
		int num = sc.nextInt();
		int sum = 0;

		System.out.println("Square of " + num + "::" + square(num));
	}
}
