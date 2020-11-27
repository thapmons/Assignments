package question24;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number: ");
		  int number= input.nextInt();
		  int i,fact=1;  
		  for(i=1;i<=number;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+number+" is: "+fact);    
		 }  
	}


