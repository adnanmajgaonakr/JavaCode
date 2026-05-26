package basic.advance;

class SuperClass1{
	
	public SuperClass1(int a){
		System.out.println("Parameterized constructor of SuperClass1");
	}
}

class SuperClass2 extends SuperClass1{
	
	public SuperClass2(){
		super(10);
		System.out.println("Non parameterized constructor of SuperClas2");
	}
}
public class SuperCalling extends SuperClass2{
	
	public static void main(String[] args) {
		new SuperClass2();
	}

}
