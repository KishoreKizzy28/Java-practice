package Abstraction;

public class Employee implements Orgrules{

	@Override
	public void attendoffice() {
		System.out.println("attending office");
	}

	@Override
	public void applyleave() {
		System.out.println("no govt holiday");
	}

	@Override
	public void providesalary() {
		System.out.println("getting hike");
	}
public static void main(String[] args) {
	Employee emp = new Employee();
	emp.applyleave();
	emp.attendoffice();
	emp.providesalary();
	
	
}
}
