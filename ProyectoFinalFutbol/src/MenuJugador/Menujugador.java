package MenuJugador;

import java.util.Scanner;

public class Menujugador {

	public static int encabezado(Scanner scanner) {
		int opcion;

		while (true) {
			System.out.println("Ingrese una opcion: ");
			System.out.println("------------------- ");
			System.out.println("1. Ingresar Jugador");
			System.out.println("2. Listar Jugador");
			System.out.println("3. Eliminar Jugador");
			System.out.println("4. Modificar Jugador");
			System.out.println("0. Salir");
			System.out.println();

			opcion = InputTypes.readInt("¿Su opción? ", scanner);

			if (opcion >= 0 && opcion <= 4) {
				return opcion;
			}
		}
	}

	public static void menu(Scanner scanner, JugadoresIO jugadoresIO, Menu menu) throws NoExisteJugador, SQLException, NoExisteEquipo {
		boolean salir = false;
		while (!salir) {
			switch (encabezado(scanner)) {
			case 0:
				salir = true;
				break;
			case 1:
				try {
					jugadoresIO.add();
				} catch (NoExisteEquipo e) {
					System.out.println();
					System.out.println("No existe el Equipo!");
					System.out.println();
				}
				break;
			case 2:
				try {
					jugadoresIO.list();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
			case 3:
				jugadoresIO.delete();
				break;
			case 4:
				jugadoresIO.update();
				break;
			}
		}
	}
	
	private static int encabezadoModificar(Scanner scanner) {
		int opcion;

		while (true) {
			System.out.println("Ingrese una opcion: ");
			System.out.println("------------------- ");
			System.out.println("1. Modificar codigo equipo");
			System.out.println("2. Modificar DNI");
			System.out.println("3. Modificar nombre");
			System.out.println("4. Modificar fecha de nacimineto");
			System.out.println("5. Modificar numero de polera");
			System.out.println("6. Modificar sueldo");
			System.out.println("7. Modificar nacionalidad");
			System.out.println("8. Modificar altura");
			System.out.println("9. Modificar peso");
			System.out.println("10. Modificar pie habil");
			System.out.println("0. Salir");
			System.out.println();

			opcion = InputTypes.readInt("¿Su opción? ", scanner);

			if (opcion >= 0 && opcion <= 10) {
				return opcion;
			}
		}
	}

	
	public static void menuModificar(Scanner scanner, Jugador jugador) {
		boolean salir = false;

		while (!salir) {
			switch (encabezadoModificar(scanner)) {
			case 0:
				salir = true;
				break;
			case 1:
				jugador.setCodigoEquipo(InputTypes.readInt("Ingresar codigo del nuevo equipo: ", scanner));
				break;
			case 2: 
				jugador.setDNI(InputTypes.readInt("Ingrese el nuevo DNI: ", scanner));
				break;
			case 3:
				jugador.setNombreCompleto(InputTypes.readString("Ingresar el nuevo nombre: ", scanner));
				break;
			case 4:
				jugador.setFechaNacimiento(InputTypes.readString("Ingrese la nueva fecha de nacimiento: ", scanner));
				break;
			case 5:
				jugador.setNumeroPolera(InputTypes.readInt("Ingrese el nuevo numero de polera: ", scanner));
				break;
			case 6:
				jugador.setSueldo(InputTypes.readDouble("Ingrese el nuevo sueldo: ", scanner));
				break;
			case 7:
				jugador.setNacionalidad(InputTypes.readString("Ingrese la nueva nacionalidad: ", scanner));
				break;
			case 8:
				jugador.setAltura(InputTypes.readDouble("Ingrese la nueva altura: ", scanner));
				break;
			case 9:
				jugador.setPeso(InputTypes.readDouble("Ingrese el nuevo peso: ", scanner));
				break;
			case 10: 
				jugador.setPieHabil(InputTypes.readString("Ingrese el pie habil: ", scanner));
				break;
			}
		}
	}

	//inge falta llamar input .... y los otros por partes hicims parte de partidosio luciano al unir se importara BIBLIOTECA attm.ANDERSSONZURITA
}
