package question15;

import java.util.Scanner;

public class ASCII {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter single to tripl digit: ");
		int x= input.nextInt();
		char y=(char) x;
		System.out.println("The corresponding character of "+x+ " is : "+y);
		
	}

}
