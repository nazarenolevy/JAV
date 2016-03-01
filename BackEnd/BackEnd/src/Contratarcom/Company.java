package Contratarcom;

public class Company {

	private double baseSalary;
	private int amountEmployees;

	
	public Company(double aBaseSalary){
		baseSalary = aBaseSalary;
	}
	
	public Company(double aBaseSalary, int anAmountEmployees){
		baseSalary = aBaseSalary;
		amountEmployees = anAmountEmployees;
	}
	
	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public int getAmountEmployees() {
		return amountEmployees;
	}

	public void setAmountEmployees(int amountEmployees) {
		this.amountEmployees = amountEmployees;
	}

	
	
	
}
