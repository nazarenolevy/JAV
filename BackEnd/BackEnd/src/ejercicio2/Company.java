package ejercicio2;

import java.util.ArrayList;

public class Company extends Client{
	
	public Company(String aName, double aSalary) {
		name = aName;
		balance = aSalary;
	}
	
	
	public void buyPackages(ArrayList<Pack> packages){
		
		for(Pack aPack : packages){
			this.buyPackage(aPack);
		}
		
	}

}
