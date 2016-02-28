package neflis;

import java.util.HashSet;

public class Movie extends Content implements Viewable {

	private int duration;
	
	public Movie(int aDuration, HashSet<Actor> setActors, String aGenre){
		duration = aDuration;
		actors = setActors;
		genre = aGenre;
	}
	
	public void addActor(Actor anActor){
		actors.add(anActor);
	}
	
	public boolean hasBeenViewed(User aUser){
		return aUser.haveYouSeenMe(this);
	}
	
	public int duration(){
		return this.duration;
	}
	
	public String genre(){
		return this.getGenre();
	}
	
	public int getDuration(){
		return duration;
	}
	
	public boolean hasTheGenre(String genre){
		return genre == this.getGenre();
	}
	
	public boolean hasTheActor(Actor actor){
		return actors.contains(actor);
	}
	
}
