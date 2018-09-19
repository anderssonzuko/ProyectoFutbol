package cambio.view;

import java.util.Scanner;

import cambio.entity.Cambio;
import view.InputTypes;

public class CambioIO {
	
	public static Cambio ingresar(Scanner scanner) {
		
		int codigoCambio = 
				InputTypes.readInt("El codigo del cambio se generará solo, de igual manera agregar cualquier numero para avanzar: ", scanner);
		int codigoJugador =
				InputTypes.readInt("Ingrese el codigo del jugador: ", scanner);
		int codigoPartido =
				InputTypes.readInt("Ingrese el codigo del partido: ", scanner);
		int minuto =
				InputTypes.readInt("Ingrese el minuto del cambio: ", scanner);
		
		return new Cambio(codigoCambio, codigoJugador, codigoPartido, minuto);
	}

}
