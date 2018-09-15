package tarjeta.view;

import java.sql.SQLException;
import java.util.Scanner;

import jugador.entity.NoExisteJugador;
import partido.entity.NoExistePartido;
import tarjeta.entity.NoExisteTarjeta;
import tarjeta.entity.Tarjeta;
import view.InputTypes;

public class Menu {
	
	public static int encabezado(Scanner scanner) {
		int opcion;

		while (true) {
			System.out.println("Ingrese una opcion: ");
			System.out.println("------------------- ");
			System.out.println("1. Ingresar Tarjeta");
			System.out.println("2. Listar Tarjeta");
			System.out.println("3. Eliminar Tarjeta");
			System.out.println("4. Modificar Tarjeta");
			System.out.println("0. Salir");
			System.out.println();

			opcion = InputTypes.readInt("¿Su opción? ", scanner);

			if (opcion >= 0 && opcion <= 4) {
				return opcion;
			}
		}
	}

	public static void menu(Scanner scanner, TarjetasIO tarjetasIO) throws NoExisteTarjeta, SQLException, NoExisteJugador, NoExistePartido {
		boolean salir = false;
		while (!salir) {
			switch (encabezado(scanner)) {
			case 0:
				salir = true;
				break;
			case 1:
				try {
					tarjetasIO.add();
				} catch (NoExisteJugador e) {
					System.out.println();
					System.out.println("No existe el jugador!");
					System.out.println();
				} catch (NoExistePartido e) {
					System.out.println();
					System.out.println("No existe el partido");
					System.out.println();
				}
				break;
			case 2:
				try {
					tarjetasIO.list();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
			case 3:
				tarjetasIO.delete();
				break;
			case 4:
				tarjetasIO.update();
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
			System.out.println("3. Modificar tipo");
			System.out.println("4. Modificar monto de multa");
			System.out.println("5. Modificar minuto");
			System.out.println("0. Salir");
			System.out.println();

			opcion = InputTypes.readInt("¿Su opción? ", scanner);

			if (opcion >= 0 && opcion <= 5) {
				return opcion;
			}
		}
	}

	
	public static void menuModificar(Scanner scanner, Tarjeta tarjeta) {
		boolean salir = false;

		while (!salir) {
			switch (encabezadoModificar(scanner)) {
			case 0:
				salir = true;
				break;
			case 1:
				tarjeta.setCodigoJugador(InputTypes.readInt("Ingresar nuevo codigo de jugador: ", scanner));
				break;
			case 2: 
				tarjeta.setCodigoPartido(InputTypes.readInt("Ingresar nuevo codigo de partido: ", scanner));
				break;
			case 3:
				tarjeta.setTipo(InputTypes.readString("Ingresar nuevo tipo de tarjeta: ", scanner));
				break;
			case 4:
				tarjeta.setMontoMulta(InputTypes.readDouble("Ingresar nuevo monto de multa: ", scanner));
				break;
			case 5:
				tarjeta.setMinuto(InputTypes.readInt("Ingresar nuevo minuto: ", scanner));
				break;
			}
		}
	}


}
