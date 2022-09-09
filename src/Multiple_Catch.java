package Exception_handling;

public class Multiple_Catch {
	public static void main(String args[]){    
        try{    
            //int array[] = new int[10];    
           // array[10] = 30/0;  
            int a[] = {10,15,20,25};
            System.out.println(a[5]);
        }    
        catch(ArithmeticException e){  
            System.out.println(e.getMessage());  
        }    
        catch(ArrayIndexOutOfBoundsException e){  
            System.out.println(e.getMessage());  
        }    
        catch(Exception e){  
            System.out.println(e.getMessage());  
        }    
     }    
}  


