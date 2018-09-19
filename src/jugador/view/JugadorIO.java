package jugador.view;

import java.util.Scanner;

import jugador.entity.Jugador;
import view.InputTypes;

public class JugadorIO {

	public static Jugador ingresar(Scanner scanner) {
		
		int codigoJugador =
				InputTypes.readInt("El codigo del jugador se generará solo, de igual manera agregar cualquier numero para avanzar: ", scanner);
		int codigoEquipo =
				InputTypes.readInt("Ingrese el codigo del equipo en que juega: ", scanner);
		int DNI =
				InputTypes.readInt("DNI del jugador: ", scanner);
		String nombreCompleto =
				InputTypes.readString("Ingrese el nombre completo del jugador: ", scanner);
		String fechaNacimiento =
				InputTypes.readString("Ingrese la fecha de nacimineto: ", scanner);
		int numeroPolera =
				InputTypes.readInt("Ingrese el numero de polera con el que juega: ", scanner);
		double sueldo =
				InputTypes.readDouble("Ingrese sueldo del jugador: ", scanner);
		String nacionalidad =
				InputTypes.readString("Ingrese la nacionalidad del jugador: ", scanner);
		double altura =
				InputTypes.readDouble("Ingrese altura del jugador: ", scanner);
		double peso =
				InputTypes.readDouble("Ingrese el peso del jugador: ", scanner);
		String pieHabil = 
				InputTypes.readString("Ingrese el pie habil del jugador: ", scanner);
		
		return new Jugador(codigoJugador, codigoEquipo, DNI,
		nombreCompleto, fechaNacimiento, numeroPolera,
		sueldo,nacionalidad,altura,peso, pieHabil);
		}
}
