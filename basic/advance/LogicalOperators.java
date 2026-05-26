package basic.advance;

public class LogicalOperators {
	
	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		
		if(a<=b && a==100) {
			System.out.println("Block 1 is executed");
		}
		
		if(a<=b || a==b) {
			System.out.println("Block 2 is executed");
		}
	}

}
