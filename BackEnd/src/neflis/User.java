package neflis;

import java.util.HashSet;

public class User {

	private HashSet<Viewable> viewedContent = new HashSet<Viewable>();

	public HashSet<Viewable> getViewedContent() {
		return viewedContent;
	}

	public void setViewedContent(HashSet<Viewable> viewedContent) {
		this.viewedContent = viewedContent;
	}

	public void view(Viewable aViewable) {
		viewedContent.add(aViewable);
	}

	public boolean hasViewedContent(Content aContent) {

		return aContent.hasBeenViewed(this);

	}

	public boolean haveYouSeenMe(Viewable aViewable) {
		return viewedContent.contains(aViewable);
	}

	public HashSet<String> viewedGenres() {
		HashSet<String> genres = new HashSet<String>();

		for (Viewable aViewable : viewedContent) {
			String genre = aViewable.getGenre();

			genres.add(genre);
		}

		return genres;
	}

	public String favouriteGenre() {
		int maxDuration = -1;
		String favouriteGenre = "";

		HashSet<String> favouriteGenres = this.viewedGenres();

		for (String genre : favouriteGenres) {
			for (Viewable aViewable : viewedContent) {
				int totalDuration = 0;
				if (aViewable.hasTheGenre(genre)) {
					totalDuration = totalDuration + aViewable.getDuration();
				}

				if (totalDuration > maxDuration) {
					maxDuration = totalDuration;
					favouriteGenre = aViewable.getGenre();
				}
			}
		}

		return favouriteGenre;

	}
	
	public boolean isFanOf(Actor actor){
		
	}

}