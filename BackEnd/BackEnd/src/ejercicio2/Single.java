package ejercicio2;

import java.util.ArrayList;

public class Single extends Client{

	private ArrayList<Pack> reservedPackages = new ArrayList<Pack>();

	public Single(String aName, double aSalary) {
		name = aName;
		balance = aSalary;
	}
	
	public void reservePackage(Pack aPackage){
		if(this.balance >= aPackage.getTotalPrice()){
			double parcialPrice = aPackage.getTotalPrice() * 0.50;
			this.balance = this.balance - parcialPrice;
			this.reservedPackages.add(aPackage);
		}else{
			System.out.println("Insufficient Balance");
		}
	}
	
	public void buyReservedPackage(Pack aPackage){
		if(this.reservedPackages.contains(aPackage)){
			if(this.balance >= aPackage.getTotalPrice() * 0.50){
				double remainingPrice = aPackage.getTotalPrice() * 0.50;
				this.balance = this.balance - remainingPrice;
				this.reservedPackages.remove(aPackage);
				this.arrayPackages.add(aPackage);
			}else{
				System.out.println("Insufficient Balance");
			}
		}else{
			System.out.println("The package has not been reserved");
		}
	}
	
}
