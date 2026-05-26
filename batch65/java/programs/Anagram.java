package batch65.java.programs;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter the first string : ");
		String string1 = s1.next();
		System.out.print("Enter the second string : ");
		String string2 = s1.next();
		
		if(string1.length()!=string2.length()) {
			System.out.println("Both strings are not Angram.");
		}
		else {
			char [] c1 = string1.toCharArray();
			System.out.println("After converting string1 into array : " 
			+ Arrays.toString(c1));
			char [] c2 = string2.toCharArray();
			System.out.println("After converting string2 into array : " 
					+ Arrays.toString(c2));
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			System.out.println("After sorting the first array : " +Arrays.toString(c1));
			System.out.println("After sorting the second array : " +Arrays.toString(c2));
			
			if(Arrays.equals(c1, c2)) {
				System.out.println("Both strings are Anagram.");
			}
			else {
				System.out.println("Both string are not Anagram");
			}
		}
		s1.close();
	}
}
