package question35;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.print("Enter the size of an array: ");
		int size=input.nextInt();
		int[] array=new int[size];
		for (int i = 0; i < array.length; i++) {
			array[i]=input.nextInt();
		}
		int temp=0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i+1; j < array.length; j++) {
				if (array[i]>array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
					
				}
				
			}
		}
		System.out.println("The second largest array element is: "+array[size-2]);
	}

}
