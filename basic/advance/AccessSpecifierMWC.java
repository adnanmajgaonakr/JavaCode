package basic.advance;

public class AccessSpecifierMWC {
	
	void method1() {
		System.out.println("Method 1 is accessible...");
	}
	
	public void method2() {
		System.out.println("Method 2 is accessible...");
	}
	
	private void method3() {
		System.out.println("Method 3 is accessible...");
	}
	
	protected void method4() {
		System.out.println("Method 4 is accessible...");
	}
	
	public static void main(String[] args) {
		AccessSpecifierMWC a1 = new AccessSpecifierMWC();
		a1.method1();
		a1.method2();
		a1.method3();
		a1.method4();
	}

}
