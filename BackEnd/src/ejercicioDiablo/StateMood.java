package ejercicioDiablo;

public interface StateMood {

	public boolean verifyHunt(Demon aDemon, Soul aSoul);

	public void setChill(Soul aSoul);
	
	public void setNewState(Demon aDemon);
	
}
