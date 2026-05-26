package batch65.java.programs;

public class StringFunctions4 {

	public static void main(String[] args) {
		
		String s1 = "New syllabus";
		
		boolean b1 = s1.matches("New(.*)");
		System.out.println("Is string starts with New : " + b1);
		
		String s2 = s1.replace('N', 'F');
		System.out.println("Original string is : " + s1);
		System.out.println("After replacing character : " + s2);
		
		String s3 = s1.replace("New", "Old");
		System.out.println("Original string is : " + s1);
		System.out.println("After replacing characters : " + s3);
		
		String s4 = s1.replaceAll("[a-z]", "1");
		System.out.println("Original string is : " + s1);
		System.out.println("After replacing [a-z] with 1 : " + s4);

	}
}
