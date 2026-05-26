package basic.advance;

class UpcastingProgram{
	
	static void method_1() {
		System.out.println("Method 1 of UpcastingProgram");
	}
	
	static void method_2() {
		System.out.println("Method 2 of UpcastingProgram");
	}
	
}

public class UpcastingProgram_1 extends UpcastingProgram {
	
	public static void main(String[] args) {
		
		UpcastingProgram u1 = new UpcastingProgram_1();
		u1.method_1();
		u1.method_2();
}
}
