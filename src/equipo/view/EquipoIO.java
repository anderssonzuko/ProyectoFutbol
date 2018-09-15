package equipo.view;

import java.util.Scanner;

import equipo.entity.Equipo;
import view.InputTypes;

public class EquipoIO {

	public static Equipo ingresar(Scanner scanner) {
		int codigoEquipo =
				InputTypes.readInt("Ingrese el código del Equipo: ", scanner);
		String nombre =
				InputTypes.readString("Ingrese el nombre del equipo: ", scanner);
		String ciudad =
				InputTypes.readString("Ingrese el nombre de la ciudad: ", scanner);
		int presupuesAnual =
				InputTypes.readInt("Ingrese presupuesto anual del equipo: ", scanner);
		
		
		return new Equipo(codigoEquipo, nombre, ciudad, presupuesAnual);
		}
}
