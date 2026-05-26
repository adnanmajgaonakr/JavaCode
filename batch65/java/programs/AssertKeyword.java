package batch65.java.programs;
import java.util.Scanner;

public class AssertKeyword {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first string : ");
		String s1 = sc.next();
		System.out.print("Enter second string : ");
		String s2 = sc.next();
		
		assert s1.equals(s2) : "Both strings are not equal.";
		System.out.println("Both strings are equal.");
		
		sc.close();
	}
}
