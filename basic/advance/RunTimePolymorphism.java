package basic.advance;

import java.util.Scanner;

class Parent_1 {
	
	public void login(String email) {
		System.out.println("Successfully logged in with email id : " + email);
	}
}
public class RunTimePolymorphism extends Parent_1 {

	public void login(long mNumber) {
		System.out.println("Successfully logged in with email id : " + mNumber);
	}
	
	public static void main(String[] args) {
		
		System.out.println("How you want to login email / mobile number : ");
		Scanner s1 = new Scanner(System.in);
		String s = s1.next();
		
		if(s.equals("email")) {
			Parent_1 p1 = new Parent_1();
			p1.login("xyz@gmail.com");
		}
		else {
			RunTimePolymorphism r1 = new RunTimePolymorphism();
			r1.login(982313130);
		}
		
		s1.close();
	}
}
