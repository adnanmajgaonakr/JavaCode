package batch65.java.programs;

public class StringBuilderProgram {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("He is a good boy");
		System.out.println("Original string : " +sb);
		System.out.println("String after using append method : "
				+sb.append(" among all"));
		System.out.println("String after using insert method : "
				+sb.insert(5, " not"));
		System.out.println("String after using replace method : "
				+sb.replace(17, 21, "girl "));
		System.out.println("String after using delete method : "
				+sb.delete(6, 10));
		System.out.println("String after using reverse method : "
				+sb.reverse());
		System.out.println("Current capacity of the string : "
				+sb.capacity());
		System.out.println("Char at index 5 : " +sb.charAt(5));
		System.out.println("Length of the string : " +sb.length());
		System.out.println("Substring using single index : "
				+sb.substring(4));
		System.out.println("String using start and end index : "
				+sb.substring(15, 27));
	}
}
