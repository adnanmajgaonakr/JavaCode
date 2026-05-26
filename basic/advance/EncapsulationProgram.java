package basic.advance;

public class EncapsulationProgram {

	private int stdId = 123456;
	
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	
	private String email = "adnan@gmail.com";
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public static void main(String[] args) {
		EncapsulationProgram e1 = new EncapsulationProgram();
		System.out.println("Before updating stdId : " + e1.stdId);
		e1.setStdId(789654);
		System.out.println("After updating stdId : " + e1.getStdId());
		
		System.out.println("Before updating email : " + e1.email);
		e1.setEmail("adnanmaj@gmail.com");
		System.out.println("After updating email : " + e1.getEmail());
	}
}
