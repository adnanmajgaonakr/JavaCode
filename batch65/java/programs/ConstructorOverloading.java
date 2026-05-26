package batch65.java.programs;

public class ConstructorOverloading {

	ConstructorOverloading(){
		System.out.println("This is non parameterized constructor");
	}
	
	ConstructorOverloading(int a, int b){
		System.out.println("Addition of two numbers is : " + (a+b));
	}
	
	ConstructorOverloading(float a, int b){
		System.out.println("subtraction of two numbers is : " + (a-b));
	}
	
	public static void main(String[] args) {
		new ConstructorOverloading();
		new ConstructorOverloading(56, 89);
		new ConstructorOverloading(67.87f, 34);
	}
}
