package question7;

import java.util.Scanner;

public class VolumeOfCylinder {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Radius of Cylinder: ");
		double r=input.nextDouble();
		System.out.println("Enter the Height of Cylinder: ");
		double h=input.nextDouble();
		final double PI=Math.PI;
		double v=PI*r*r*h;
		System.out.println("The Volume of a Cylinder is: "+v);

	}

}
