package Contratarcom;

public class SSenior implements StrategyCategory {

	private static SSenior instance;

	private SSenior(){
		
	}

	public static SSenior getInstance() {
		if (instance == null) {
			instance = new SSenior();
		}
		return instance;
	}

	public double averageSalary(Company aCompany, User aUser) {
		return aUser.getAgeExperience() * 2000;
	}

}
