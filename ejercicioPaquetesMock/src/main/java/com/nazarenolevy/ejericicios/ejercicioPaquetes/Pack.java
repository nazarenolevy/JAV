package com.nazarenolevy.ejericicios.ejercicioPaquetes;

public class Pack {
	
	private String name;
	private double tax;
	private StrategyBasePrice strategy;

	public Pack(String aName, double aTax, int anAmountRooms, double aRoomPrice){
		name = aName;
		tax = aTax;
		strategy = new PackageRooms(anAmountRooms, aRoomPrice);
	}
	
	public Pack(String aName, double aTax, double aBasePrice){
		name = aName;
		tax = aTax;
		strategy = new PackageClassic(aBasePrice);
	}
	
	public Pack(String aName, double aTax, Client aClient){
		name = aName;
		tax = aTax;
		strategy = new PackageBalance(aClient);
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
