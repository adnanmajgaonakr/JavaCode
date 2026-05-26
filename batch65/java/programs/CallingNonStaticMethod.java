package batch65.java.programs;

public class CallingNonStaticMethod {

	void add() {
		int num1 = 50;
		int num2 = 34;
		System.out.println("Addition of two number is : " + (num1 + num2));
	}
	
	public static void main(String[] args) {
		
		CallingNonStaticMethod c1 = new CallingNonStaticMethod();
		c1.add();
	}
}
