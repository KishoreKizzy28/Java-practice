package Hybridinheritance;

public class Child extends HumanBody{
	//single ingeritance is the relationship between child & human
	//implementing male and female interface is multiple
	
	public void show() {
		System.out.println("implementation of show() mwthod defined in interface male and female");
		
	}
 public void dispchild() {
	 System.out.println("method defined in child class");
}
 public static void main(String[] args) {
	 Child c = new Child();
	 System.out.println("Implementation of hybrid in java");
	 c.diplayHuman();
	 c.show();
	 c.dispchild();
}
}
