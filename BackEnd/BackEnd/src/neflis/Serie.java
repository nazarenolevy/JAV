package neflis;


import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Serie extends Content {

	private List<Season> seasons = new LinkedList<Season>();

	public Serie(List<Season> aListSeason, String aGenre, HashSet<Actor> setActors) {
		seasons = aListSeason;
		genre = aGenre;
		actors = setActors;
		
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
		Season lastSeason = seasons.get(seasons.size() - 1);
	
		Chapter chapter = lastSeason.lastAvailableChapter();

		return chapter;
	}
	
	public boolean hasTheActor(Actor actor){
		if(actors.contains(actor)){
			return true;
		}else{
			
			boolean hasTheActor = false;
			Iterator<Season> seasonIterator = seasons.iterator();
			
			while(!hasTheActor && seasonIterator.hasNext()){
				Season aSeason = seasonIterator.next();
				hasTheActor = aSeason.hasTheActor(actor);
			}
			
			return hasTheActor;
		}
		
	}
	
	public HashSet<Actor> getActors(){
		return this.getActors();
	}

}
