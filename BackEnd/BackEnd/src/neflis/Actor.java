package neflis;

public class Actor {

	private String name;

	public Actor(String aName) {
		name = aName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean actedIn(Content aContent) {
		return aContent.hasTheActor(this);
	}

}
