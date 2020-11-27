package question20;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class FourFunctionCalcultator {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the 1st number: ");
		double n1=input.nextInt();
		System.out.println("Choose the Operator:[ +  - * / ] ");
		char c1=input.next().charAt(0);
		if(c1== '+' ) {
			System.out.println("Enter the 2nd number:");
			double n2=input.nextInt();
			System.out.println(n1+n2);
		}
		
		else if(c1=='-') {
			System.out.println("Enter the 2nd number: ");
			double n2=input.nextInt();
			System.out.println(n1-n2);
			
		}
		else if(c1=='*') {
			System.out.println("Enter the 2nd number: ");
			double n2=input.nextInt();
			System.out.println(n1*n2);
			
		}
		else if(c1=='/') {
			System.out.println("Enter the 2nd number: ");
			double n2=input.nextInt();
			System.out.println(n1/n2);
			
		}
		else {
			System.out.println("ERROR!!\nINSERT A VALID OPERATOR");
		}
		
	}
	

}
