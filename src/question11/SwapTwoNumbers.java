package question11;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("X: "); double x=input.nextDouble();
		System.out.println("Y: "); double y=input.nextDouble();
		double z=x;
		x=y;
		y=z;
		System.out.println("AfterX: "+x);
		System.out.println("After Y: "+y);
		
	}

}
