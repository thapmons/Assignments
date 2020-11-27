package question12;

import java.util.Scanner;

public class RollNameNationality {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Roll: ");
		int r=input.nextInt();
		System.out.println("Name: ");
		String name=input.next();
		System.out.println("Nationality: ");
		String n=input.next();
		System.out.println("***********Info*****************");
		System.out.println("Name: "+name);
		System.out.println("Roll: "+r);
		System.out.println("Nationality: "+n);
		System.out.println("***********End******************");
	}

}
