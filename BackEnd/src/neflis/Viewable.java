package neflis;

import java.util.HashSet;

public interface Viewable {
	
	public String getGenre();
	
	public int getDuration();
	
	public boolean hasTheGenre(String genre);
	
	public boolean hasTheActor(Actor actor);
	
	public HashSet<Actor> getActors();
}
