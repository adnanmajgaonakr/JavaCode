package basic.advance;

public class If_Elseif_Block {
	public static void main(String[] args) {
		int a = 20;
		int b = 40;
		int c = 60;
		
		if(a==b) {
			System.out.println("Block 1 Executed");
		}
		else if(b<=c){
			System.out.println("Block 2 Executed");
		}
		else {
			System.out.println("Block 3 Executed");
		}
	}

}
