package Set;

import java.util.Set;
import java.util.TreeSet;

public class Tree_Set {
	public static void main(String[] args)
    {
        
        Set<String> ts = new TreeSet<String>();
        //it prints in ascending order
  
        // Elements are added using add() method
        ts.add("india");
        ts.add("punjab");
        ts.add("cochin");
        ts.add("goa");
        ts.add("tamil nadu");
        ts.add("tamil nadu");// it does not allow duplicate 
        // Print all elements inside object
        System.out.println(ts);
        
        for(String s : ts) {
        	System.out.println(s);
        }
      
    }
}
	
	

