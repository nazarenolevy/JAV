package ejercicioDiablo;

public class Soul {

	private int goodnessLevel;
	private int courage;
	private boolean isChilly;
	
	public Soul(int aGoodnessLevel, int aCourage, boolean aChilly){
		goodnessLevel = aGoodnessLevel;
		courage = aCourage;
		isChilly = aChilly;
	}
	
	public int getGoodnessLevel() {
		return goodnessLevel;
	}
	public void setGoodnessLevel(int goodnessLevel) {
		this.goodnessLevel = goodnessLevel;
	}
	
	public void reduceGoodnessLevel(int anAmount){
		goodnessLevel = goodnessLevel - anAmount;
	}
	
	public int getCourage() {
		return courage;
	}
	public void setCourage(int courage) {
		this.courage = courage;
	}
	
	public void divideToHalfCourage(){
		courage = courage / 2;
	}
	
	public boolean isChilly() {
		return isChilly;
	}
	public void setChill(boolean chilly) {
		this.isChilly = chilly;
	}
	
	
	
	
}
