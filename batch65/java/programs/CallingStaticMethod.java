package batch65.java.programs;

public class CallingStaticMethod {

	static void method() {
		System.out.println("This is static method called by main method within the class.");
	}
	
	public static void main(String[] args) {
	
		System.out.println("Start of the program");
		method();
		System.out.println("This is static method from another class...");
		ArithmeticOperatos.add();  //static method of another class (ArithmeticOperatos)
		System.out.println("End of the program");
	}
}
