package Contratarcom;

public class Senior implements StrategyCategory{

	public double averageSalary(Company aCompany, User aUser){
		return aUser.getActualSalary() * 2;
	}
	
}
