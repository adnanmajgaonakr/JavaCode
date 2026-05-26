package batch65.java.programs;
import java.util.Arrays;
import java.util.Scanner;

public class StringIntoArray {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter your string : ");
		String s = s1.nextLine();
		char [] c1 = s.toCharArray();
		System.out.println("String in the form of array : " +Arrays.toString(c1));
		s1.close();
	}
}
