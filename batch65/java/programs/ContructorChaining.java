package batch65.java.programs;

public class ContructorChaining {

	ContructorChaining(){
		this(20);
		System.out.println("First Constructor");
	}
	ContructorChaining(int a){
		this("Automation", 45.67);
		System.out.println("Second Constructor");
	}
	ContructorChaining(String s, double d){
		this(true);
		System.out.println("Third Constructor");
	}
	ContructorChaining(boolean b){
		System.out.println("Fourth Constructor");
	}
	
	public static void main(String[] args) {
		new ContructorChaining();
	}
}
