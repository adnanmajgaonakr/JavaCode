package basic.advance;

public class StringBufferMethods {
	
	public static void main(String[] args) {
		
		  StringBuffer s1=new StringBuffer("Automation Test");
          System.out.println("After deleting new string will be : " + s1.delete(10, 15));
                  
          System.out.println("After replacing new string will be : " + s1.replace(0, 10,"Manual"));
                  
          StringBuffer s2=new StringBuffer("API Testing");
          System.out.println("After inserting new string will be : " + s2.insert(3, " SDET"));

          System.out.println("New sub-string will be : " + s2.substring(4));

          System.out.println("New sub-string will be : " +s2.substring(4, 6));
	}

}
