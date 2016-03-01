package neflis;

import java.util.HashSet;

public abstract class Content {

	protected int duration;
	protected String genre;
	protected HashSet<Actor> actors = new HashSet<Actor>();
	
	public abstract boolean hasBeenViewed(User aUser);
	
	public abstract int duration();
	
	public abstract boolean hasTheActor(Actor actor);
	
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}

	public HashSet<Actor> getActors() {
		return actors;
	}

	public void setActors(HashSet<Actor> actors) {
		this.actors = actors;
	}
	
	
	
	
	
}
