package basic.advance;

interface Interface1{
	void login();
}

public class ClassInterfaceRelation implements Interface1 {
	
	public void login() {
		System.out.println("Real logic of interface");
	}
	
	public static void main(String[] args) {
		ClassInterfaceRelation c1 = new ClassInterfaceRelation();
		c1.login();
	}

}
