package basic.advance;

public class If_Block {
	
	public static void multipleIfBlock() {
		int a = 10;
		int b = 20;
		
		if(a > b) {
			System.out.println("First Block");
		}
		if(a < b) {
			System.out.println("Second Block");
		}
		if(a >= b) {
			System.out.println("Third Block");
		}
		if(a <= b) {
			System.out.println("Fourth Block");
		}
		if(a == b) {
			System.out.println("Fifth Block");
		}
		if(a != b) {
			System.out.println("Sixth Block");
		}
	}
	
	// main() Method
	public static void main(String[] args ) {
		multipleIfBlock();
	}

}
