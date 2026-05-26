package batch65.java.programs;

public class GetterAndSetter {

	private int age = 20;
	private double sal = 50000;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	
	public static void main(String[] args) {
		
		GetterAndSetter g1 = new GetterAndSetter();
		System.out.println("Before updation age is : " +g1.age);
		
		g1.setAge(25);
		System.out.println("After updation age is : " +g1.getAge());
		
		System.out.println("Before updation salary  is : " +g1.sal);
		
		g1.setSal(60000);
		System.out.println("After updation salary is : " +g1.getSal());

	}
}
