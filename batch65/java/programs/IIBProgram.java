package batch65.java.programs;

public class IIBProgram {
	
	{
		System.out.println("This is Initialization block1.");
	}
	
	{
		System.out.println("This is Initialization block2.");
	}
	
	public static void main(String[] args) {
		System.out.println("This is main method.");
		IIBProgram i1 = new IIBProgram();
		IIBProgram i2 = new IIBProgram();
	}
	
	{
		System.out.println("This is Initialization block3.");
	}
	
	{
		System.out.println("This is Initialization block4.");
	}
}
