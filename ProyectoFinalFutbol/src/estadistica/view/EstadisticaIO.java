package estadistica.view;

import java.util.Scanner;

import cambio.entity.Cambio;
import estadistica.entity.Estadistica;
import view.InputTypes;

public class EstadisticaIO {
	
	public static Estadistica ingresar(Scanner scanner) {
		
		int codigoEstadistica = 
				InputTypes.readInt("Ingrese el código del Cambio Respectivo: ", scanner);
		int codigoTarjeta = 
				InputTypes.readInt("Ingrese el codigo del Jugador que realizo el cambio: ", scanner);
		int codigoEquipo =
				InputTypes.readInt("Ingrese el Codigo del equipo que realizo el cambio: ", scanner);
		int codigoJugador = 
				InputTypes.readInt("Ingrese Codigo del Partido", scanner);
		int disparos =
				InputTypes.readInt("Ingrese el minuto que se realizo el cambio: ", scanner);
		
		int posesion = 
				InputTypes.readInt("Ingrese el código del Cambio Respectivo: ", scanner);
		int tirosLibres = 
				InputTypes.readInt("Ingrese el codigo del Jugador que realizo el cambio: ", scanner);
		int corners =
				InputTypes.readInt("Ingrese el Codigo del equipo que realizo el cambio: ", scanner);
		int penales = 
				InputTypes.readInt("Ingrese Codigo del Partido", scanner);
		int fueraDeJuego =
				InputTypes.readInt("Ingrese el minuto que se realizo el cambio: ", scanner);
		int goles =
				InputTypes.readInt("Ingrese el Codigo del equipo que realizo el cambio: ", scanner);
		int codigoCambio = 
				InputTypes.readInt("Ingrese Codigo del Partido", scanner);
	
		
		return new Estadistica(codigoEstadistica,codigoTarjeta,codigoEquipo, 
				codigoJugador,disparos,posesion,tirosLibres,corners,penales,
				fueraDeJuego,goles,codigoCambio);
		
	}
	
}
