package MenuPartidos;

import java.util.Scanner;

public class MenuPartidos {

	public static int encabezado(Scanner scanner) {
		int opcion;

		while (true) {
			System.out.println("Ingrese una opcion: ");
			System.out.println("------------------- ");
			System.out.println("1. Ingresar Partido");
			System.out.println("2. Listar Partido");
			System.out.println("3. Eliminar Partido");
			System.out.println("4. Modificar Partido");
			System.out.println("0. Salir");
			System.out.println();

			opcion = InputTypes.readInt("¿Su opción? ", scanner);

			if (opcion >= 0 && opcion <= 4) {
				return opcion;
			}
		}
	}

	public static void menu(Scanner scanner, PartidosIO partidosIO, Menu menu) throws NoExistePartido, SQLException, NoExisteArbitro, NoExisteEstadistica {
		boolean salir = false;
		while (!salir) {
			switch (encabezado(scanner)) {
			case 0:
				salir = true;
				break;
			case 1:
				try {
					partidosIO.add();
				} catch (NoExisteArbitro e) {
					System.out.println();
					System.out.println("No existe el arbitro!");
					System.out.println();
				} catch (NoExisteEstadistica e) {
					System.out.println();
					System.out.println("No existe la tabla de estadisticas");
					System.out.println();
				}
				break;
			case 2:
				try {
					partidosIO.list();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
			case 3:
				partidosIO.delete();
				break;
			case 4:
				partidosIO.update();
				break;
			}
		}
	}
	
	private static int encabezadoModificar(Scanner scanner) {
		int opcion;

		while (true) {
			System.out.println("Ingrese una opcion: ");
			System.out.println("------------------- ");
			System.out.println("1. Modificar codigo equipo 1");
			System.out.println("2. Modificar codigo equipo 2");
			System.out.println("3. Modificar codigo arbitro");
			System.out.println("4. Modificar codigo estadistica");
			System.out.println("5. Modificar fecha");
			System.out.println("6. Modificar estadio");
			System.out.println("7. Modificar ciudad");
			System.out.println("0. Salir");
			System.out.println();

			opcion = InputTypes.readInt("¿Su opción? ", scanner);

			if (opcion >= 0 && opcion <= 7) {
				return opcion;
			}
		}
	}

	
	public static void menuModificar(Scanner scanner, Partido partido) {
		boolean salir = false;

		while (!salir) {
			switch (encabezadoModificar(scanner)) {
			case 0:
				salir = true;
				break;
			case 1:
				partido.setCodigoEquipo1(InputTypes.readInt("Ingresar codigo del nuevo equipo 1: ", scanner));
				break;
			case 2: 
				partido.setCodigoEquipo2(InputTypes.readInt("Ingresar codigo del nuevo equipo 2: ", scanner));
				break;
			case 3:
				partido.setCodigoArbitro(InputTypes.readInt("Ingresar codigo del arbitro: ", scanner));
				break;
			case 4:
				partido.setCodigoEstadistica(InputTypes.readInt("Ingresar codigo de la nueva tabla de estadisticas: ", scanner));
				break;
			case 5:
				partido.setFecha(InputTypes.readString("Ingresar la nueva fecha: ", scanner));
				break;
			case 6:
				partido.setEstadio(InputTypes.readString("Ingresar nuevo estadio: ", scanner));
				break;
			case 7:
				partido.setCiudad(InputTypes.readString("Ingresar la nueva ciudad: ", scanner));
				break;
			}
		}
	}
	//inge falta llamar input .... y los otros por partes hicims parte de partidosio luciano al unir se importara BIBLIOTECA attm.ANDERSSONZURITA
}
