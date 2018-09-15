package view;

import java.sql.SQLException;
import java.util.Scanner;

import arbitro.entity.NoExisteArbitro;
import cambio.entity.NoExisteCambio;
import equipo.entity.NoExisteEquipo;
import estadistica.entity.NoExisteEstadistica;
import jugador.entity.NoExisteJugador;
import partido.entity.NoExistePartido;
import tarjeta.entity.NoExisteTarjeta;

public class Main {

	public static void main(String[] args) throws NoExisteJugador, NoExisteEquipo, NoExisteArbitro, NoExistePartido, NoExisteEstadistica, NoExisteTarjeta, NoExisteCambio {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		try {
			view.MenuPrincipal.menú(scanner);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		scanner.close();
	}
}
