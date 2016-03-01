package ejercicioDiablo;

import java.util.HashSet;

public class Place {
	
	private HashSet<Soul> souls = new HashSet<Soul>();
	
	
	public void addSoul(Soul aSoul){
		souls.add(aSoul);
	}
	
	public HashSet<Soul> getSouls() {
		return souls;
	}

	public void setSouls(HashSet<Soul> souls) {
		this.souls = souls;
	}
	
	public void removeSoul(Soul aSoul){
		souls.remove(aSoul);
	}
		
}
