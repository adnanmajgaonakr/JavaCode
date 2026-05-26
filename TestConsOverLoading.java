package inheritance.programs;

public class TestConsOverLoading {
	
	public TestConsOverLoading(){
		this(32);
		System.out.println("This is constructor 1");
	}
	
	public TestConsOverLoading(int a){
		this(45, 65);
		System.out.println("This is constructor 2");
	}
	
	public TestConsOverLoading(int a, int b){
		System.out.println("This is constructor 3");
	}

	public static void main(String[] args) {
		new TestConsOverLoading();
	}
}
