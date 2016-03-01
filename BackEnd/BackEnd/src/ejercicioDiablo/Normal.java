package ejercicioDiablo;

public class Normal implements StateMood{

	private static Normal instance;
	private final double multiplicator = 1;
	
	public Normal(){}
	
	public static Normal getInstance(){
		if(instance == null){
			instance = new Normal();
		}
		
		return instance;
	}
	
	public boolean verifyHunt(Demon aDemon, Soul aSoul){
		return (aDemon.getEvilLevel() * multiplicator) > aSoul.getGoodnessLevel();
	}
	
	public void setChill(Soul aSoul){
		aSoul.setChill(!aSoul.isChilly());
	}

	public void setNewState(Demon aDemon){
		aDemon.setMood("Happy");
	}
	
}
