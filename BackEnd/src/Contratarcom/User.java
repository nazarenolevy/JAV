package Contratarcom;

import java.util.ArrayList;

public class User {

	private ArrayList<Company> historyCompanies = new ArrayList<Company>();
	private double actualSalary;
	private StrategyCategory category;
	private int ageExperience;
	private Company actualCompany;
	

	public User(Company aCompany, double anActualSalary, StrategyCategory aCategory, int anAgeExperience) {
		historyCompanies.add(aCompany);
		actualSalary = anActualSalary;
		category = aCategory;
		ageExperience = anAgeExperience;
	}

	public User(StrategyCategory aCategory, int anAgeExperience) {
		category = aCategory;
		ageExperience = anAgeExperience;
	}

	public double getActualSalary() {
		return actualSalary;
	}
	
	public void setCompany(Company company){
		this.actualCompany = company;
	}
	
	public Company getCompany(){
		return actualCompany;
	}

	public void setActualSalary(double actualSalary) {
		this.actualSalary = actualSalary;
	}

	public StrategyCategory getCategory() {
		return category;
	}

	public void setCategory(StrategyCategory category) {
		this.category = category;
	}

	public int getAgeExperience() {
		return ageExperience;
	}

	public void setAgeExperience(int ageExperience) {
		this.ageExperience = ageExperience;
	}

	public double calculateNewSalary(Company aCompany) {
		return category.averageSalary(aCompany, this);
	}

	public void evaluateOffer(double expectedSalary, Company aCompany) {
		if (expectedSalary < this.calculateNewSalary(aCompany)) {
			this.acceptOffer(aCompany);
		}
	}

	public void acceptOffer(Company aCompany) {
		historyCompanies.add(aCompany);
		this.setCompany(aCompany);
		this.actualSalary = this.calculateNewSalary(aCompany);

	}
	
	public void showHistory(){
		for(Company company : historyCompanies){
			System.out.println(company);
		}
	}


}
