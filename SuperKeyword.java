package inheritance.programs;

class Parent{
	void method1() {
		System.out.println("Non parameterized method of Parent1");
	}
	void method1(int a) {
		System.out.println("Parameterized method of Parent1");
	}
}

public class SuperKeyword extends Parent {

	void method1() {
		super.method1();
		System.out.println("Non parameterized method of SuperKeyword");
	}
	void method1(int a) {
		super.method1(10);
		System.out.println("Non parameterized method of SuperKeyword");
	}
	
	public static void main(String[] args) {
		SuperKeyword s1 = new SuperKeyword();
		s1.method1();
		s1.method1(23);
	}
}
