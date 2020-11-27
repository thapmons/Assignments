package question6;

import java.util.Scanner;

public class PerimeterOfCircle {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Radius:");
		double r=input.nextDouble();
		System.out.println("Rect.Length: ");
		double l=input.nextDouble();
		System.out.println("Rect.Breath: ");
		double br=input.nextDouble();
		System.out.println("Tri.Side1: ");
		double s1=input.nextDouble();
		System.out.println("Tri.:Side2 ");
		double s2=input.nextDouble();
		System.out.println("Tri.:Side3 ");
		double s3=input.nextDouble();
		final double PI=Math.PI;
		double pCircle=PI*2*r;
		double pRect=(2*l)+(2*br);
		double pTri=s1+s2+s3;
		System.out.println("The Perimeter of Circle is: " + pCircle);
		System.out.println("The Perimeter of Rectangle is: " + pRect);
		System.out.println("The Perimeter of Triangle is: " + pTri);
		input.close();

	}

}
