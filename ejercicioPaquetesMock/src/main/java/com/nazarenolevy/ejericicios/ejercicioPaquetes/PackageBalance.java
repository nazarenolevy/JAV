package com.nazarenolevy.ejericicios.ejercicioPaquetes;

public class PackageBalance implements StrategyBasePrice{

	Client client;
	
	public PackageBalance(Client aClient){
		client = aClient;
	}
	
	public double calculateBasePrice(){
		return 0.10*client.getBalance();
	}
}
