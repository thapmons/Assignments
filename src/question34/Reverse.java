package question34;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the size of an array: ");
		int size=input.nextInt();
		int[] array=new int[size];
		
		for (int i = 0; i < array.length; i++) {
			array[i] =input.nextInt();
	}
		System.out.println("Original Order: ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println();
		System.out.println("Reverse order");
		for (int i = (array.length-1); i>=0; i--) {
			System.out.println(array[i]+ " ");
			
		}
}
}
