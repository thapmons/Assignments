package question28;

import java.util.Scanner;

public class Functions {

	public boolean isPrimeNumber(int n) {
		boolean isPrime=true;
		for(int i=2; i<=n/2; i++) {
			if(n%i==0) {
				isPrime=false;
			}
		}
		return isPrime;
	}

	public int firstNthPrime(int n) {
		for (int i = 2; i < 2; i++) {
			if(isPrimeNumber(i)) {
				System.out.println(i+ "");
			}
		}
		return n;
	}

	public void allPrimeBetween(int start, int end) {
		for (int i = start; i <=end; i++) {
			if(isPrimeNumber(i)) {
				System.out.println(i+ "");
			}
		}
	}
	public static void main(String[] args) {
		Functions obj=new Functions();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=input.nextInt();
		boolean f=obj.isPrimeNumber(n);
		int k=obj.firstNthPrime(n);
		System.out.println("Check for prime: "+ f);
		System.out.println("First"+ k);
		
	}
}



