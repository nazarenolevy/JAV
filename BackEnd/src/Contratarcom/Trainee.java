package Contratarcom;

public class Trainee implements StrategyCategory{

	public double averageSalary(Company aCompany, User aUser){
		return aCompany.getBaseSalary();
	}
	
}
