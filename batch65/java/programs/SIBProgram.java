package batch65.java.programs;

public class SIBProgram {

	static {
		System.out.println("This is static block1.");
	}
	
	static {
		System.out.println("This is static block2.");
	}
	
	public static void main(String[] args) {
		System.out.println("This is main method.");
	}
	
	static {
		System.out.println("This is static block3.");
	}
	
	static {
		System.out.println("This is static block4.");
	}
}
