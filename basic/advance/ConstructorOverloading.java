package basic.advance;

public class ConstructorOverloading {
	
	ConstructorOverloading() {
		this(10);
		System.out.println("Non Parameterized constructor 1");
	}
	
	ConstructorOverloading(int a) {
		this(34.56f, 30);
		System.out.println("Parameterized constructor 2");
	}
	
	ConstructorOverloading(float f, int a) {
		this("Constructor Overloading");
		System.out.println("Parameterized constructor 3");
	}
	
	ConstructorOverloading(String s) {
		System.out.println("Parameterized constructor 4");
	}
	
	public static void main(String[] args) {
		new ConstructorOverloading();
	}
}
