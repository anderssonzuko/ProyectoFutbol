package equipo.view;

import java.util.Scanner;

import arbitro.entity.Arbitro;
import equipo.entity.Equipo;
import view.InputTypes;

public class EquipoIO {
	
	public static Equipo ingresar(Scanner scanner) {
		
		int codigoEquipo = 
				InputTypes.readInt("Ingrese el código del Equipo: ", scanner);
		int codigoJugador = 
				InputTypes.readInt("Ingrese el codigo del jugador: ", scanner);
		String nombre =
				InputTypes.readString("Ingrese el nombre del equipo: ", scanner);
		String ciudad = 
				InputTypes.readString("Ingrese el nombre del ciudad: ", scanner);
		int presupuesAnual =
				InputTypes.readInt("Ingrese presupuesto anual del equipo: ", scanner);
		
		
		
		return new Equipo(codigoEquipo, codigoJugador, nombre, ciudad, presupuesAnual);
		
	}
	
}
