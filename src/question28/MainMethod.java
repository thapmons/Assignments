package question28;

import java.util.Scanner;

public class MainMethod {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		Functions obj =new Functions();
		System.out.println("Enter number to find prime: ");
		int n=input.nextInt();
		boolean isPrime=obj.isPrimeNumber(n); 
		System.out.println("Prime Number(True/False): "+ isPrime);
	}

}
