package batch65.java.programs;
import java.util.Scanner;

public class ComparisonOperator {

	public static void main(String[] args) {
		
		System.out.println("Enter two numbers :");
		Scanner s1 = new Scanner(System.in);
		int num1 = s1.nextInt(), num2 = s1.nextInt();
		
		if(num1 > num2) {
			System.out.println(num1 + " is greater than " + num2);
		}
		if(num1 < num2) {
			System.out.println(num1 + " is less than " + num2);
		}
		if(num1 >= num2) {
			System.out.println(num1 + " is greater than or equal to " + num2);
		}
		if(num1 <= num2) {
			System.out.println(num1 + " is less than or equal to " + num2);
		}
		if(num1 == num2) {
			System.out.println(num1 + " is equal to " + num2);
		}
		if(num1 != num2) {
			System.out.println(num1 + " is not equal to " + num2);
		}
		
		s1.close();
	}
}
