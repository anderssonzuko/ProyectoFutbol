package arbitro.view;

import java.sql.SQLException;
import java.util.Scanner;

import arbitro.entity.Arbitro;
import arbitro.entity.NoExisteArbitro;
import partido.entity.NoExistePartido;
import view.InputTypes;

public class Menu {
	
	public static int encabezado(Scanner scanner) {
		int opcion;

		while (true) {
			System.out.println("Ingrese una opcion: ");
			System.out.println("------------------- ");
			System.out.println("1. Ingresar Arbitro");
			System.out.println("2. Listar Arbitro");
			System.out.println("3. Eliminar Arbitro");
			System.out.println("4. Modificar Arbitro");
			System.out.println("0. Salir");
			System.out.println();

			opcion = InputTypes.readInt("¿Su opción? ", scanner);

			if (opcion >= 0 && opcion <= 4) {
				return opcion;
			}
		}
	}

	public static void menu(Scanner scanner, ArbitrosIO arbitrosIO) throws NoExisteArbitro, SQLException, NoExistePartido {
		boolean salir = false;
		while (!salir) {
			switch (encabezado(scanner)) {
			case 0:
				salir = true;
				break;
			case 1:
				try {
					arbitrosIO.add();
				} catch (NoExistePartido e) {
					System.out.println();
					System.out.println("No existe el partido!");
					System.out.println();
				}
				break;
			case 2:
				try {
					arbitrosIO.list();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
			case 3:
				arbitrosIO.delete();
				break;
			case 4:
				arbitrosIO.update();
				break;
			}
		}
	}
	
	private static int encabezadoModificar(Scanner scanner) {
		int opcion;

		while (true) {
			System.out.println("Ingrese una opcion: ");
			System.out.println("------------------- ");
			System.out.println("1. Modificar codigo partido");
			System.out.println("2. Modificar DNI");
			System.out.println("3. Modificar nombre");
			System.out.println("4. Modificar fecha de nacimineto");
			System.out.println("5. Modificar nacionalidad");
			System.out.println("0. Salir");
			System.out.println();

			opcion = InputTypes.readInt("¿Su opción? ", scanner);

			if (opcion >= 0 && opcion <= 5) {
				return opcion;
			}
		}
	}
	
	public static void menuModificar(Scanner scanner, Arbitro arbitro) {
		boolean salir = false;

		while (!salir) {
			switch (encabezadoModificar(scanner)) {
			case 0:
				salir = true;
				break;
			case 1:
				arbitro.setCodigoPartido(InputTypes.readInt("Ingrese el nuevo codigo de partido: ", scanner));
				break;
			case 2:
				arbitro.setDNI(InputTypes.readInt("Ingrese el nuevo DNI: ", scanner));
				break;
			case 3:
				arbitro.setNombre(InputTypes.readString("Ingrese el nuevo hombre: ", scanner));
				break;
			case 4:
				arbitro.setFechaNacimiento(InputTypes.readString("Ingrese la nueva fecha de nacimiento: ", scanner));
				break;
			case 5:
				arbitro.setNacionalidad(InputTypes.readString("Ingrese la nueva nacionalidad: ", scanner));
				break;
			}
		}
	}
}
