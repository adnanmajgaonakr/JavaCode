package inheritance.programs;

class parent1{
	parent1(){
		System.out.println("First Constructor from Parent 1 class.");
	}
	parent1(int a){
		this();
		System.out.println("Second Constructor from Parent 1 class.");
	}
}

class Parent2 extends parent1{
	Parent2(){
		this(20);
		System.out.println("First Constructor from Parent 2 class.");
	}
	Parent2(int a){
		super(100);
		System.out.println("Second Constructor from Parent 2 class.");
	}
}

public class SuperCalling extends Parent2{

	SuperCalling(){
		System.out.println("First Constructor from SuperCalling class.");
	}
	public static void main(String[] args) {
		new SuperCalling();
	}
}
