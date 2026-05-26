package batch65.java.programs;

public class ArithmeticOperatos {

	static void add() {
		int a = 50;
		int b = 20;
		int c = a+b;
		System.out.println("Addition of " +a + " and " + b + " is : " +c);
	}
	static void sub() {
		int a = 50;
		int b = 20;
		int c = a-b;
		System.out.println("Subtraction of " +a + " and " + b + " is : " +c);
	}
	static void mul() {
		int a = 50;
		int b = 20;
		int c = a*b;
		System.out.println("Multiplication of " +a + " and " + b + " is : " +c);
	}
	static void div() {
		float a = 50;
		float b = 20;
		float c = a/b;
		System.out.println("Division of " +a + " and " + b + " is : " +c);
	}
	static void mod() {
		int a = 50;
		int b = 20;
		int c = a%b;
		System.out.println("Modulus of " +a + " and " + b + " is : " +c);
	}
	public static void main(String[] args) {
		add();
		sub();
		mul();
		div();
		mod();
	}
}
