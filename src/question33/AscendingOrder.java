package question33;

import java.util.Scanner;

public class AscendingOrder {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.print("Enter the size of an Array: ");
		int size=input.nextInt();
		int[] array =new int[size];
		for (int i = 0; i < array.length; i++) {
			array[i]=input.nextInt();
			
		}
		int temp=0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if(array[i]<array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
					
					
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+",");
		}
	}

}
