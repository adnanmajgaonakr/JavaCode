package basic.advance;

public class StringReverse {
	
	public static void main(String[] args) {
		
		String s1 = "Automation Testing";
		String s2 = "";
		
		for(int i=s1.length()-1; i>=0; i--) {
			
			char c1 = s1.charAt(i);
			s2 = s2+c1;
		}
		
		System.out.println("Input string is : "+s1);
		System.out.println("After reversing the string is : "+s2);
	}

}
