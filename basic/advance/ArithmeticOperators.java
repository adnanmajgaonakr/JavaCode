package basic.advance;

public class ArithmeticOperators {
	
	public static void add() {
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println("Addition is :"+ c);
	}
	
	public static void sub() {
		int a = 30;
		int b = 10;
		int c = a-b;
		System.out.println("Subtraction is :"+ c);
	}
	
	public static void mul() {
		int a = 10;
		int b = 20;
		int c = a*b;
		System.out.println("Multiplication is :"+ c);
	}
	
	public static void div() {
		int a = 40;
		int b = 20;
		int c = a/b;
		System.out.println("Division is :"+ c);
	}
	
	public static void mod() {
		int a = 40;
		int b = 20;
		int c = a%b;
		System.out.println("Modulus is :"+ c);
	}
	
	public static void main(String[] args) {
		add();
		sub();
		mul();
		div();
		mod();
		
	}

}
