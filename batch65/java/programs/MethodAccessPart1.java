package batch65.java.programs;

public class MethodAccessPart1 {

	public void Method1() {
		System.out.println("Accessing method1 within the class");
	}
	protected static void Method2() {
		System.out.println("Accessing method2 within the class");
	}
	void Method3() {
		System.out.println("Accessing method3 within the class");
	}
	private static void Method4() {
		System.out.println("Accessing method4 within the class");
	}
}
