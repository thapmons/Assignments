package question27;

import java.util.Scanner;

public class AddProduct {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int no=input.nextInt();
		int sum=0;
		int mult=1;
		while(no!=0) {
		 sum=sum+no%10;
		 mult=mult*no%10;
		 no=no/10;
//		 System.out.println(sum);
			
		}
		System.out.println(sum);
		System.out.println(mult);
		 
	}

}
