package inheritance.programs;

interface Interface11{
	void method11();
}

interface Interface12{
	void method12();
}

interface Interface13{
	void method13();
}

interface Interface14{
	void method14();
}

public class InterfaceDemo4 implements Interface11,Interface12,Interface13,Interface14{

	public void method11() {
		System.out.println("This is method11 from interface11");
	}
	
	public void method12() {
		System.out.println("This is method12 from interface12");
	}
	
	public void method13() {
		System.out.println("This is method13 from interface13");
	}
	
	public void method14() {
		System.out.println("This is method14 from interface14");
	}
	
	public static void main(String[] args) {
		InterfaceDemo4 i1 = new InterfaceDemo4();
		i1.method11();
		i1.method12();
		i1.method13();
		i1.method14();
	}
}
