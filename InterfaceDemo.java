package inheritance.programs;

interface I1{
	void method1();
	void method2();
}
public class InterfaceDemo implements I1{

	public void method1() {
		System.out.println("This is method1 of interface");
	}

	public void method2() {
		System.out.println("This is method2 of interface");
	}
	
	public static void main(String[] args) {
		InterfaceDemo i1 = new InterfaceDemo();
		i1.method1();
		i1.method2();
	}

}
