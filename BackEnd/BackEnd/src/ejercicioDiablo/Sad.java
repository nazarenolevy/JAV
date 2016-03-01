package ejercicioDiablo;

public class Sad implements StateMood{

	private static Sad instance;
	private final double multiplicator = 2;
	
	public Sad(){}
	
	public static Sad getInstance(){
		if(instance == null){
			instance = new Sad();
		}
		
		return instance;
	}
	
	public boolean verifyHunt(Demon aDemon, Soul aSoul){
		return (aDemon.getEvilLevel() * multiplicator) > aSoul.getGoodnessLevel();
	}
	
	public void setChill(Soul aSoul){
		
	}
	
	public void setNewState(Demon aDemon){
		aDemon.setMood("Sad");
	}
	
	
}
