package basic.advance;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		
		 Map<Integer, String> students = new HashMap<>();

	        // Adding key-value pairs
	        students.put(101, "Adnan");
	        students.put(102, "Rahul");
	        students.put(103, "Sameer");
	        students.put(104, "Imran");

	        // Displaying the map
	        System.out.println("Map: " + students);

	        // Getting value by key
	        System.out.println("Value for key 102: " + students.get(102));

	        // Updating a value
	        students.put(103, "Sameer Khan");
	        System.out.println("After updating key 103: " + students);

	        // Removing a key
	        students.remove(104);
	        System.out.println("After removing key 104: " + students);

	        // Checking if key exists
	        System.out.println("Contains key 101? " + students.containsKey(101));

	        // Checking if value exists
	        System.out.println("Contains value 'Rahul'? " + students.containsValue("Rahul"));

	        // Size of map
	        System.out.println("Size of Map: " + students.size());
	        
	        // Iterating keys
	        System.out.println("Iterating the keys :");
	        for(Integer i1 : students.keySet()) {
	        	System.out.println(i1);
	        }
	        
	        // Iterating values
	        System.out.println("Iterating the values :");
	        for(String s1 : students.values()) {
	        	System.out.println(s1);
	        }
	        
	     // Iterating key and values
	        System.out.println("Iterating the key and values :");
	        for(Entry<Integer, String> e1 : students.entrySet()) {
	        	System.out.println(e1);
	        }
	        
	        System.out.println("Iterating the key and values using iterator:");
	        Set<Entry<Integer, String>> s2 = students.entrySet();
	        Iterator<Entry<Integer, String>> i1 = s2.iterator();
	        while(i1.hasNext()) {
	        	System.out.println(i1.next());
	        }
	}
}
