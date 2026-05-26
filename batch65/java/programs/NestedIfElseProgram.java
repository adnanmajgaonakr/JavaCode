package batch65.java.programs;
import java.util.Scanner;

public class NestedIfElseProgram {

	public static void main(String[] args) {
		
		System.out.println("Enter any number :");
		Scanner s1 = new Scanner(System.in);
		int num = s1.nextInt();
		
		if(num > 0) {
			System.out.println("Number is Positive.");
			if((num%2)==0) {
				System.out.println("Number is Even.");
			}
			else {
				System.out.println("Number is Odd.");
			}
		}
		else if(num < 0) {
			System.out.println("Number is Negative");
		}
		else {
			System.out.println("Number is zero (0)");
		}
	}
}
