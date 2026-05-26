package batch65.java.programs;

public class ForLoop7 {

	void printNumber() {
		
		System.out.println("This loop will print number from 10 to -10 :");
		for(int i=10; i>=-10; i--) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		
		ForLoop7 f1 = new ForLoop7();
		f1.printNumber();
	}
}
