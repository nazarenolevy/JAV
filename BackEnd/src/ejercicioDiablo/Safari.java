package ejercicioDiablo;


public class Safari implements Mission {

	private Place place;
	private int percentage;
	
	public Safari(Place aPlace, int aPercentage){
		place = aPlace;
		percentage = aPercentage;
	}

	public Place getaPlace() {
		return place;
	}

	public void setaPlace(Place aPlace) {
		this.place = aPlace;
	}

	public int getPercentage() {
		return percentage;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	
	
	public boolean canDoMission(Demon aDemon){
		int amountHuntableSouls = aDemon.huntableSouls(place).size();
		int minimumPercentage = (amountHuntableSouls * 100) / place.getSouls().size();
		
		return minimumPercentage >= percentage;
	}
	
	
}
