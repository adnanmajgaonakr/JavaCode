package inheritance.programs;

public class SignleLevelChild extends SignleLevelParent {

	static void print() {
		System.out.println("Child class method");
	}
	
	public static void main(String[] args) {
		
		SignleLevelChild s1 = new SignleLevelChild();
		
		System.out.println("Accessing instace variable from parent : " + s1.aParent);
		System.out.println("Accessing static global variable from parent : " + noOfDays);
		System.out.println("Inital value of temp variable is : " + temp);
		
		temp = 50;
		System.out.println("After updating temp variable value is : " + temp);
		
		add();
		s1.sub();
	}
}
