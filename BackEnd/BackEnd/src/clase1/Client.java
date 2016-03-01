package clase1;

public class Client {

	private String name;
	private StrategyClient strategy;

	public Client(StrategyClient aStrategy) {
		strategy = aStrategy;
	}

	public Client(String aName) {
		name = aName;
	}

	public String getName() {
		return name;
	}

	public void setEstrategy(StrategyClient aStrategy) {
		strategy = aStrategy;
	}

	public double calculatePrice(double aBasePrice) {
		double price = strategy.calculatePrice(aBasePrice);

		return price;
	}

}
