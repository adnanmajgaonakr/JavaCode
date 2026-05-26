package basic.advance;

public class StringBuilderMethods {
	
	public static void main(String[] args) {
		
		 StringBuilder s1=new StringBuilder("test cycle");
         System.out.println("After appending new string will be : " + s1.append(" test"));
         System.out.println("After reversing new string will be : " + s1.reverse());
         System.out.println("After deleting new string will be : " + s1.delete(0, 3));
         System.out.println("After replacing new string will be : " + s1.replace(5, 10, "automation"));
         System.out.println("After choosing portion new sub-string will be : " + s1.substring(5));
         System.out.println("After choosing portion new sub-string will be : " + s1.substring(5,8));
         System.out.println("After inserting new string will be : " + s1.insert(4, " the"));
	}

}
