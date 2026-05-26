package batch65.java.programs;

public class ForLoop3 {

	void printNumber() {
		
		System.out.println("This loop will print number from -1 to -10 :");
		for(int i=-1; i>=-10; i--) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		
		ForLoop3 f1 = new ForLoop3();
		f1.printNumber();
	}
}
