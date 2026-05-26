package inheritance.programs;

interface Interface1{
	void method1();
}

interface Interface2 extends Interface1{
	void method2();
}
public class InterfaceDemo2 implements Interface2{

	public void method1() {
		System.out.println("This is method1 form Interface1");
	}

	public void method2() {
		System.out.println("This is method2 form Interface2");
	}
	
	public static void main(String[] args) {
		InterfaceDemo2 i1 = new InterfaceDemo2();
		i1.method1();
		i1.method2();
	}

}
