package inheritance.programs;

class C1{
	static void add() {
		System.out.println("Addition Program.");
	}
	void sub() {
		System.out.println("Subtraction Program.");
	}
}

abstract class C2 extends C1{
	abstract void mult();
	void div() {
		System.out.println("Division Program.");
	}
}

public class AbstractMultilevel extends C2{

	void mult() {
		System.out.println("Multiplication Program.");
	}
	
	public static void main(String[] args) {
		AbstractMultilevel a1 = new AbstractMultilevel();
		add();
		a1.sub();
		a1.mult();
		a1.div();
		
	}

}
