package ejercicioDiablo;

public class IceDemon extends Demon {

	public IceDemon(int anEvilLevel, String state) {
		evilLevel = anEvilLevel;
		super.setMood(state);
	}

	public boolean verifyHunt(Soul aSoul) {
		return aSoul.isChilly();
	}
	
	@Override
	public void tortureSoul(Soul aSoul){
		super.reduceGoodnessLevel(aSoul);
		mood.setChill(aSoul);
	}
	

}
