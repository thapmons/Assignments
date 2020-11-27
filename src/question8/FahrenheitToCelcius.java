package question8;

import java.util.Scanner;

public class FahrenheitToCelcius {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Temp.in Fahrenheit: ");
		double f=input.nextDouble();
		double c=(f-30)/2;
		System.out.println("The Temp in Celcius is: "+c);
		
	}

}
