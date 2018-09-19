package partido.view;

import java.util.Scanner;

import partido.entity.Partido;
import view.InputTypes;

public class PartidoIO {
	
	public static Partido ingresar(Scanner scanner) {
		
		int codigoPartido =
				InputTypes.readInt("El codigo del partido se generará solo, de igual manera agregar cualquier numero para avanzar: ", scanner);
		int codigoEquipo1 =
				InputTypes.readInt("Ingrese el codigo del equipo local: ", scanner);
		int codigoEquipo2 = 
				InputTypes.readInt("Ingrese el codigo del equipo visitante: ", scanner);
		int codigoArbitro = 
				InputTypes.readInt("Ingrese el codigo del arbitro que dirigio el partido: ", scanner);
		int codigoEstadistica = 
				InputTypes.readInt("Ingrese el codigo de la tabla de estadisticas: ", scanner);
		String fecha =
				InputTypes.readString("Ingrese la fecha del partido: ", scanner);
		String estadio =
				InputTypes.readString("Ingrese el estadio donde se jugó el partido: ", scanner);
		String ciudad =
				InputTypes.readString("Ingrese la ciudad donde se jugó: ", scanner);
		
		return new Partido(codigoPartido, codigoEquipo1, codigoEquipo2, codigoArbitro, codigoEstadistica,
				fecha, estadio, ciudad);
	}

}
