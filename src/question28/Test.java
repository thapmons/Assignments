package question28;

import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		PrimeFactorialetc obj=new PrimeFactorialetc();
		Scanner input=new Scanner(System.in);
		String decision=" ";
		do {
			System.out.println("Enter your choice: Factorial|Prime|FirstNthPrime|allPrimeBetween");
			String choice=input.next();
			switch (choice) {
			case "Factorial": {
				
				System.out.println("Enter the number to find factorial:  ");
				int n=input.nextInt();
				int f=obj.findFactorial(n);
				System.out.println("Factorial of "+n+ " is: "+f);
				break;
			}
			case "Prime":{
				System.out.println("Enter number to find prime: ");
				int n=input.nextInt();
				boolean isPrime=obj.isPrimeNumber(n);
				if (isPrime) {
					System.out.println(n+ " is a prime number");
				} else {
					System.out.println(n+ " is not a prime number");

				}
				break;
			}
				case"FirstNthPrime":
					System.out.println("Enter number to find firstNthprime: ");
					int n=input.nextInt();
					obj.firstNthPrime(n);
					break;
				case"allPrimeBetween":
					System.out.println("Enter start prime number: ");
					int start=input.nextInt();
					System.out.println("Enter end prime number: ");
					int end=input.nextInt();
					obj.allPrimeBetween(start, end);
					break;
					
			
			default:
				break;
			}	
			System.out.println("Do you want to continue");
			decision=input.next();
			
		} while (decision.equalsIgnoreCase("YES"));
		System.out.println("Happy Coding: ");
		input.close();
		}

}
	


