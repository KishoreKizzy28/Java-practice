package Scanner;

import java.util.Scanner;

public class Scannner {
	
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a name, age &salary:");

			String name = sc.nextLine();
			int age = sc.nextInt();
			double salary = sc.nextDouble();
			
			System.out.println("Name :"+name);
			System.out.println("age :"+age);
			System.out.println("salary :"+salary);
		}
	}
}

