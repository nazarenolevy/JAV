package clase1;

public class App1 {

	public static void main(String[] args) {

		Passenger pax = new Passenger("Roberto", 30, 200);
		Client client = new Client(pax);

		System.out.println("Siendo pasajero, el precio es de: $" + client.calculatePrice(1000));

		client.setEstrategy(new Employee());
		System.out.println("Siendo empleado, el precio es de: $" + client.calculatePrice(1000));

	}

}
