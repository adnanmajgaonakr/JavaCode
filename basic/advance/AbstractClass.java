package basic.advance;

abstract class SuperClass_1
{
	abstract void add();
	abstract void sub();
}

abstract class SuperClass_2 extends SuperClass_1
{
	abstract void mul();
	abstract void div();
}

public class AbstractClass extends SuperClass_2 
{
	void add() {
		System.out.println("Method for addition");
	}
	void sub() {
		System.out.println("Method for subtraction");
	}
	void mul() {
		System.out.println("Method for multiplication");
	}
	void div() {
		System.out.println("Method for division");
	}
	public static void main(String[] args) {
		AbstractClass a1 = new AbstractClass();
		a1.add();
		a1.sub();
		a1.mul();
		a1.div();
	}

}
