package question22;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("Enter the number to print the correspondign table: ");
		int num=input.nextInt();
		System.out.println("The multiple table "+num+ " is: ");
//		int num=input.nextInt();
		for(int i=1; i<=10; i++) {
			int table=num*i;
			//System.out.println("The multiple table "+num+ " is: ");
			System.out.println(num+ " * "+ i+ "="+table);
		}
		
	}

}
