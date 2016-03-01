package neflis;


import java.util.HashSet;
import java.util.LinkedList;

public class AppNeflis {

	public static void main(String[] args) {
		
		Chapter ch0101 = new Chapter(1, 100);
		Chapter ch0102 = new Chapter(2,50);
		Chapter ch0201 = new Chapter(1,10);
		
		LinkedList<Chapter> aListChapter1 = new LinkedList<Chapter>();
		LinkedList<Chapter> aListChapter2 = new LinkedList<Chapter>();
		
		
	
		aListChapter1.add(ch0101);
		aListChapter1.add(ch0102);		
		
		aListChapter2.add(ch0201);
		
		
		Season s1 = new Season(1,aListChapter1);
		Season s2 = new Season(2,aListChapter2);
		
		LinkedList<Season> aListSeason = new LinkedList<Season>();
		aListSeason.add(s1);
		aListSeason.add(s2);
		

		Actor act3 = new Actor("De niro");
		Actor act4 = new Actor("Di caprio");
		HashSet<Actor> invitedActors = new HashSet<Actor>();
		HashSet<Actor> setActors2 = new HashSet<Actor>();
		invitedActors.add(act3);
		setActors2.add(act4);
		
		Serie aSerie = new Serie(aListSeason, "Terror", setActors2);
		
		Actor act1 = new Actor("Rob");
		Actor act2 = new Actor("Matt");
		HashSet<Actor> setActors = new HashSet<Actor>();
		setActors.add(act1);
		setActors.add(act2);
		
		Movie film = new Movie(1000, setActors, "Accion");
		
		
		
		User aUser = new User();
		aUser.view(ch0101);
		aUser.view(ch0102);
		aUser.view(ch0201);
		aUser.view(film);
		
		System.out.println(aUser.hasViewedContent(aSerie));

		System.out.println(aUser.hasViewedContent(film));
		
		
		System.out.println(aSerie.duration());

		System.out.println(film.duration());
		
		System.out.println(aSerie.lastAvailableChapter().getChapterNumber());
		
		System.out.println(aUser.viewedGenres());
		
		System.out.println(aUser.favouriteGenre());
		
		System.out.println(film.hasTheActor(act2));
		

	}

}
