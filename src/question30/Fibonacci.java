package question30;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number to find fibonacci: ");
		int n=input.nextInt();
		int first=1;
		int second=1;
		System.out.println(first+ " ");
		for (int i = 1; i <=n; i++) {
			System.out.print(second+ " ");
			int temp=first+second;
			first=second;
			second=temp;
		}
	}

}
