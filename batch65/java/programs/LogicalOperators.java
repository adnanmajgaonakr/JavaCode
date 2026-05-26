package batch65.java.programs;
import java.util.Scanner;

public class LogicalOperators {

	public static void main(String[] args) {
		
		System.out.println("Enter two numbers :");
		Scanner s1 = new Scanner(System.in);
		int num1 = s1.nextInt(), num2 = s1.nextInt();
		
		if((num1 > num2) && (num1 != num2) ) {
			System.out.println("Case 1 is executed");
		}
		if((num1 < num2) || (num1 == num2)) {
			System.out.println("Case 2 is executed");
		}
		if(!(num1 >= num2)) {
			System.out.println("Case 3 is executed");
		}
		
		s1.close();
	}
}
