package batch65.java.programs;

public class GloLocVariable {

	 static String s1 = "Manual Testing";
	
	public static void main(String[] args) {
	
		String s1 = "Automation Testing";
	
		System.out.println("Value of instance variable is : " + GloLocVariable.s1);
		System.out.println("Value of local variable is : " + s1);
	}
}
