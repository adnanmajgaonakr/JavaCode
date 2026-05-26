package batch65.java.programs;

public class StringFunctions2 {

	public static void main(String[] args) {
		
		String s = "automation";
		System.out.println("Before applying toUpperCase() : " + s);
		String a1 = s.toUpperCase();
		System.out.println("After applying toUpperCase() : " + a1);
		
		String s1 = "AUTOMATION";
		System.out.println("Before applying toLowerCase() : " + s1);
		String a2 = s1.toLowerCase();
		System.out.println("After applying toLowerCase() : " + a2);
		
		String s2 = "Manual Testing";
		String s3 = "Automation Testing";
		System.out.println("Is String s2 and String s3 equal? " + s2.equals(s3));
		
		String s4 = "Manual Testing";
		String s5 = "manual Testing";
		System.out.println("Is String s4 and String s5 equal? " + s4.equalsIgnoreCase(s5));

		String s6 = "He is a good boy";
		System.out.println("Is string contains? " + s6.contains("good"));
	}
}
