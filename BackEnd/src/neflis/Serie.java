package neflis;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Serie extends Content {

	private List<Season> seasons = new LinkedList<Season>();

	public Serie(List<Season> aListSeason, String aGenre) {
		seasons = aListSeason;
		genre = aGenre;
		
		for(Season aSeason : seasons){
			aSeason.belongs(this);
		}
	}
	

	public List<Season> getSeasons() {
		return seasons;
	}

	public void addSeason(Season season) {
		seasons.add(season);
		season.belongs(this);
	}

	public boolean hasBeenViewed(User aUser) {
		Iterator<Season> seasonIterator = seasons.iterator();
		boolean viewed = true;

		while (viewed && seasonIterator.hasNext()) {
			Season aSeason = seasonIterator.next();
			viewed = aSeason.hasBeenViewed(aUser);

		}

		return viewed;
	}

	public int duration() {
		int totalDuration = 0;
		for (Season aSeason : seasons) {
			totalDuration = totalDuration + aSeason.getDuration();
		}

		return totalDuration;
	}

	public Chapter lastAvailableChapter(){
		Chapter chapter = null;
		Iterator<Season> iteratorSeason = seasons.iterator();
	
		while(iteratorSeason.hasNext()){
			Season aSeason = iteratorSeason.next();
			if(aSeason.lastAvailableChapter() != null){
				chapter = aSeason.lastAvailableChapter();
			}
		}
		return chapter;
	}
	

}
