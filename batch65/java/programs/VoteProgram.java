package batch65.java.programs;
import java.util.Scanner;

public class VoteProgram {

	public static void main(String[] args) {
		
		System.out.println("Enter your age : ");
		Scanner s1 = new Scanner(System.in);
		int age = s1.nextInt();
		
		if(age >= 18) {
			System.out.println("You are eligible to vote");
		}
		else {
			System.out.println("Sorry!!! You are not eligible to vote");
			System.out.println("You have to wait for " + (18-age) + " year(s)");
		}
	}
}
