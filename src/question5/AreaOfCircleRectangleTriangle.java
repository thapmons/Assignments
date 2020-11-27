package question5;

//import java.util.Scanner;

import javax.swing.JOptionPane;
// Area of Circle
public class AreaOfCircleRectangleTriangle {

	public static void main(String[] args) {
		/*
		 * Scanner input=new Scanner(System.in);
		 * System.out.println("Enter the Radius:"); double r=input.nextDouble();
		 * System.out.println("Rect.Length: "); double l=input.nextDouble();
		 * System.out.println("Rect.Breath: "); double br=input.nextDouble();
		 * System.out.println("Tri.Base: "); double b=input.nextDouble();
		 * System.out.println("Tri.Height: "); double h=input.nextDouble(); final double
		 * PI=Math.PI; double areaOfCircle=PI*r*r; double rect=l*br; double tri=(b*h)/2;
		 * System.out.println("The area of circle is: " + areaOfCircle);
		 * System.out.println("The area of Rectangle is: " + rect);
		 * System.out.println("The area of Triangle is: " + tri); input.close();
		 */
		String s=JOptionPane.showInputDialog("Enter Radius: ");
		String x=JOptionPane.showInputDialog("Enter the Lenth of Rectangle: ");
		String y=JOptionPane.showInputDialog("Enter the Breath of Rectangle: ");
		String z=JOptionPane.showInputDialog("Enter the Height of Triangle");
		String v=JOptionPane.showInputDialog("Enter the Base of Triangle");
		double r=Double.parseDouble(s);
		double l=Double.parseDouble(x);
		double b=Double.parseDouble(y);
		double ht=Double.parseDouble(z);
		double bt=Double.parseDouble(v);
		final double PI=Math.PI;
		double areaOfCircle=PI*r*r;
		double areaRec=l*b;
		double areaTri=(ht*bt)/2;
		JOptionPane.showInternalMessageDialog(null, "Area of Circle: "+areaOfCircle);
		//String x=JOptionPane.showInputDialog("Enter the Length of Rectangle: ");
//		double l=Double.parseDouble(x);
//		String y=JOptionPane.showInputDialog("Enter the Breath of Rectangle: ");
//		double b=Double.parseDouble(y);
//		double areaRec=l*b;
		JOptionPane.showMessageDialog(null,"Area of Rectangle: "+areaRec);
		JOptionPane.showInternalMessageDialog(null,"The area of Triangle "+ areaTri);
		
		
	}

}









