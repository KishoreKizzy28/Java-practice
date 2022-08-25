package MultipleInheritance;

public class TestInterface3 implements Printable,Showable{

	@Override
	public void print() {
		System.out.println("hello");
	}

	@Override
	public void name() {
		System.out.println("my name is khan");
	}
	public static void main(String[] args) {
		TestInterface3 t = new TestInterface3();
		t.print();
		t.name();
	}

}
