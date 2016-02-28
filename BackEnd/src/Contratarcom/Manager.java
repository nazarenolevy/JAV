package Contratarcom;

public class Manager implements StrategyCategory{

	public double averageSalary(Company aCompany, User aUser){
		return (aCompany.getAmountEmployees() / 10) * aUser.getActualSalary();
	}
}
