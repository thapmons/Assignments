package question1To4;

import java.util.Scanner;

public class SumAndAverage3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter First Number:");
		int a = input.nextInt();
		System.out.println("Enter Second Number:");
		int b = input.nextInt();
		int sum=a+b;
		int sub=a-b;
		double c= sum/2;
		int d=a*b;
		System.out.println("The Sum of the two number is: " + sum);
		System.out.println("The Sub of the two number is: " + sub);
		System.out.println("The average of the two numbers is: " + c);
		System.out.println("The product of two numbers is: "+d);
		
		
		
		

	}

}
