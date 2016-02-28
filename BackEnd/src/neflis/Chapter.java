package neflis;

import java.util.HashSet;

public class Chapter implements Viewable {

	private int duration;
	private int chapterNumber;
	private Season season;
	private HashSet<Actor> invitedActors = new HashSet<Actor>();

	public Chapter(int aChapterNumber, int aDuration){
		duration = aDuration;
		chapterNumber = aChapterNumber;
	}
	

	public Chapter(int aChapterNumber, int aDuration, HashSet<Actor> setInvitedActors){
		duration = aDuration;
		chapterNumber = aChapterNumber;
		invitedActors = setInvitedActors;
		
	}
	
	


	public void belongs(Season aSeason){
		season = aSeason;
	}
	
	

	public Season getSeason() {
		return season;
	}

	public void setSeason(Season season) {
		this.season = season;
	}



	public int getChapterNumber() {
		return chapterNumber;
	}

	public void setChapterNumber(int chapterNumber) {
		this.chapterNumber = chapterNumber;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public String getGenre(){
		return season.getGenre();
	}
	
	public boolean hasTheGenre(String genre){
		return genre == this.getGenre();
	}
	
	public boolean hasTheActor(Actor actor){
		return invitedActors.contains(actor);
	}
	
}
