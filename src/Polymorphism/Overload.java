package Polymorphism;

public class Overload {
	// class name = same , method name = same , arg = different
	
	int mult(int a,int b)  // method mult having 2 parameters
	{
	return a*b;
	}
	//Method Overloading on number of parameters
	int mult(int a,int b,int c)   // method mult having 3 parameters
	{
	return a*b*c;
	}
	
	
	public static void main(String[] args)
	{
	Overload M = new Overload();
	System.out.println(M.mult(10,9));
	System.out.println(M.mult(10,9,8));
	System.out.println(M.mult(10,8));
	}
	}
	