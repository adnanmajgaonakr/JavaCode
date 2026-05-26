package batch65.java.programs;

public class ForLoop2 {

	void printNumber() {
		
		System.out.println("This loop will print number from 1 to 0 :");
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		
		ForLoop2 f1 = new ForLoop2();
		f1.printNumber();
	}
}
