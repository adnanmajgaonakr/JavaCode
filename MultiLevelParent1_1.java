package inheritance.programs;
import java.util.Scanner;

public class MultiLevelParent1_1 {

	Scanner s1 = new Scanner(System.in);
	
	void add() {
		System.out.println("Enter first number : ");
		int num1 = s1.nextInt();
		System.out.println("Enter second number : ");
		int num2 = s1.nextInt();
		
		int sum = num1 + num2;
		System.out.println("Sum of the two number is : " + sum);
	}
	
	void add(int a, int b) {
		System.out.println("It is second method");
		int sum = a + b;
		System.out.println("Sum of the two number is : " + sum);
	}
}
