package batch65.java.programs;

public class ForLoop {

	void printName() {
		
		for(int i=1; i<=5; i++) {
			System.out.println(i + ". Adnan Yakub Majgaonkar");
		}
	}
	
	public static void main(String[] args) {
		
		ForLoop f1 = new ForLoop();
		f1.printName();
	}
}
