package com.nazarenolevy.ejericicios.ejercicioPaquetes;
import java.util.ArrayList;


public abstract class Client extends Throwable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected double balance;
	protected String name;
	protected ArrayList<Pack> arrayPackages = new ArrayList<Pack>();


	public double getBalance() {
		return balance;
	}

	public String getName() {
		return name;
	}

	public void setBalance(double aBalance) {
		balance = aBalance;
	}

	public void buyPackage(Pack aPackage) throws Exception{
		
			if(balance >= aPackage.getTotalPrice()){
				double totalPrice = aPackage.getTotalPrice();
				this.balance = this.balance - totalPrice;
				this.arrayPackages.add(aPackage);
			}else{
				throw new BalanceExceptions("Insufficient Balance");
			}
	}
	
	public double totalExpended(){
		double sum = 0;
		for(Pack aPackage : arrayPackages){
			sum = sum + aPackage.getTotalPrice();
		}
		
		return sum;
	}
	
	public int amountPackages(){
		return arrayPackages.size();
	}
	
	public int findMostExpensePackage(){
		if(!arrayPackages.isEmpty()){
			double maxPrice = arrayPackages.get(0).getTotalPrice();
			int maxIndex = 0;
			for(int i = 1; i < arrayPackages.size(); i++){
				if(maxPrice < arrayPackages.get(i).getTotalPrice()){
					maxPrice = arrayPackages.get(i).getTotalPrice();
					maxIndex = i;
				}
			}
			return maxIndex;
		}else{
			return -1;
		}
	}
	
	public Pack mostExpensePackage(){
		int index = this.findMostExpensePackage();
		
		if(index != -1){
			return arrayPackages.get(index);
		}else{
			return null;
		}
	}

}
