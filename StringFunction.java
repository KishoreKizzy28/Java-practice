package StringTypes;

public class StringFunction {
	public static void main(String[] args) {
		
	
	String s = "Welcome to india";
	System.out.println(s);
	
	//length
	int length = s.length();
	System.out.println(length);
	
	// equals
	boolean equals = s.equals("welcome to usa");
	System.out.println(equals);
	
	//uppercase 
	String uc = s.toUpperCase();
	System.out.println(uc);
	
	//lowercase
	String lc = s.toLowerCase();
	System.out.println(lc);
	
	//Starts with
	boolean sw = s.startsWith("W");
	System.out.println(sw);
	
	//ends with
	boolean ew = s.endsWith("india");
	System.out.println(ew);
	
	//contains
	boolean contains = s.contains("z");
	System.out.println(contains);
	
	// index of
	int io = s.indexOf("e");
	System.out.println(io);
	
	//last index of 
	int lo = s.lastIndexOf("e");
	System.out.println(lo);
	
	//char at
	char ca = s.charAt(7);
	System.out.println(ca);
	
	//replace
	String replace = s.replace("india ","newyork");
	System.out.println(replace);
	
	//substring
	String sub = s.substring(3);
	System.out.println(sub);
	String sub1 = s.substring(3, 6);
	System.out.println(sub1);
	
	//empty
	boolean empty = s.isEmpty();
	System.out.println(empty);
	
	//Trim 
	String s1 = "Welcome to india       ";
	String trm = s1.trim();
	System.out.println(trm);
		
	

	
	
	
	
	}
}