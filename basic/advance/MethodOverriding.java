package basic.advance;

class SuperClass {
	
	void login() {
		System.out.println("User login via Mobile Number");
	}
}

public class MethodOverriding extends SuperClass {
	
	void login() {
		super.login();
		System.out.println("User login via Email Id");
	}
	
	public static void main(String[] args) {
		MethodOverriding m1 = new MethodOverriding();
		m1.login();
	}
}
