package batch65.java.programs;
import java.util.Scanner;

public class NestedIfElseProgram3 {

	public static void main(String[] args) {
		
		System.out.println("Enter any number :");
		Scanner s1 = new Scanner(System.in);
		int num = s1.nextInt();
		
		if(num > 0) {
			if(num % 2 == 0) {
				System.out.println("Number is positive and even.");
			}
			if(num % 2 != 0) {
				System.out.println("Number is positive and odd.");
			}
		}
		else if(num < 0) {
			if(num < -50) {
				System.out.println("Number is less than -50.");
			}
			else if(num >= -50) {
				System.out.println("Number lies between -50 to -1.");
			}
		}
		else {
			if(num == 0) {
				System.out.println("Number is zero (0).");
			}
			else {
				System.out.println("This else never execute.");
			}
		}
	}
}
