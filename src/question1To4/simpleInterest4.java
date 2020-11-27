package question1To4;

import java.util.Scanner;

public class simpleInterest4 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Principal value:");
		int n1=input.nextInt();
		System.out.println("Enter the Time ");
		int n2=input.nextInt();
		System.out.println("Enter the Rate: ");
		int n3=input.nextInt();
		int n4=n1*n2*n3;
		double n5=(double)n4/100;
		System.out.println("Simple interest is: "+n5);
		
		
		

	}

}
