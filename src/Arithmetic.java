package Exception_handling;

public class Arithmetic {
	
	 public static void main(String[] args) {  
	        try  
	        {  
	        int d=50/0; //may throw exception   
	        }  
	            //handling the exception  
	        catch(ArithmeticException e)  
	        {  
	            System.out.println(e);  
	        }  
	        System.out.println("rest of the code");  
	    }  

}
