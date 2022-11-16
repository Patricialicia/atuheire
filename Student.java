package coursework;
import java. util.Scanner;
public class Student {
	public static void main(String[]args) {
		Scanner ed = new Scanner (System.in);
		String name;
		int marks, javascore,mathscore,webtechscore,cnscore,sescore;
		double avg;
		System.out.print("SYSTEM FOR GRADING EIGHT STUDENTS BY PATRICIA");
		System.out.println("");
		System.out.println("");
		System.out.print("Enter name of the student:");
		javascore=ed.nextInt();
			System.out.print("Enter the maximum grading mark:");
			javascore=ed.nextInt();
			System.out.print("Maths: ");
		mathscore=ed.nextInt();
		System.out.print("web Technoligies:");
		webtechscore=ed.nextInt();
		System.out.print("computer network:");
		cnscore=ed.nextInt();
		System.out.println("software engineering:");
		sescore=ed.nextInt();
		marks= javascore + mathscore + cnscore + sescore + webtechscore;
		avg = ((double) marks) / 500;
		System.out.println(" Your total marks is "+marks);
		if(avg > 0.8 && avg <=1) {
			System.out.println("Grade = A");
			
		}
		else if (avg > 0.6 && avg <= 0.8) {
		System.out.println("Grade = B");
		}
		else if (avg > 0.3 && avg <= 0.6) {
			System.out.println("Grade = C");
			
		}
		else if (avg > 0 && avg <= 0.3) {
			System.out.println("Grade = D");
		}
		
		
	}

}
