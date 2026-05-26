package batch65.java.programs;
import java.util.Scanner;

public class NestedIfElseProgram2 {

	public static void main(String[] args) {
		
		System.out.println("Enter any number :");
		Scanner s1 = new Scanner(System.in);
		int num = s1.nextInt();
		
		if(num == 0 || num < 0) {
			System.out.println("Number should be greater than zero (0).");
		}
		else {
			if(num > 0 && num < 10) {
				System.out.println("Entered number is positive and less than 10.");
			}
			if(num >= 10 && num <= 100) {
				System.out.println("Entered number lies between 10 to 100.");
			}
			if(num > 100) {
				System.out.println("Entered number is greater than 100.");
			}
		}
	}
}
