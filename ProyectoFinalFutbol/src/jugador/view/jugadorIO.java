package jugador.view;

import java.util.Scanner;

import arbitro.entity.Arbitro;
import jugador.entity.Jugador;
import view.InputTypes;

public class jugadorIO {

	public static Jugador ingresar(Scanner scanner) {
		
		int codigoJugador = 
				InputTypes.readInt("Ingrese el código del Jugador: ", scanner);
		int codigoPartido = 
				InputTypes.readInt("Ingrese el codigo del partido que dirigió: ", scanner);
		int DNI =
				InputTypes.readInt("DNI del arbitro: ", scanner);
		String nombreCompleto = 
				InputTypes.readString("INgrese el nombre completo: ", scanner);
		String fechaNacimiento =
				InputTypes.readString("Ingrese Fecha de nacimineto: ", scanner);
		int numeroPolera =
				InputTypes.readInt("Ingrese numero de polera: ", scanner);
		double sueldo =
				InputTypes.readDouble("Ingrese sueldo: ", scanner);
		String nacionalidad = 
				InputTypes.readString("INgrese el nombre completo: ", scanner);
		double altura =
				InputTypes.readDouble("Ingrese Fecha de nacimineto: ", scanner);
		double peso =
				InputTypes.readDouble("Ingrese numero de polera: ", scanner);
		
		
		
		return new Jugador(codigoJugador, codigoPartido, DNI, nombreCompleto, fechaNacimiento, numeroPolera, sueldo,nacionalidad,altura,peso);
		
	}
}
