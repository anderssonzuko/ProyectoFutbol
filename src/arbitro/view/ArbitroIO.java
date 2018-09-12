package arbitro.view;

import java.util.Scanner;

import arbitro.entity.Arbitro;
import view.InputTypes;

public class ArbitroIO {

	public static Arbitro ingresar(Scanner scanner) {
		int codigoArbitro = 
				InputTypes.readInt("Ingrese el c�digo del arbitro: ", scanner);
		int codigoPartido = 
				InputTypes.readInt("Ingrese el codigo del partido que dirigi�: ", scanner);
		int DNI =
				InputTypes.readInt("DNI del arbitro: ", scanner);
		String nombre = 
				InputTypes.readString("Ingrese el nombre del arbitro: ", scanner);
		String fechaNacimiento =
				InputTypes.readString("Fecha de nacimineto: ", scanner);
		String nacionalidad =
				InputTypes.readString("Nacionalidad: ", scanner);
		
		
		return new Arbitro(codigoArbitro, codigoPartido, DNI, nombre, fechaNacimiento, nacionalidad);
		
	}
}
