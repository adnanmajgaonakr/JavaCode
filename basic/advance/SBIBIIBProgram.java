package basic.advance;

public class SBIBIIBProgram {

	public SBIBIIBProgram() {
		System.out.println("This is my constructor");
	}
	
	static {
		System.out.println("This is my SIB");
	}
	
	{
		System.out.println("This is my IIB");
	}
	
	public static void main(String[] args) {
		
		System.out.println("This my main method");
		new SBIBIIBProgram();
	}
}
