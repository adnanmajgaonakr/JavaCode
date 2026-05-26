package batch65.java.programs;

public class StringFunctions {

	public static void main(String[] args) {
		
		String a = "Automation";
		
		int len = a.length();
		System.out.println("String length is : " + len);
		
		char c = a.charAt(5);
		System.out.println("Character at index is : " + c);
		
		String s = a.concat(" Testing");
		System.out.println("New String after concatination is : " + s);
	}
}
