package basic.advance;

import java.util.Arrays;

public class Anagram {
	
	public static void main(String[] args) {
		
		String a1 = "SAW";
		String a2 = "WAS";
		
		if(a1.length()!=a2.length()) {
			System.out.println("Strings are not Anagram");
		}
		else {
			System.out.println("----After converting string into array----");
			char [] c1 = a1.toCharArray();
			char [] c2 = a2.toCharArray();
			System.out.println("String a1 values will be : "+Arrays.toString(c1));
			System.out.println("String a2 values will be : "+Arrays.toString(c2));
			
			System.out.println("----After sorting values of arrays will be----");
			Arrays.sort(c1);
			Arrays.sort(c2);
			System.out.println(Arrays.toString(c1));
			System.out.println(Arrays.toString(c2));
			
			if(Arrays.equals(c1, c2)) {
				System.out.println("Strings are Anagram");
			}
			else {
				System.out.println("Strings are not Anagram");
			}
		}
	}

}
