package ejercicio2;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		
		Single aClient = new Single("Juan", 2000);
				
		//Punto 1
		Pack aPackage = new Pack("paquete1", 25, 500);
		aClient.buyPackage(aPackage);
		
		Pack aPackage2 = new Pack("paquete2", 20, 2, 50);
		aClient.buyPackage(aPackage2);
		
		System.out.println(aClient.amountPackages());
		System.out.println(aClient.totalExpended());
		
		
		
		//Punto 2
		//TODO como obtener el nombre de la instancia?
		System.out.println(aClient.mostExpensePackage());
		
		
		//Punto 3
			//Prueba 1
			Company company = new Company("Despegar", 0);
			Pack pack1 = new Pack("Brasil", 20, 2000);
			Pack pack2 = new Pack("Europa", 15, company);
			Pack pack3 = new Pack("Australia", 50, 100, 4);
			
			
			ArrayList<Pack> arrayTest = new ArrayList<Pack>();
			arrayTest.add(pack1);
			arrayTest.add(pack2);
			arrayTest.add(pack3);
			
			company.buyPackages(arrayTest);
			
			System.out.println(company.getBalance());
			
			//Prueba 2
			Single person = new Single("Rob", 5000);
			
			Pack packSingle = new Pack("Basico", 50, 2000);
			
			person.reservePackage(packSingle);

			System.out.println(person.getBalance());
			
			person.buyReservedPackage(packSingle);

			System.out.println(person.getBalance());
			
			
			//Compra un paquete que nunca reservo
			person.buyReservedPackage(pack1);
		
		

		
	}

}
