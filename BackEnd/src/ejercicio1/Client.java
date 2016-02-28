package ejercicio1;

public class Client {

	private double balance;
	private String name;

	public Client(String aName, double aSalary) {
		name = aName;
		balance = aSalary;
	}

	public double getBalance() {
		return balance;
	}

	public String getName() {
		return name;
	}

	public void setBalance(double aBalance) {
		balance = aBalance;
	}

	public void buyPackage(Package aPackage) {
		if(this.balance >= aPackage.getTotalPrice()){
			this.balance = this.balance - (aPackage.getTotalPrice());
		}else{
			System.out.println("Insufficient Balance");
		}
	}

}
