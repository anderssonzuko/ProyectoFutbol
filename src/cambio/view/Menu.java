package cambio.view;

import java.sql.SQLException;
import java.util.Scanner;

import cambio.entity.Cambio;
import cambio.entity.NoExisteCambio;
import jugador.entity.NoExisteJugador;
import partido.entity.NoExistePartido;
import view.InputTypes;

public class Menu {
	
	public static int encabezado(Scanner scanner) {
		int opcion;

		while (true) {
			System.out.println("Ingrese una opcion: ");
			System.out.println("------------------- ");
			System.out.println("1. Ingresar Cambio");
			System.out.println("2. Listar Cambio");
			System.out.println("3. Eliminar Cambio");
			System.out.println("4. Modificar Cambio");
			System.out.println("0. Salir");
			System.out.println();

			opcion = InputTypes.readInt("¿Su opción? ", scanner);

			if (opcion >= 0 && opcion <= 4) {
				return opcion;
			}
		}
	}

	public static void menu(Scanner scanner, CambiosIO cambiosIO, Menu menu) throws NoExisteCambio, SQLException, NoExistePartido, NoExisteJugador {
		boolean salir = false;

		while (!salir) {
			switch (encabezado(scanner)) {
			case 0:
				salir = true;
				break;
			case 1:
				try {
					cambiosIO.add();
				} catch(NoExisteJugador e) {
					System.out.println();
					System.out.println("No existe el jugador");
					System.out.println();
				}
				catch (NoExistePartido e) {
					System.out.println();
					System.out.println("No existe el partido!");
					System.out.println();
				}
				break;
			case 2:
				try {
					cambiosIO.list();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
			case 3:
				cambiosIO.delete();
				break;
			case 4:
				cambiosIO.update();
				break;
			}
		}
	}
	
	private static int encabezadoModificar(Scanner scanner) {
		int opcion;

		while (true) {
			System.out.println("Ingrese una opcion: ");
			System.out.println("------------------- ");
			System.out.println("1. Modificar codigo jugador");
			System.out.println("2. Modificar codigo partido");
			System.out.println("3. Modificar minuto");
			System.out.println("0. Salir");
			System.out.println();

			opcion = InputTypes.readInt("¿Su opción? ", scanner);

			if (opcion >= 0 && opcion <= 3) {
				return opcion;
			}
		}
	}
	
	public static void menuModificar(Scanner scanner, Cambio cambio) {
		boolean salir = false;

		while (!salir) {
			switch (encabezadoModificar(scanner)) {
			case 0:
				salir = true;
				break;
			case 1:
				cambio.setCodigoJugador(InputTypes.readInt("Ingrese el nuevo codigo de jugador: ", scanner));
				break;
			case 2:
				cambio.setCodigoPartido(InputTypes.readInt("Ingrese el nuevo codigo del partido: ", scanner));
				break;
			case 3:
				cambio.setMinuto(InputTypes.readInt("Ingrese el nuevo minuto: ", scanner));
				break;
			}
		}
	}
}


