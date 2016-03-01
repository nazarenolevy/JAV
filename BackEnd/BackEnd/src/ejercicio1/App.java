package ejercicio1;

public class App {

	public static void main(String[] args) {
		
		Client aClient = new Client("Juan", 2000);
		
		//Punto 1
		System.out.println(aClient.getBalance());
		
		//Punto 2
			//Prueba 1
			PackageClassic packageClassic = new PackageClassic(500);
			Package aPackage = new Package("paquete1", 25, packageClassic);
			aClient.buyPackage(aPackage);
			
			System.out.println(aClient.getBalance());
		
			//Prueba 2
			aClient.setBalance(2000);
			PackageClassic packageClassic2 = new PackageClassic(100);
			Package aPackage2 = new Package("paquete2", 10, packageClassic2);
			aClient.buyPackage(aPackage2);
			
			System.out.println(aClient.getBalance());
			
			
		//Punto 3
			//Prueba 2
			PackageRooms packageRooms = new PackageRooms(2, 50);
			Package aPackage3 = new Package("paqueteMardel", 20, packageRooms);
			
			System.out.println(aPackage3.getTotalPrice());
			
			aPackage3.setStrategy(new PackageClassic(200));
			
			System.out.println(aPackage3.getTotalPrice());
			
			
			//Prueba 3
			aClient.setBalance(2000);
			PackageBalance packageBalance = new PackageBalance(aClient);
			Package aPackage4 = new Package("paquete3", 30, packageBalance);
			
			aClient.buyPackage(aPackage4);
			
			System.out.println(aClient.getBalance());
			
			
		
		
		

	}

}
