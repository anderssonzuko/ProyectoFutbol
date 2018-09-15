package equipo.view;

import java.sql.SQLException;
import java.util.Scanner;

import equipo.entity.Equipo;
import equipo.entity.NoExisteEquipo;
import view.InputTypes;

public class Menu {
	
	public static int encabezado(Scanner scanner) {
		int opcion;

		while (true) {
			System.out.println("Ingrese una opcion: ");
			System.out.println("------------------- ");
			System.out.println("1. Ingresar Equipo");
			System.out.println("2. Listar Equipo");
			System.out.println("3. Eliminar Equipo");
			System.out.println("4. Modificar Equipo");
			System.out.println("0. Salir");
			System.out.println();

			opcion = InputTypes.readInt("¿Su opción? ", scanner);

			if (opcion >= 0 && opcion <= 4) {
				return opcion;
			}
		}
	}

	public static void menu(Scanner scanner, EquiposIO equiposIO) throws NoExisteEquipo, SQLException{
		boolean salir = false;

		while (!salir) {
			switch (encabezado(scanner)) {
			case 0:
				salir = true;
				break;
			case 1:
				equiposIO.add();
			case 2:
				try {
					equiposIO.list();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
			case 3:
				equiposIO.delete();
				break;
			case 4:
				equiposIO.update();
				break;
			}
		}
	}
	
	private static int encabezadoModificar(Scanner scanner) {
		int opcion;

		while (true) {
			System.out.println("Ingrese una opcion: ");
			System.out.println("------------------- ");
			System.out.println("1. Modificar nombre del equipo");
			System.out.println("2. Modificar ciudad de origen del equipo");
			System.out.println("3. Modificar presupuesto anual");
			System.out.println("0. Salir");
			System.out.println();

			opcion = InputTypes.readInt("¿Su opción? ", scanner);

			if (opcion >= 0 && opcion <= 3) {
				return opcion;
			}
		}
	}
	
	public static void menuModificar(Scanner scanner, Equipo equipo) {
		boolean salir = false;

		while (!salir) {
			switch (encabezadoModificar(scanner)) {
			case 0:
				salir = true;
				break;
			case 1:
				equipo.setNombre(InputTypes.readString("Ingrese el nuevo nombre del equipo: ", scanner));
				break;
			case 2:
				equipo.setCiudad(InputTypes.readString("Ingrese el nombre de la nueva ciudad: ", scanner));
				break;
			case 3:
				equipo.setPresupuestoAnual(InputTypes.readInt("Ingrese el nuevo presupuesto anual: ", scanner));
				break;
			}
		}
	}

}
