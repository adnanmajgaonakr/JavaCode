package batch65.java.programs;
import java.util.Scanner;

public class StringContainsOnlyAlphabets {

	public static void main(String[] args) {
		
		int alphabetsCount = 0;
		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String string1 = s1.nextLine();
		for(int i=0; i<string1.length(); i++) {
			boolean b1 = Character.isAlphabetic(string1.charAt(i));
			if(b1==true) {
				alphabetsCount++;
			}
		}
		System.out.println("Total alphabets count : " +alphabetsCount);
		if(alphabetsCount==string1.length()) {
			System.out.println("String contains only alphabets.");
		}
		else {
			System.out.println("String is not containing only alphabets.");
		}
		s1.close();
	}
}
