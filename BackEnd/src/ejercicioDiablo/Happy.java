package ejercicioDiablo;

public class Happy implements StateMood{

	private static Happy instance;
	private final double multiplicator = 0.5;
	
	public Happy(){}
	
	public static Happy getInstance(){
		if(instance == null){
			instance = new Happy();
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
		aDemon.setEvilLevel(aDemon.getEvilLevel() + 5);
	}
	
}
