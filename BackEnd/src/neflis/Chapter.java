package neflis;


public class Chapter implements Viewable {

	private int duration;
	private boolean isAvailable;
	private int chapterNumber;
	private Season season;

	public Chapter(int aChapterNumber, int aDuration, boolean available){
		duration = aDuration;
		isAvailable = available;
		chapterNumber = aChapterNumber;
	}
	
	public boolean isAvailable() {
		return isAvailable;
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

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
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
	
	//TODO como hacer esto..
	public String getGenre(){
		return season.getGenre();
	}
	
}
