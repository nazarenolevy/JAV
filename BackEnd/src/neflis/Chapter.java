package neflis;


public class Chapter implements Viewable {

	private int duration;
	private int chapterNumber;
	private Season season;

	public Chapter(int aChapterNumber, int aDuration){
		duration = aDuration;
		chapterNumber = aChapterNumber;
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
	
}
