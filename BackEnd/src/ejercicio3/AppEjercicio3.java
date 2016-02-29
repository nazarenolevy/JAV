package ejercicio3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppEjercicio3 {

	private static final Logger LOGGER = LoggerFactory.getLogger(AppEjercicio3.class);

	public static void main(String[] args) {

		Single aClient = new Single("Juan", 2000);

		// Punto 1
		Pack aPackage = new Pack("paquete1", 25, 1);
		Pack aPackage2 = new Pack("paquete3", 25, 1);

		try {
			aClient.reservePackage(aPackage);
			aClient.buyReservedPackage(aPackage);
		} catch (Exception e) {
			LOGGER.error("Error", e);
		} finally {

			LOGGER.info("Client balance remaining: {}", aClient.getBalance());

		}

	}

}
