package inheritance.programs;

class A{
	 void show() {
		 System.out.println("A");
	 }
}
class B extends A{

	 void print() {
		System.out.println("meow");
	}
}

public class Main {

	public static void main(String[] args) {
		A a = new B();
		a.show();
	}
}
