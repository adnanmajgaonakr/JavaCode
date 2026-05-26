package batch65.java.programs;

public class ValueUpdate {

	int num = 34;
	static String s = "New String";
	
	static void updateValue() {
		ValueUpdate v1 = new ValueUpdate();
		System.out.println("Before updating the value of instance variable is : " + v1.num);
		
		v1.num = 543;
		System.out.println("After updating the value of instance variable is : " + v1.num);
		
		System.out.println("Before updating the value of static global variable is : " + s);
		
	    s = "Updated String";
	    System.out.println("After updating the value of staic globalcvariable is : " + s);
	}
	
	public static void main(String[] args) {
		
		updateValue();
	}
}
