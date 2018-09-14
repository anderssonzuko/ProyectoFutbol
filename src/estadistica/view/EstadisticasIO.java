package estadistica.view;

import java.sql.SQLException;
import java.util.Scanner;

import control.Conexion;
import estadistica.entity.Estadistica;
import estadistica.entity.NoExisteEstadistica;
import view.InputTypes;

public class EstadisticasIO {
	private Conexion conexion;
	private Scanner scanner;

	public EstadisticasIO(Conexion conexion, Scanner scanner) {
		this.conexion = conexion;
		this.scanner = scanner;
	}
	
	public void add() {
		Estadistica estadistica = EstadisticaIO.ingresar(scanner);
		String sql = "Insert into Estadistica (codigoTarjetas, codigoEquipos, disparos, posesion, tirosLibres, corners, penales, fueraDeJuego, goles, codigoCambios) values(?,?,?,?,?,?,?,?,?,?)";
			conexion.consulta(sql);
			conexion.getSentencia().setString(1, estadistica.getCodigoTarjetas());
			conexion.getSentencia().setString(2, estadistica.getCodigoEquipos());
			conexion.getSentencia().setString(3, estadistica.getDisparos());
			conexion.getSentencia().setString(4, estadistica.getPosesion());
			conexion.getSentencia().setString(5, estadistica.getTirosLibres());
			conexion.getSentencia().setString(6, estadistica.getCorners());
			conexion.getSentencia().setString(7, estadistica.getPenales());
			conexion.getSentencia().setString(8, estadistica.getFueraDeJuego());
			conexion.getSentencia().setString(9, estadistica.getGoles());
			conexion.getSentencia().setString(10, estadistica.getCodigoCambios());
			conexion.modificacion();
	}
	public void delete() {
		int codigoEstadistica = InputTypes.readInt("Código de la tabla de estadisticas: ", scanner);
		String sql = "delete from estadistica where codigoEstadistica = ?";
		try {
			conexion.consulta(sql);
			conexion.getSentencia().setInt(1, codigoEstadistica);
			conexion.modificacion();
		} catch (SQLException e) {
			System.out.println(e.getSQLState());
		}
	}
	
	public void update() throws NoExisteEstadistica, SQLException {
		java.sql.ResultSet resultSet;
		Estadistica estadistica;
		String codigoTarjetas;
		String codigoEquipos;
		String disparos;
		String posesion;
		String tirosLibres;
		String corners;
		String penales;
		String fueraDeJuego;
		String goles;
		String codigoCambios;
		int codigo;
		int codigoEstadistica = InputTypes.readInt("Código de la tabla de estadisticas: ", scanner);
		String sql = "select * from estadistica where codigoEstadistica = ?";
		conexion.consulta(sql);
		conexion.getSentencia().setInt(1, codigoEstadistica);
		resultSet = conexion.resultado();
		if (resultSet.next()) {
			codigo = resultSet.getInt("codigoEstadistica");
			codigoTarjetas = resultSet.getString("codigoTarjetas");
			codigoEquipos = resultSet.getString("codigoEquipos");
			disparos = resultSet.getString("disparos");
			posesion = resultSet.getString("posesion");
			tirosLibres = resultSet.getString("tirosLibres");
			corners = resultSet.getString("corners");
			penales = resultSet.getString("penales");
			fueraDeJuego = resultSet.getString("fueraDeJuego");
			goles = resultSet.getString("goles");
			codigoCambios = resultSet.getString("codigocambios");
			estadistica = new Estadistica(codigo, codigoTarjetas, codigoEquipos, disparos, posesion, tirosLibres,corners, penales, fueraDeJuego, goles, codigoCambios);
		} else {
			throw new NoExisteEstadistica();
		}

		System.out.println(estadistica);
		Menu.menuModificar(scanner, estadistica);

		sql = "update estadistica set codigoTarjetas = ?, codigoEquipos = ?, disparos = ?, posesion = ?, tirosLibres=?, corners=?, penales=?, fueraDeJuego=?, goles=?, codigoCambios=?  where codigoEstadistica = ?";

		conexion.consulta(sql);
		conexion.getSentencia().setString(1, estadistica.getCodigoTarjetas());
		conexion.getSentencia().setString(2, estadistica.getCodigoEquipos());
		conexion.getSentencia().setString(3, estadistica.getDisparos());
		conexion.getSentencia().setString(4, estadistica.getPosesion());
		conexion.getSentencia().setString(5, estadistica.getTirosLibres());
		conexion.getSentencia().setString(6, estadistica.getCorners());
		conexion.getSentencia().setString(7, estadistica.getPenales());
		conexion.getSentencia().setString(8, estadistica.getFueraDeJuego());
		conexion.getSentencia().setString(9, estadistica.getGoles());
		conexion.getSentencia().setString(10, estadistica.getCodigoCambios());
		conexion.modificacion();
	}
	
	public void list() throws SQLException {
		Estadistica estadistica;
		String sql = "select * from estadistica ";
		conexion.consulta(sql);
		java.sql.ResultSet resultSet = conexion.resultado();
		while (resultSet.next()) {
			estadistica = new Estadistica(resultSet.getInt("codigoEstadistica"), resultSet.getString("codigoTarjetas"), resultSet.getString("codigoEquipos"),
					resultSet.getString("disparos"), resultSet.getString("posesion"), resultSet.getString("tirosLibres"),
					resultSet.getString("corners"), resultSet.getString("penales"), resultSet.getString("fueraDeJuego"),
					resultSet.getString("goles"), resultSet.getString("codigoCambios"));
			System.out.println(estadistica);
		}
		
	}
	

}
