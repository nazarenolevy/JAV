package Contratarcom;


public class Junior implements StrategyCategory{

	private static Junior instance;
	
	private Junior(){
		
	}
	
	public static Junior getInstance(){
		if(instance == null){
			instance = new Junior();
		}
		return instance;
	}
	
	
	public double averageSalary(Company aCompany, User aUser){
		return Math.max(aCompany.getBaseSalary(), aUser.getActualSalary());
	}
	
}
