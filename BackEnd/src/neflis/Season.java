package neflis;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Season {

	private int seasonNumber;
	private List<Chapter> chapters = new LinkedList<Chapter>();
	private Serie serie;

	public Season(int aSeasonNumber, List<Chapter> aListChapter) {
		chapters = aListChapter;
		seasonNumber = aSeasonNumber;
		
		for(Chapter aChapter : chapters){
			aChapter.belongs(this);
		}
	}

	public List<Chapter> getChapter() {
		return chapters;
	}

	
	
	public List<Chapter> getChapters() {
		return chapters;
	}

	public void setChapters(List<Chapter> chapters) {
		this.chapters = chapters;
	}

	public Serie getSerie() {
		return serie;
	}

	public void setSerie(Serie serie) {
		this.serie = serie;
	}

	public void setSeasonNumber(int seasonNumber) {
		this.seasonNumber = seasonNumber;
	}

	public int getSeasonNumber() {
		return seasonNumber;
	}

	public void listSeasonNumber(int seasonNumber) {
		this.seasonNumber = seasonNumber;
	}

	public void addChapter(Chapter chapter) {
		chapters.add(chapter);
		chapter.belongs(this);
	}

	public boolean hasBeenViewed(User aUser) {
		Iterator<Chapter> chaptersIterator = chapters.iterator();
		boolean viewed = true;

		while (viewed && chaptersIterator.hasNext()) {
			Chapter aChapter = chaptersIterator.next();
			viewed = aUser.haveYouSeenMe(aChapter);

		}

		return viewed;
	}

	public int getDuration() {
		int totalDuration = 0;

		for (Chapter aChapter : chapters) {
			totalDuration = totalDuration + aChapter.getDuration();
		}

		return totalDuration;
	}

	public Chapter lastAvailableChapter() {

		Chapter lastChapter = chapters.get(chapters.size() - 1);

		return lastChapter;

	}
	
	public void belongs(Serie aSerie){
		serie = aSerie;
	}
	
	public String getGenre(){
		return serie.getGenre();
	}

}
