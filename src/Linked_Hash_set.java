package Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linked_Hash_set {
	 public static void main(String[] args)
	    {
	 
	        
	        LinkedHashSet<String> linkedset
	            = new LinkedHashSet<String>();
	 
	        // Adding element to LinkedHashSet
	        //  add() method
	        linkedset.add("India");
	        linkedset.add("Australia");
	        linkedset.add("China");
	        linkedset.add("Denmark");
	 
	        // Note: This will not add new element
	        // as A already exists
	        linkedset.add("United Kingdom");
	        linkedset.add("Russia");
	        
	        System.out.println(linkedset);
	 
	        //size() method
	        System.out.println("Size of LinkedHashSet = "
	                           + linkedset.size());
	 
	        System.out.println("Original LinkedHashSet:"
	                           + linkedset);
	        Iterator<String> i = linkedset.iterator();
	        while (i.hasNext())
	        {
	        	System.out.println(i.next());
	        }
	 
	        // using remove() method
	        System.out.println("Removing Denmark from LinkedHashSet: "
	                           + linkedset.remove("Denmark"));
	 
	        // that does not exist in Set
	        System.out.println(
	            "Trying to Remove china which is not "
	            + "present: " + linkedset.remove("China"));
	 
	        // Set or not using contains() method
	        System.out.println("Checking if Usa is present="
	                           + linkedset.contains("Usa"));
	 
	        
	        System.out.println("Updated LinkedHashSet: "
	                           + linkedset);
	    }
	}
	

