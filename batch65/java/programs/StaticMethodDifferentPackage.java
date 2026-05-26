package batch65.java.programs;
import basic.advance.Addition_2;

public class StaticMethodDifferentPackage {

	public static void main(String[] args) {
		
		System.out.println("Calling static method from another class but different package");
		Addition_2.add_1();
	}
}
