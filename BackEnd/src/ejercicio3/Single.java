package ejercicio3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Single extends Client{

	/**
	 * 
	 */
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Single.class);
	private static final long serialVersionUID = 1L;
	private Pack reservedPackage;

	public Single(String aName, double aSalary) {
		name = aName;
		balance = aSalary;
	}
	
	public Pack getReservedPackage() {
		return reservedPackage;
	}



	public void setReservedPackage(Pack reservedPackage) {
		this.reservedPackage = reservedPackage;
	}



	public void reservePackage(Pack aPackage) throws BalanceExceptions{
		if(this.balance >= aPackage.getTotalPrice()){
			double parcialPrice = aPackage.getTotalPrice() * 0.50;
			this.balance = this.balance - parcialPrice;
			this.reservedPackage = aPackage;
		}else{
			throw new BalanceExceptions("Insufficient Balance");
		}
	}
	
	public void buyReservedPackage(Pack aPackage) throws Exception{
		
		if(this.reservedPackage == aPackage){
			if(this.balance >= aPackage.getTotalPrice() * 0.50){
				double remainingPrice = aPackage.getTotalPrice() * 0.50;
				this.balance = this.balance - remainingPrice;
				this.reservedPackage = null;
				this.arrayPackages.add(aPackage);
			}else{
				throw new BalanceExceptions("Insufficient Balance");
			}
		}else{
				throw new ReserveExceptions("The package has not been reserved");
		}
	}
	
}
