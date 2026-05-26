package inheritance.programs;

public class MultiLevelParent1_2 extends MultiLevelParent1_1 {

	void sub() {
		int num1 = 20;
		int num2 = 5;
		int sub = num1 - num2;
		System.out.println("Subtraction of the two number is : " + sub);
	}
	
	void sub(int a, int b) {
		System.out.println("It is second method");
		int sub = a + b;
		System.out.println("Subtraction of the two number is : " + sub);
	}
}
