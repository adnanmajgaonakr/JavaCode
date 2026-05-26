package basic.advance;
import java.util.Scanner;

public class ScannerClass {
	
	public static void main(String[] args) {
		
		System.out.println("Enter two numbers :");
		Scanner s1 = new Scanner(System.in);
		int a = s1.nextInt();
		int b = s1.nextInt();
		
		System.out.print("Addition of entered number is : ");
		System.out.println(a+b);
		
		System.out.print("Subtraction of entered number is : ");
		System.out.println(a-b);
		
		System.out.print("Multiplication of entered number is : ");
		System.out.println(a*b);
		
		System.out.print("Division of entered number is : ");
		System.out.println(a/b);
		
		System.out.print("Modulus of entered number is : ");
		System.out.println(a%b);
		
		s1.close();
	}

}
