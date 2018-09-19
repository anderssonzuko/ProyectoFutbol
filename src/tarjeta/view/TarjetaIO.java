package tarjeta.view;

import java.util.Scanner;

import tarjeta.entity.Tarjeta;
import view.InputTypes;

public class TarjetaIO {
	
	public static Tarjeta ingresar(Scanner scanner) {
		
		int codigoTarjeta =
				InputTypes.readInt("El codigo de la tarjeta se generará solo, de igual manera agregar cualquier numero para avanzar: ", scanner);
		int codigoJugador =
				InputTypes.readInt("Ingrese el codigo del jugador al que fue sacada la tarjeta: ", scanner);
		int codigoPartido =
				InputTypes.readInt("Ingrese el codigo de partido donde se saco la tarjeta: ", scanner);
		String tipo =
				InputTypes.readString("Ingrese el tipo de tarjeta que es: ", scanner);
		double montoMulta =
				InputTypes.readDouble("Ingrese el monto de multa por la trjeta: ", scanner);
		int minuto = 
				InputTypes.readInt("Ingrese el minuto en que sacaron la tarjeta: ", scanner);
		
		return new Tarjeta(codigoTarjeta, codigoJugador, codigoPartido, tipo, montoMulta, minuto);
	}

}
