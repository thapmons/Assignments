package question19;

//import java.util.Scanner;

import javax.swing.JOptionPane;

public class Triangle {

	public static void main(String[] args) {
		String s1=JOptionPane.showInputDialog("Enter 1st side length of the Triangle: ");
		double n1=Double.parseDouble(s1);
		String s2=JOptionPane.showInputDialog("Enter 2nd side length of the Triangle: ");
		double n2=Double.parseDouble(s2);
		String s3=JOptionPane.showInputDialog("Enter 3rd side lenth of the Triangle: ");
		double n3=Double.parseDouble(s3);
		if(n1==n2 && n1==n3) {
			JOptionPane.showMessageDialog(null,"Equilateral Triangle" );
			
		}
		if((n1==n2 || n1==n3)|| (n2==n1||n2==n3)||(n3==n1 || n3==n2)) {
			JOptionPane.showMessageDialog(null,"Isosceles Tri or Right angle Triangle");
		}
		if((n1!=n2 && n1!=n3)&& (n2!=n3 && n2!=n1) &&(n3!=n1 && n3!=n2)) {
			JOptionPane.showMessageDialog(null,"Either Scalene or Obtuse or Right angle Trianle");
			
			
		}
	
				}

}
