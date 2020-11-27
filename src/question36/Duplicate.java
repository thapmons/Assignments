package question36;

import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int size=input.nextInt();
		int[] array=new int[size];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter an array element: ");
			array[i] =input.nextInt();
		}
		System.out.println("The Duplicate element is: ");
		int count=0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if (array[i]==array[j]) {
					System.out.println(array[j]+" ");
					count++;
					
				}
				
			}
			
		}
		if(count==0) {
			System.out.println("No duplicate elements found: ");
		}
	}

}
