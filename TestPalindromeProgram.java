package inheritance.programs;


public class TestPalindromeProgram {

	public static void main(String[] args) {
		
		String s1 = "madam";
		String reverse = "";
		
		for(int i=s1.length()-1; i>=0; i--) {
			reverse += s1.charAt(i);
		}
		
		System.out.println("Revrese string is : " +reverse);
		
		System.out.println("Palindrome check");
		
		if(s1.equals(reverse)) {
			System.out.println("String is palindrome.");
		}
		else {
			System.out.println("String is not plaindrome");
		}
	}
}
