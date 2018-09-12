package cambio.view;

import java.util.Scanner;

import cambio.entity.Cambio;
import view.InputTypes;

public class CambioIO {
	
	public static Cambio ingresar(Scanner scanner) {
		int codigoCambio = 
				InputTypes.readInt("Ingrese el código del Cambio Respectivo: ", scanner);
		int codigoJugador = 
				InputTypes.readInt("Ingrese el codigo del Jugador que realizo el cambio: ", scanner);
		int codigoEquipo =
				InputTypes.readInt("Ingrese el Codigo del equipo que realizo el cambio: ", scanner);
		int codigoPartido = 
				InputTypes.readInt("Ingrese Codigo del Partido", scanner);
		int Minuto =
				InputTypes.readInt("Ingrese el minuto que se realizo el cambio: ", scanner);
		
		
		
		return new Cambio(codigoCambio,codigoJugador,codigoEquipo, codigoPartido,Minuto);
		
	}
}
