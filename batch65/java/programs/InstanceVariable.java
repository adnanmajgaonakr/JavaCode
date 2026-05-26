package batch65.java.programs;

public class InstanceVariable {

	int a = 10;
	int b = 30;
	
	static void add() {
		
		InstanceVariable i1 = new InstanceVariable();
		System.out.println("Addition of instance variable is : " + (i1.a+i1.b));
	}
	
	public static void main(String[] args) {
		add();
	}
}
