package inheritance.programs;

abstract class ParentClass{
	abstract void method1();
	abstract void method2();
}

class ConcreteClass extends ParentClass{
	void method1() {
		System.out.println("This is abstract method1.");
	}
	void method2() {
		System.out.println("This is abstract method2.");
	}
	void method3() {
		System.out.println("This is concrete method3.");
	}
}

public class AbstractDemo extends ConcreteClass{
	
	public static void main(String[] args) {
		AbstractDemo a1 = new AbstractDemo();
		a1.method1();
		a1.method2();
		a1.method3();
	}

}
