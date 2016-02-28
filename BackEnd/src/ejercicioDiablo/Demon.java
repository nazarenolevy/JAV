package ejercicioDiablo;

import java.util.HashSet;

public abstract class Demon {
	
	protected final int EVIL_GOODNESS_VALUE = 5;
	protected int evilLevel;
	protected HashSet<Soul> huntedSouls = new HashSet<Soul>();
	protected StateMood mood;

	
	public int getEvilLevel() {
		return evilLevel;
	}

	public void setEvilLevel(int evilLevel) {
		this.evilLevel = evilLevel;
	}

	public abstract boolean verifyHunt(Soul aSoul);

	public boolean verifyCraziness(Soul aSoul) {
		return (aSoul.getGoodnessLevel() - EVIL_GOODNESS_VALUE) < -10;
	}

	protected boolean checkEvilLevel(Soul aSoul) {
		return this.evilLevel > aSoul.getGoodnessLevel();
	}

	public abstract void tortureSoul(Soul aSoul);

	public void addHuntedSoul(Soul aSoul) {
		huntedSouls.add(aSoul);
	}

	public HashSet<Soul> huntableSouls(Place aPlace) {
		HashSet<Soul> huntableSouls = new HashSet<Soul>();

		for (Soul aSoul : aPlace.getSouls()) {
			if (this.verifyHunt(aSoul)) {
				huntableSouls.add(aSoul);
			}
		}

		return huntableSouls;
	}

	public void hunt(Place aPlace) {
		for (Soul aSoul : aPlace.getSouls()) {

			if (this.verifyHunt(aSoul)) {
				aPlace.removeSoul(aSoul);
				this.addHuntedSoul(aSoul);
			} else {
				this.tortureSoul(aSoul);
			}

			if(huntedSouls.size() >= 20){
				mood = new Happy();
			}
			
		}
	}

	public boolean canDoMission(Mission aMission) {
		if(aMission.canDoMission(this)){
			if(mood instanceof Sad){
				mood = new Normal();
			}else if(mood instanceof Normal){
				mood = new Happy();
			}else if(mood instanceof Happy){
				this.setEvilLevel(this.getEvilLevel() + 5);
			}
			
			return true;
		}else{
			return false;
		}
	}

	public boolean canGoCrazy(Soul aSoul) {

		return this.verifyCraziness(aSoul);
	}

	protected void reduceGoodnessLevel(Soul aSoul){
		aSoul.reduceGoodnessLevel(EVIL_GOODNESS_VALUE);
	}

	public void punishment(){
		evilLevel = evilLevel / 10;
		mood = new Sad();
	}
}
