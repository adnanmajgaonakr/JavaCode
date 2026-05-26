package basic.advance;

public class MethodOverloading {
	
	static void printStatement() {
		System.out.println("Statement 1 is executed");
	}
	
	static void printStatement(int a, double b) {
		System.out.println("Statement 2 is executed and values are : "+ a + " "+ b);
	}
	
	void printStatement(double x) {
		System.out.println("Statement 3 is executed and value is : "+ x);
	}
	
	public static void main(String[] args) {
		printStatement();
		printStatement(45, 87.23);
		MethodOverloading m1 = new MethodOverloading();
		m1.printStatement(65.34);
	}

}
