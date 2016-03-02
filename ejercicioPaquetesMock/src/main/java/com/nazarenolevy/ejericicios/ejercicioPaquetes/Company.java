package com.nazarenolevy.ejericicios.ejercicioPaquetes;

import java.util.ArrayList;

public class Company extends Client{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public Company(String aName, double aSalary) {
		name = aName;
		balance = aSalary;
	}
	
	
	public void buyPackages(ArrayList<Pack> packages) throws Exception{
		
		for(Pack aPack : packages){
			this.buyPackage(aPack);
		}
		
	}

}
