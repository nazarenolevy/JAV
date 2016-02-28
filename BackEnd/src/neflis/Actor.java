package neflis;

public class Actor {
	
	private String name;
	private boolean isPrincipal;
	
	public Actor(String aName, boolean principal){
		name = aName;
		isPrincipal = principal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isPrincipal() {
		return isPrincipal;
	}

	public void setPrincipal(boolean isPrincipal) {
		this.isPrincipal = isPrincipal;
	}
	
	

}
