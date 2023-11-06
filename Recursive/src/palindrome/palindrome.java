package palindrome;

import java.util.Scanner;

public class palindrome {

	public static int palindrome(int n, int t) {

		if (n == 0) {
			return t;
		}
		t = (t * 10) + (n % 10);
		return palindrome(n / 10, t);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("*****Lets find the square of a Number!!*****");
		System.out.println("Enter the number ::");
		int num = sc.nextInt();
		int temp = palindrome(num, 0);
		if (temp == num) {
			System.out.println(num + " is palindrome!!");
		} else
			System.out.println(num + " is not palindrome!!");
	}
}
