package SingleInheritence;

public class Dog extends Animal{

	public void dogtype() {
		System.out.println("dog type is :"+"carnivore");
		
	}
	private void Goattype() {
		System.out.println("goat type is :"+"herbivore");
		
	}
	public static void main(String[] args) {
		Dog d = new Dog();
		Animal a = new Animal();
		a.type();
		a.type1();
		d.dogtype();
		d.Goattype();
	}
	

}
