package ejercicio2;

public class PackageRooms implements StrategyBasePrice{

	private int amountRooms;
	private double roomPrice;

	public PackageRooms(int anAmountRooms, double aRoomPrice){
		amountRooms = anAmountRooms;
		roomPrice = aRoomPrice;
		
	}
	
	public double calculateBasePrice(){
		return amountRooms*roomPrice;
	}

}
