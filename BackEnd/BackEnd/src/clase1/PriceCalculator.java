package clase1;

public class PriceCalculator {

	public double calculatePrice(Client aClient, double aBasePrice) {

		double price = this.calculateIVA(aClient.calculatePrice(aBasePrice));

		return price;

	}

	public double calculateIVA(double price) {

		return price * 1.21;

	}

}
