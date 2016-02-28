package ejercicioDiablo;

public class AppHell {
	public static void main(String[] args) {
		Soul aSoul = new Soul(100, 50, true);
		Soul aSoul2 = new Soul(40, 0, true);
		Soul aSoul3 = new Soul(200, 30, false);
		
		Place aPlace = new Place();
		
		aPlace.addSoul(aSoul);
		aPlace.addSoul(aSoul2);
		aPlace.addSoul(aSoul3);
		
	
		
		
	}

}
