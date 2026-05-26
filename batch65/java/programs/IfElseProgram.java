package batch65.java.programs;

import java.util.Scanner;

public class IfElseProgram {

	public static void main(String[] args) {
		
		System.out.println("Enter any number :");
		Scanner s1 = new Scanner(System.in);
		int num = s1.nextInt();
		
		if((num%2)==0) {
			System.out.println("Number is Even");
		}
		else {
			System.out.println("Number is Odd");
		}
		
		s1.close();
	}
}
