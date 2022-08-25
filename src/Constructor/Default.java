package Constructor;

public class Default {
	
	
	 void car() {
		 System.out.println("the car model is:"+ "Hyundai");
	}

	 void bike() {
		System.out.println("the bike model is :"+"pulsar");
		
	}
	 public static void main(String[] args) {
		 Default d = new Default();
			d.bike();
			d.car();
	}
}
