package collection_API;
import java.util.*; 
public class HashMapDemo {
	// Java code to illustrate the entrySet() method 
	
	  
	    public static void main(String[] args) 
	    { 
	  
	        // Creating an empty HashMap 
	        HashMap<Integer, String> hash_map = new HashMap<Integer, String>(); 
	  
	        // Mapping string values to int keys 
	        hash_map.put(11, "Rahul"); 
	        hash_map.put(12, "Yadav"); 
	        hash_map.put(22, "Dhruv"); 
	        hash_map.put(23, "Welcomes"); 
	        hash_map.put(33, "You"); 
	  
	        // Displaying the HashMap 
	        System.out.println("Initial Mappings are: " + hash_map); 
	  
	        // Using entrySet() to get the set view 
	        System.out.println("The set is: " + hash_map.entrySet()); 
	    } 
	

}
