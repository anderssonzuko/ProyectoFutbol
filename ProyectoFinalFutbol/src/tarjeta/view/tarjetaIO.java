package tarjeta.view;

import java.util.Scanner;

import partido.entity.Partido;
import tarjeta.entity.Tarjeta;
import view.InputTypes;

public class tarjetaIO {
	
public static Tarjeta ingresar(Scanner scanner) {
		
		int codigoTarjeta = 
				InputTypes.readInt("Ingrese el código de la tarjeta: ", scanner);
	
		int codigoJugador =
				InputTypes.readInt("ingrese el codigo del jugador: ", scanner);
		int codigoPartido = 
				InputTypes.readInt("INgrese el codigo del arbrito: ", scanner);
		String tipo =
				InputTypes.readString("Ingrese el tipo de tarjeta: ", scanner);
		int montoMulta =
				InputTypes.readInt("Ingrese el monto de multa: ", scanner);
	
		
		return new Tarjeta(codigoTarjeta, codigoJugador, codigoPartido, 
				tipo, montoMulta);
		
	}


}
