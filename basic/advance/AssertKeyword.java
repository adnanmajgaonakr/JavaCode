package basic.advance;
import java.util.Scanner;

public class AssertKeyword {

	public static void main(String[] args) {
		
		System.out.println("Enter your age : ");
		Scanner s1 = new Scanner(System.in);
		int age = s1.nextInt();
		
		assert age >= 18 : "Sorry !!! You are still below the age criteria.";
		
		System.out.println("Your are eligible as your age is " + age);
		
		s1.close();
	}
}
