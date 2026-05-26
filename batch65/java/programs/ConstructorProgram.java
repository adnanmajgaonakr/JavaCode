package batch65.java.programs;

public class ConstructorProgram {

	ConstructorProgram(){
		System.out.println("This is the constructor of this program...");
	}
	
	public static void main(String[] args) {
	
		ConstructorProgram c1 = new ConstructorProgram(); //1st way to call constructor
		new ConstructorProgram();   // second way to call constructor
	}
}
