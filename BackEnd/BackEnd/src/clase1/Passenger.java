package clase1;

public class Passenger implements StrategyClient {

	private String name;
	private double commission;
	private double bonus;

	public Passenger(String aName, double aBonus, double aCommission) {
		name = aName;
		bonus = aBonus;
		commission = aCommission;
	}

	public String getName() {
		return name;
	}

	public double setBonus(double aBonus) {
		return bonus = aBonus;
	}

	@Override
	public double calculatePrice(double aBasePrice) {

		return aBasePrice - (((bonus * aBasePrice) / 100)) + commission;

	}

}
