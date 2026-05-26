package inheritance.programs;

abstract class AbstractClass{
	abstract void method1();
	abstract void method2();
	abstract void method3();
}
public class AbstractDemo2 extends AbstractClass{

	@Override
	void method1() {
		System.out.println("Abstract method1");
	}

	@Override
	void method2() {
		System.out.println("Abstract method2");		
	}

	@Override
	void method3() {
		System.out.println("Abstract method3");		
	}

	public static void main(String[] args) {
		AbstractDemo2 a1 = new AbstractDemo2();
		a1.method1();
		a1.method2();
		a1.method3();
	}
}
