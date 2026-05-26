package batch65.java.programs;

public class SIBIIBProgram {

	static {
		System.out.println("This is Static block 1.");
	}
	
	{
		System.out.println("This is Initialization block 1.");
	}
	
	public SIBIIBProgram() {
		System.out.println("This is constructor 1.");
	}
	
	public SIBIIBProgram(int a) {
		System.out.println("This is constructor 2.");
	}
	
	public static void main(String[] args) {
		
		new SIBIIBProgram();
		System.out.println("This is main method.");
		new SIBIIBProgram(10);
	}
	
	static {
		System.out.println("This is Static block 2.");
	}
	
	{
		System.out.println("This is Initialization block 1.");
	}
}
