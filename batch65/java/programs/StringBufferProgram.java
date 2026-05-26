package batch65.java.programs;

public class StringBufferProgram {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Automation");
		System.out.println("Original String : " +sb);
		System.out.println("String after append Testing :" 
				+sb.append(" Testing"));
		System.out.println("String after using insert method : "
				+sb.insert(10, " And API"));
		System.out.println("String after using replace method : "
				+sb.replace(0, 10, "Manual"));
		System.out.println("String after using delete method : "
				+sb.delete(14, 22));
		System.out.println("String after using reverse method : "
				+sb.reverse());
		System.out.println("Using charAt method : " +sb.charAt(2));
		System.out.println("Length of the string : " +sb.length());
		System.out.println("Sub string using single index : "
				+sb.substring(9));
		System.out.println("Sub string using start and end index : "
				+sb.substring(0, 3));
	}
}
