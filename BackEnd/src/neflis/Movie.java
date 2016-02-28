package neflis;

import java.util.HashSet;

public class Movie extends Content implements Viewable {

	private int duration;
	private HashSet<Actor> actors = new HashSet<Actor>();
	
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
	
	
}
