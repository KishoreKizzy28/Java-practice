package Polymorphism;

public class Model  extends Vechichle{
	
	// private only within class
	// protected only within package

	private void Kia() {
		System.out.println("the vechichle type is electric");
	}
	public static void main(String[] args) {
		Vechichle s = new Vechichle();
		s.Hyundai();
		
		Type t = new Type();
		t.ford();
		
		Model m = new Model();
		m.Kia();
		
	}
}
