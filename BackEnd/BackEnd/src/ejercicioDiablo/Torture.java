package ejercicioDiablo;

import java.util.HashSet;

public class Torture implements Mission {

	private HashSet<Place> places = new HashSet<Place>();

	public boolean canDoMission(Demon aDemon) {

		for (Place aPlace : places) {
			int amountCrazyTorture = 0;
			for (Soul aSoul : aPlace.getSouls()) {

				if (aDemon.canGoCrazy(aSoul)) {
					amountCrazyTorture++;
				}
			}

			if (amountCrazyTorture == 0) {
				return false;
			}

		}

		return true;

	}

}
