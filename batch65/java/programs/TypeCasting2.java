package batch65.java.programs;

public class TypeCasting2 {

	public static void main(String[] args) {
		
		//Upcasting
		
		Object o1 = new TypeCasting2();     //Implicit way
		
		Object o2 = (Object) new TypeCasting2();   //Explicit way
		
		
		//Downcasting
		TypeCasting2 t1 = (TypeCasting2) o1;   //Explicit way
	}
}
