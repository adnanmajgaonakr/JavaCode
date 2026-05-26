package basic.advance1;

import basic.advance.ParentClassOfAnotherPackage;

public class ChildClassOfAnotherPackage extends ParentClassOfAnotherPackage {

	public static void main(String[] args) {
		
		ParentClassOfAnotherPackage p1 = new ParentClassOfAnotherPackage();
		p1.method2();
	}
}
