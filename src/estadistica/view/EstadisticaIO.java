package estadistica.view;

import java.util.Scanner;

import estadistica.entity.Estadistica;
import view.InputTypes;

public class EstadisticaIO {

	public static Estadistica ingresar(Scanner scanner) {
		int codigoEstadistica =
				InputTypes.readInt("Ingrese el código de la tabla de estadisticas: ", scanner);
		String codigoTarjetas =
				InputTypes.readString("Ingrese los codigos de las tarjetas que se sacaron: ", scanner);
		String codigoEquipos =
				InputTypes.readString("Ingrese los codigos de los 2 equipos que jugaron	", scanner);
		String disparos =
				InputTypes.readString("Ingrese los disparos de los dos equipos : ", scanner);
		String posesion =
				InputTypes.readString("Ingrese la posesion de los dos equipos: ", scanner);
		String tirosLibres =
				InputTypes.readString("Ingrese los tiros libres de los dos equipos: ", scanner);
		String corners =
				InputTypes.readString("Ingrese los corners ejecutados por los dos equipos: ", scanner);
		String penales =
				InputTypes.readString("Ingrese el numero de penales: ",	scanner);
		String fueraDeJuego =
				InputTypes.readString("Ingrese los fuera de juego de los 2 equipos: ", scanner);
		String goles =
				InputTypes.readString("Ingrese los goles marcados por los " , scanner);
		String codigoCambios =
				InputTypes.readString("Ingrese los codigos de todos los cambios en el partido: ", scanner);
		
		return new Estadistica(codigoEstadistica,codigoTarjetas,codigoEquipos, disparos,posesion,
				tirosLibres,corners,penales, fueraDeJuego, goles, codigoCambios);

		}
}
