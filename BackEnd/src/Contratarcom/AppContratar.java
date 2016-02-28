package Contratarcom;

public class AppContratar {

	public static void main(String[] args) {
		
		Trainee tr = new Trainee();
		User user = new User(tr, 3);

		Company company = new Company(1000,5);
		
		user.evaluateOffer(10, company);
		user.showHistory();
		
	}

}
