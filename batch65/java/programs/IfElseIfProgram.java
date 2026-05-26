package batch65.java.programs;

import java.util.Scanner;

public class IfElseIfProgram {

	public static void main(String[] args) {
		
		System.out.println("Enter any number :");
		Scanner s1 = new Scanner(System.in);
		int num1 = s1.nextInt();
		
		if(num1 == 0) {
			System.out.println("Entered number is zero (0).");
		}
		else if(num1 > 0) {
			System.out.println("Entered number is positive number.");
		}
		else {
			System.out.println("Entered number is negative number.");
		}
		s1.close();
	}
}
