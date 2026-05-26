package batch65.java.programs;
import java.util.Arrays;
import java.util.Scanner;

public class StringFunction4 {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String s2 = s1.nextLine();
		
		String[] s3 = s2.split(" ");
		System.out.println("String after split : " +Arrays.toString(s3));
		
		System.out.print("Enter the string : ");
		String s4 = s1.nextLine();
		System.out.println("Is entered string blank? : " +s4.isBlank());
		
		System.out.print("Enter the string : ");
		String s5 = s1.nextLine();
		System.out.println("Is entered string empty? : " +s5.isEmpty());
		
		s1.close();
	}
}
