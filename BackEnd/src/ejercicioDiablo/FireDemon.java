package ejercicioDiablo;

public class FireDemon extends Demon {

	public FireDemon(int anEvilLevel, String state) {
		evilLevel = anEvilLevel;
		super.setMood(state);
	}

	public boolean verifyHunt(Soul aSoul) {
		return super.verifyHunt(aSoul) && !aSoul.isChilly();
	}

	@Override
	public void tortureSoul(Soul aSoul) {
		super.reduceGoodnessLevel(aSoul);
		mood.setChill(aSoul);
	}

}
