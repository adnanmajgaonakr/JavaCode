package inheritance.programs;

public class MultiLevelParent2 extends MultiLevelParent1 {

	MultiLevelParent2 m1 = new MultiLevelParent2();
	int num1 = m1.s1.nextInt();
	int num2 = m1.s1.nextInt();
	
	static void add() {
		
		MultiLevelParent2 m2 = new MultiLevelParent2();
		int sum = m2.num1 + m2.num2;
		System.out.println("Addition of " + m2.num1 + " and " + m2.num2 + " is : " + sum);
	}
	
	void sub() {
		int sub = num1 - num2;
		System.out.println("Subtraction of " + num1 + " and " + num2 + " is : " + sub);
	}
}
