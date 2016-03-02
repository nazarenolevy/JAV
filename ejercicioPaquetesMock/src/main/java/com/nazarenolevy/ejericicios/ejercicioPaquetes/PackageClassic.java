package com.nazarenolevy.ejericicios.ejercicioPaquetes;


public class PackageClassic implements StrategyBasePrice{
	
	private double basePrice;
	
	public PackageClassic(double aBasePrice){
		basePrice = aBasePrice;
	}
	
	public double calculateBasePrice(){
		return basePrice;
	}
}
