package basic.advance;

interface InterfaceP{
	void login();
}

interface InterfaceC extends InterfaceP{
	void logout();
}

public class InterfaceRelation implements InterfaceC{
	public void login() {
		System.out.println("Logic for login...");
	}
	
	public void logout() {
		System.out.println("Login for logout...");
	}
	
	public static void main(String[] args) {
		InterfaceRelation i1 = new InterfaceRelation();
		i1.login();
		i1.logout();
	}
}
