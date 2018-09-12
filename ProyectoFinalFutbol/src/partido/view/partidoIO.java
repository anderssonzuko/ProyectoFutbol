package partido.view;

import java.util.Scanner;

import jugador.entity.Jugador;
import partido.entity.Partido;
import view.InputTypes;

public class partidoIO {
	
public static Partido ingresar(Scanner scanner) {
		
		int codigoPartido = 
				InputTypes.readInt("Ingrese el código del partido: ", scanner);
		int codigoEquipo1 = 
				InputTypes.readInt("Ingrese el codigo del  equipo 1 : ", scanner);
		int codigoEquipo2 =
				InputTypes.readInt("ingrese el codigo del  equipo 2: ", scanner);
		int codigoArbitro = 
				InputTypes.readInt("INgrese el codigo del arbrito: ", scanner);
		int codigoEstadistica =
				InputTypes.readInt("Ingrese el codigo de las estadisticas: ", scanner);
		String fecha =
				InputTypes.readString("Ingrese la fecha de partido: ", scanner);
		String estadio =
				InputTypes.readString("Ingrese el estadio: ", scanner);
		String ciudad = 
				InputTypes.readString("INgrese la ciudad que se jugara: ", scanner);
	
		
		
		return new Partido(codigoPartido, codigoEquipo1, codigoEquipo2, 
				codigoArbitro, codigoEstadistica, fecha, estadio,ciudad);
		
	}

}
