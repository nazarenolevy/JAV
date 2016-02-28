package neflis;

public abstract class Content {

	protected int duration;
	protected String genre;
	
	public abstract boolean hasBeenViewed(User aUser);
	
	public abstract int duration();
	
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
}
