package ejercicioDiablo;

import java.util.HashSet;

public abstract class Demon {

	protected final int EVIL_GOODNESS_VALUE = 5;
	protected int evilLevel;
	protected HashSet<Soul> huntedSouls = new HashSet<Soul>();
	protected StateMood mood;

	

	public abstract void tortureSoul(Soul aSoul);
	
	public boolean verifyHunt(Soul aSoul){
		return mood.verifyHunt(this, aSoul);
	}
	
	public void setMood(String state){
		if (state.equals("Happy")) {
			mood = Happy.getInstance();
		} else if (state.equals("Normal")) {
			mood = Normal.getInstance();
		} else if (state.equals("Sad")) {
			mood = Sad.getInstance();
		}
	}

	public int getEvilLevel() {
		return evilLevel;
	}

	public void setEvilLevel(int evilLevel) {
		this.evilLevel = evilLevel;
	}

	public boolean verifyCraziness(Soul aSoul) {
		return (aSoul.getGoodnessLevel() - EVIL_GOODNESS_VALUE) < -10;
	}

	
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

			if (huntedSouls.size() >= 20) {
				this.setHappyState();
			}

		}
	}

	public boolean canDoMission(Mission aMission) {
		if (aMission.canDoMission(this)) {
			mood.setNewState(this);
			return true;
		}else{
			return false;
		}
	}

	public boolean canGoCrazy(Soul aSoul) {

		return this.verifyCraziness(aSoul);
	}

	protected void reduceGoodnessLevel(Soul aSoul) {
		aSoul.reduceGoodnessLevel(EVIL_GOODNESS_VALUE);
	}

	public void punishment() {
		evilLevel = evilLevel / 10;
		this.setSadState();
	}

	public void setHappyState(){
		mood = Happy.getInstance();
	}
	
	public void setSadState(){
		mood = Sad.getInstance();
	}
	
	
}
