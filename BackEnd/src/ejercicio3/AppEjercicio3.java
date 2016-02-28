package ejercicio3;


public class AppEjercicio3 {

	public static void main(String[] args) {
		
		Single aClient = new Single("Juan", 2000);
				
		//Punto 1
		Pack aPackage = new Pack("paquete1", 25, 1);
		Pack aPackage2 = new Pack("paquete3", 25, 1);
		
		try{
			aClient.reservePackage(aPackage);
			aClient.buyReservedPackage(aPackage2);
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			System.out.println(aClient.getBalance());
		}
		
	}
		
}
