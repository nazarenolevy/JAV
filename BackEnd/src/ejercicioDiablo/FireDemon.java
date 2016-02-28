package ejercicioDiablo;

public class FireDemon extends Demon {

	public FireDemon(int anEvilLevel, StateMood state){
		evilLevel = anEvilLevel;
		mood = state;
	}
	
	
	public boolean verifyHunt(Soul aSoul) {
		return !aSoul.isChilly();
	}
	
	@Override
	public void tortureSoul(Soul aSoul){
		super.reduceGoodnessLevel(aSoul);
		aSoul.setChill(false);
	}

}
