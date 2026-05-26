package inheritance.programs;

interface Interface{
	void method1();
}

abstract class AbstractClass1 implements Interface{
	abstract void method2();
}

public class InterfaceDemo3 extends AbstractClass1{

	public void method1() {
		System.out.println("This is method1 from interface1");
	}

	void method2() {
		System.out.println("This is method2 from AbstractClass1");
	}
	
	public static void main(String[] args) {
		InterfaceDemo3 i1 = new InterfaceDemo3();
		i1.method1();
		i1.method2();
	}

}
