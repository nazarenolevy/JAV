package ejercicioDiablo;

public class ShadowsDemon extends Demon{
	
	
	public ShadowsDemon(int anEvilLevel, String state) {
		evilLevel = anEvilLevel;
		super.setMood(state);
	}
	
	private static int CourageLimit;

	public static int getCourageLimit() {
		return CourageLimit;
	}

	public static void setCourageLimit(int courageLimit) {
		CourageLimit = courageLimit;
	}
	
	@Override
	public boolean verifyHunt(Soul aSoul){
		return super.verifyHunt(aSoul) && (aSoul.getCourage() < CourageLimit);
	}
	
	@Override
	public void tortureSoul(Soul aSoul){
		super.reduceGoodnessLevel(aSoul);
		aSoul.divideToHalfCourage();
	}
}
