package inheritance.programs;
import batch65.java.programs.MethodAccessPart1;

public class MethodsAccessPart3 extends MethodAccessPart1 {

	public static void main(String[] args) {
		
		MethodsAccessPart3 m1 = new MethodsAccessPart3();
		m1.Method1();
		MethodAccessPart1.Method2();
	}
}
