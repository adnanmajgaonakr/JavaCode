package batch65.java.programs;
import java.util.Scanner;

public class StringFunctions3 {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the sting : ");
		String s2 = s1.nextLine();
		String reverse = "";
		
		for(int i=s2.length()-1; i>=0; i--) {
			
			char c1 = s2.charAt(i);
			reverse = reverse + c1;
		}
		
		System.out.println("Input string is : " + s2);
		System.out.println("After reversing the string is : " + reverse);
		
		if(s2.equalsIgnoreCase(reverse)) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not a palindrome");
		}
		
		s1.close();
	}
}
