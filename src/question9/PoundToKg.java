package question9;

import java.util.Scanner;

public class PoundToKg {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the pound value: ");
			double f=input.nextDouble();
		double c=f*0.454;
		System.out.println("KG:\n "+c);
	}

}
