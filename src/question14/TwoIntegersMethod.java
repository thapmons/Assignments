package question14;

import java.util.Scanner;

public class TwoIntegersMethod {
	public static void relateTwoIntegers() {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the 1st No: ");
		int x=input.nextInt();
		System.out.println("Enter the 2nd No; ");
		int y=input.nextInt();
		if (x==y) {
			System.out.println("The two number are equal: ");
			}
		if(x>y) {
			System.out.println("1st is greater than ");
			
		}
		if(y>x) {
			System.out.println("2nd is greater than 1st: ");
			}
		
		
		
		
	}
//Method
	public static void main(String[] args) {
		relateTwoIntegers();
		
	}

}
