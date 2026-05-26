package basic.advance;

public class SwitchCase {
	
	public static void main(String[] args) {
		
		String name = "opera";
		
		switch(name){
			
		case "chrome" :
			System.out.println("Chrome is getting launched");
			break;
		
		case "edge" :
			System.out.println("Edge is getting launched");
			break;
			
		case "safari" :
			System.out.println("Safari is getting launched");
			break;
			
		default :
			System.out.println("Wrong input");
		}
	}

}
