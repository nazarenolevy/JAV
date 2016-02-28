package clase1;

public class Employee implements StrategyClient {

	private static double Bonus = 70;
	private static double Commission = 0;

	public Employee() {

	}

	@Override
	public double calculatePrice(double aBasePrice) {

		return aBasePrice - (((Bonus * aBasePrice) / 100)) + Commission;

	}

}
