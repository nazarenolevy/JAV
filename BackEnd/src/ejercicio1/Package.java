package ejercicio1;

public class Package {
	
	private String name;
	private double tax;
	private StrategyBasePrice strategy;

	public Package(String aName, double aTax, StrategyBasePrice aStrategy){
		name = aName;
		tax = aTax;
		strategy = aStrategy;
	}
	
	public String getName(){
		return name;
	}
	
	public void setStrategy(StrategyBasePrice aStrategy){
		strategy = aStrategy;
	}
	
	public double getTotalPrice(){
		return (this.calculateBasePrice() + (this.calculateBasePrice() * (tax/100)));
	}
	
	public double calculateBasePrice(){
		return strategy.calculateBasePrice();
	}

}
