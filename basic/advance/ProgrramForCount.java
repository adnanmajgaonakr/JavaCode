package basic.advance;

import java.util.Arrays;

public class ProgrramForCount {
    static int noofAlphabets=0;
    static int noofNumeric=0;
    static int noofSpaces=0;
    static int noofSpecialChar=0;
    
	public static void main(String[] args) {
		String s1= "What a amazing scene it is!!!";
		
		char [] c1 = s1.toCharArray();
		System.out.println("After Converting string to array : "+Arrays.toString(c1));
		
		for(int i=0; i<c1.length; i++) {
			
			boolean a1 = Character.isAlphabetic(c1[i]);
			if(a1==true) {
				noofAlphabets++;
			}
			
			boolean a2 = Character.isDigit(c1[i]);
			if(a2==true) {
				noofNumeric++;
			}
			
			boolean a3 = Character.isWhitespace(c1[i]);
			if(a3==true) {
				noofSpaces++;
			}
		}
		System.out.println("Total count of alphabets are : "+noofAlphabets);
		System.out.println("Total count of numeric are : "+noofNumeric);
		System.out.println("Total count of white spaces are : "+noofSpaces);
		
		noofSpecialChar = s1.length()-(noofAlphabets+noofNumeric+noofSpaces);
		System.out.println("Total count of special characters are : "+noofSpecialChar);
	}

}
