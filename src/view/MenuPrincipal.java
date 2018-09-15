package view;

import java.sql.SQLException;
import java.util.Scanner;

import arbitro.entity.NoExisteArbitro;
import arbitro.view.ArbitrosIO;
import cambio.entity.NoExisteCambio;
import cambio.view.CambiosIO;
import control.Conexion;
import equipo.entity.NoExisteEquipo;
import equipo.view.EquiposIO;
import estadistica.entity.NoExisteEstadistica;
import estadistica.view.EstadisticasIO;
import jugador.entity.NoExisteJugador;
import jugador.view.JugadoresIO;
import partido.entity.NoExistePartido;
import partido.view.PartidosIO;
import tarjeta.entity.NoExisteTarjeta;
import tarjeta.view.TarjetasIO;

public class MenuPrincipal {

	public static int encabezado(Scanner scanner) {
		int opcion;

		while (true) {
			System.out.println("Ingrese una opcion: ");
			System.out.println("------------------- ");
			System.out.println("1. Equipo");
			System.out.println("2. Jugador");
			System.out.println("3. Arbitro");
			System.out.println("4. Partido");
			System.out.println("5. Tarjeta");
			System.out.println("6. Cambio");
			System.out.println("7. Estadistica");
			System.out.println();

			opcion = InputTypes.readInt("¿Su opción? ", scanner);

			if (opcion >= 0 && opcion <= 7) {
				return opcion;
			}
		}
	}
	
	public static void menú(Scanner scanner) throws ClassNotFoundException, SQLException, NoExisteJugador, NoExisteEquipo, NoExisteArbitro, NoExistePartido, NoExisteEstadistica, NoExisteTarjeta, NoExisteCambio {
		boolean salir = false;
		
		Conexion conexion = new Conexion("root","","proyectofinal");
		ArbitrosIO arbitrosIO = new ArbitrosIO(conexion, scanner);
		CambiosIO cambiosIO = new CambiosIO(conexion, scanner);
		EquiposIO equiposIO = new EquiposIO(conexion, scanner);
		EstadisticasIO estadisticasIO = new EstadisticasIO(conexion, scanner);
		JugadoresIO jugadoresIO = new JugadoresIO(conexion, scanner);
		PartidosIO partidosIO = new PartidosIO(conexion, scanner);
		TarjetasIO tarjetasIO = new TarjetasIO(conexion, scanner);
		
		while (!salir) {
			switch (encabezado(scanner)) {
			case 0:
				salir = true;
				break;
			case 1:
				equipo.view.Menu.menu(scanner, equiposIO);
				break;
			case 2:
				jugador.view.Menu.menu(scanner, jugadoresIO);
				break;
			case 3:
				arbitro.view.Menu.menu(scanner, arbitrosIO);
				break;
			case 4:
				partido.view.Menu.menu(scanner, partidosIO);
				break;
			case 5:
				tarjeta.view.Menu.menu(scanner, tarjetasIO);
				break;
			case 6:
				cambio.view.Menu.menu(scanner, cambiosIO);
				break;
			case 7: 
				estadistica.view.Menu.menu(scanner, estadisticasIO);
		
			}
		}
		conexion.close();
	}
}
