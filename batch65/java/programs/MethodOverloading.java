package batch65.java.programs;

public class MethodOverloading {

	static void add() {
		System.out.println("First Method");
		System.out.println("This method will print Addition");
	}
	void add(int a, int b) {
		System.out.println("Second Method");
		System.out.println("Addition of two numbers is : " + (a+b));
	}
	static void add(float a, double b) {
		System.out.println("Third Method");
		System.out.println("Addition of two numbers is : " + (a+b));
	}
	void add(int a, long b) {
		System.out.println("Fourth Method");
		System.out.println("Addition of two numbers is : " + (a+b));
	}
	
	public static void main(String[] args) {
		
		add();
		MethodOverloading m1 = new MethodOverloading();
		m1.add(30, 76);
		add(3.56f, 6.78);
		m1.add(67, 3450);
		
	}
}
