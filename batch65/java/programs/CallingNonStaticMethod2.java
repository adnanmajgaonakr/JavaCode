package batch65.java.programs;

public class CallingNonStaticMethod2 {

	void add() {
		int num1 = 50;
		int num2 = 34;
		System.out.println("Addition of two number is : " + (num1 + num2));
	}
	void sub() {
		int num1 = 50;
		int num2 = 34;
		System.out.println("Subtration of two number is : " + (num1 - num2));
	}
	
	public static void main(String[] args) {
		
		CallingNonStaticMethod2 c1 = new CallingNonStaticMethod2();
		c1.add();
		c1.sub();
	}
}
