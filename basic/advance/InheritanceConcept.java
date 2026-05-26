package basic.advance;

class GrandParent {
	
	public static void add() {
		int a = 10;
		int b = 20;
		int c = 30;
		int d = a+b+c;
		System.out.println("Add method from Grand Parent");
		System.out.println("Addition of three numbers is :"+ d);
	}
}

class Parent extends GrandParent{
	
	public static void sub() {
		double m = 1020;
		int  n = 50;
		int o = 60;
		double e = m-n-o;
		System.out.println("");
		System.out.println("Subtract method from Grand Parent");
		System.out.println("Subtraction of 3 numbers is :"+ e);
		
	}
	
}

public class InheritanceConcept extends Parent {
	
	public static void main(String[] args) {
		
		add();
		sub();
	}

}
