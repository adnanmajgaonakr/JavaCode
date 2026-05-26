package batch65.java.programs;

import java.util.Scanner;

public class StringCountOfEachCharacter {

	public static void main(String[] args) {
		
		int countOfAplha = 0;
		int countOfNumeric = 0;
		int countOfSpaces = 0;
		int countOfSpecChar = 0;
		
		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter your string : ");
		String input = s1.nextLine();
		char [] c1 = input.toCharArray();
		for(int i=0; i<input.length(); i++) {
			boolean b1 = Character.isAlphabetic(c1[i]);
			if(b1==true) {
				countOfAplha++;
			}
			boolean b2 = Character.isDigit(c1[i]);
			if(b2==true) {
				countOfNumeric++;
			}
			boolean b3 = Character.isWhitespace(c1[i]);
			if(b3==true) {
				countOfSpaces++;
			}
		}
		System.out.println("Total length of string is : " +input.length());
		System.out.println("Total count of alphabets are : " +countOfAplha);
		System.out.println("Total count of numerics are : " +countOfNumeric);
		System.out.println("Total count of spaces are : " +countOfSpaces);
		
		countOfSpecChar = input.length()-(countOfAplha+countOfNumeric+countOfSpaces);
		System.out.println("Total count of special characters are : " +countOfSpecChar);

	}
}
