package question25;

import java.util.Scanner;

public class NameScoreStudent {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("Enter no.of students");
		int numOfStudent=input.nextInt();
		int maxScore=0;
		String studentName="";
		
		for (int i = 1; i <=numOfStudent; i++) {
			System.out.println("Enter name of Student: ");
			String name=input.next();
			System.out.println("Enter Score: ");
			int score=input.nextInt();
			if(score>maxScore) {
				maxScore=score;
				studentName=name;
			}
			
		}
		System.out.println("Student Name is :" +studentName);
		System.out.println("Max Score is: "+maxScore);
		input.close();
	}

}
