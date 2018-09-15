package estadistica.view;

import java.sql.SQLException;
import java.util.Scanner;

import estadistica.entity.Estadistica;
import estadistica.entity.NoExisteEstadistica;
import view.InputTypes;

public class Menu {
	public static int encabezado(Scanner scanner) {
		int opcion;

		while (true) {
			System.out.println("Ingrese una opcion: ");
			System.out.println("------------------- ");
			System.out.println("1. Ingresar tabla de estadisticas");
			System.out.println("2. Listar tabla de estadisticas");
			System.out.println("3. Eliminar tabla de estadisticas");
			System.out.println("4. Modificar tabla de estadisticas");
			System.out.println("0. Salir");
			System.out.println();

			opcion = InputTypes.readInt("¿Su opción? ", scanner);

			if (opcion >= 0 && opcion <= 4) {
				return opcion;
			}
		}
	}

	public static void menu(Scanner scanner, EstadisticasIO estadisticasIO) throws NoExisteEstadistica, SQLException {
		boolean salir = false;
		while (!salir) {
			switch (encabezado(scanner)) {
			case 0:
				salir = true;
				break;
			case 1:
					estadisticasIO.add();
				break;
			case 2:
				try {
					estadisticasIO.list();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
			case 3:
				estadisticasIO.delete();
				break;
			case 4:
				estadisticasIO.update();
				break;
			}
		}
	}
	
	private static int encabezadoModificar(Scanner scanner) {
		int opcion;

		while (true) {
			System.out.println("Ingrese una opcion: ");
			System.out.println("------------------- ");
			System.out.println("1. Modificar codigo de tarjetas");
			System.out.println("2. Modificar codigo de los equipos");
			System.out.println("3. Modificar cantidad de disparos");
			System.out.println("4. Modificar posesion");
			System.out.println("5. Modificar cantidad de tiros libres");
			System.out.println("6. Modificar cantidad de corners");
			System.out.println("7. Modificar cantidad de penales");
			System.out.println("8. Modificar cantidad de fuera de juegos");
			System.out.println("9. Modificar cantidad de goles");
			System.out.println("10 Modificar codigo de cambios");
			System.out.println("0. Salir");
			System.out.println();

			opcion = InputTypes.readInt("¿Su opción? ", scanner);

			if (opcion >= 0 && opcion <= 10) {
				return opcion;
			}
		}
	}
	
	public static void menuModificar(Scanner scanner, Estadistica estadistica) {
		boolean salir = false;

		while (!salir) {
			switch (encabezadoModificar(scanner)) {
			case 0:
				salir = true;
				break;
			case 1:
				estadistica.setCodigoTarjetas(InputTypes.readString("Ingrese el nuevo codigo de las tarjetas: ", scanner));
				break;
			case 2:
				estadistica.setCodigoEquipos(InputTypes.readString("Ingrese el nuevo codigo de los equipos: ", scanner));
				break;
			case 3:
				estadistica.setDisparos(InputTypes.readString("Ingrese la nueva cantidad de disparos: ", scanner));
				break;
			case 4:
				estadistica.setPosesion(InputTypes.readString("Ingrese la nueva posesion de los equipos: ", scanner));
				break;
			case 5:
				estadistica.setTirosLibres(InputTypes.readString("Ingrese la nueva cantidad de tiros libres: ", scanner));
				break;
			case 6:
				estadistica.setCorners(InputTypes.readString("Ingrese la nueva cantidad de corners: ", scanner));
				break;
			case 7:
				estadistica.setPenales(InputTypes.readString("Ingrese la nueva cantidad de penales: ", scanner));
				break;
			case 8:
				estadistica.setFueraDeJuego(InputTypes.readString("Ingrese la nueva cantidad de fuera de juego: ", scanner));
				break;
			case 9:
				estadistica.setGoles(InputTypes.readString("Ingrese la nueva cantidad de cambios: ", scanner));
				break;
			case 10: 
				estadistica.setCodigoCambios(InputTypes.readString("Ingrese los nuevos codigos de cambio: ", scanner));
				break;
			}
		}
	}
}
