package basic.advance;

public class Constructor {
	
	Constructor(){
		System.out.println("Non parameterized constructor");
	}
	
	Constructor(int a){
		System.out.println("Parameterized constructor and its value is : "+ a);
	}
	
	public static void main(String[] args) {
		
		new Constructor();
		new Constructor(250);
	}

}
