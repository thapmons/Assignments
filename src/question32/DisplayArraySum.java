package question32;

import java.util.Scanner;

public class DisplayArraySum {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the size of an Array: ");
		int size=input.nextInt();
		int[] array=new int[size];
		int sum=0;
		for (int i = 0; i < array.length; i++) {
			array[i]=input.nextInt();
		}
		System.out.println("The array of the user input: ");
		for (int j = 0; j < array.length; j++) {
			System.out.println(array[j]);
			sum=sum+array[j];
		}
		System.out.println("The sum of the array elements is: "+sum);
	}

}
