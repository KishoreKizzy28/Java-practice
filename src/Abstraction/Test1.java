package Abstraction;

public class Test1 extends Test{
	public static void main(String[] args) {
		Test1 t = new Test1();
		t.mark();
		t.subject();
	}

	@Override
	public void subject() {
		System.out.println("overrirden");
	}

}
