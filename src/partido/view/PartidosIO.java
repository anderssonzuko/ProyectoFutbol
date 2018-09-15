package partido.view;

import java.sql.SQLException;
import java.util.Scanner;

import arbitro.entity.NoExisteArbitro;
import control.Conexion;
import estadistica.entity.NoExisteEstadistica;
import partido.entity.NoExistePartido;
import partido.entity.Partido;
import view.InputTypes;

public class PartidosIO {

	private Conexion conexion;
	private Scanner scanner;

	public PartidosIO(Conexion conexion, Scanner scanner) {
		this.conexion = conexion;
		this.scanner = scanner;
	}
	
	public void add() throws NoExisteArbitro, NoExisteEstadistica {
		Partido partido = PartidoIO.ingresar(scanner);
		String sql = "Insert into Partido (codigoEquipo1, codigoEquipo2, codigoArbitro, codigoEstadistica, fecha, estadio, ciudad) values(?,?,?,?,?,?,?)";
			try {
			conexion.consulta(sql);
			conexion.getSentencia().setInt(1, partido.getCodigoEquipo1());
			conexion.getSentencia().setInt(2, partido.getCodigoEquipo2());
			conexion.getSentencia().setInt(3, partido.getCodigoArbitro());
			conexion.getSentencia().setInt(4, partido.getCodigoEstadistica());
			conexion.getSentencia().setString(5, partido.getFecha());
			conexion.getSentencia().setString(6, partido.getEstadio());
			conexion.getSentencia().setString(7, partido.getCiudad());
			conexion.modificacion();
			}catch (SQLException e) {
				throw new NoExisteArbitro();
			}
	}
	public void delete() {
		int codigoPartido = InputTypes.readInt("Código del partido: ", scanner);
		String sql = "delete from partido where codigoPartido = ?";
		try {
			conexion.consulta(sql);
			conexion.getSentencia().setInt(1, codigoPartido);
			conexion.modificacion();
		} catch (SQLException e) {
			System.out.println(e.getSQLState());
		}
	}
	
	public void update() throws NoExistePartido, SQLException, NoExisteArbitro, NoExisteEstadistica {
		java.sql.ResultSet resultSet;
		Partido partido;
		int codigoEquipo1;
		int codigoEquipo2;
		int codigoArbitro;
		int codigoEstadistica;
		String fecha;
		String estadio;
		String ciudad;
		int codigo;
		int codigoPartido = InputTypes.readInt("Código del partido: ", scanner);
		String sql = "select * from partido where codigoPartido = ?";
		conexion.consulta(sql);
		conexion.getSentencia().setInt(1, codigoPartido);
		resultSet = conexion.resultado();
		if (resultSet.next()) {
			codigo = resultSet.getInt("codigoPartido");
			codigoEquipo1 = resultSet.getInt("codigoEquipo1");
			codigoEquipo2 = resultSet.getInt("codigoEquipo2");
			codigoArbitro = resultSet.getInt("codigoArbtitro");
			codigoEstadistica = resultSet.getInt("codigoEstadistica");
			fecha = resultSet.getString("fecha");
			estadio = resultSet.getString("estadio");
			ciudad = resultSet.getString("ciudad");
			partido = new Partido(codigo, codigoEquipo1, codigoEquipo2, codigoArbitro, codigoEstadistica, fecha, estadio, ciudad);
		} else {
			throw new NoExistePartido();
		}

		System.out.println(partido);
		Menu.menuModificar(scanner, partido);

		sql = "update partido set codigoEquipo1 = ?, codigoEquipo2 = ?, codigoArbitro = ?, codigoEstadistica = ?, fecha=?, ciudad=?  where codigoPartido = ?";

		conexion.consulta(sql);
		conexion.getSentencia().setInt(1, partido.getCodigoEquipo1());
		conexion.getSentencia().setInt(2, partido.getCodigoEquipo2());
		conexion.getSentencia().setInt(3, partido.getCodigoArbitro());
		conexion.getSentencia().setInt(4, partido.getCodigoEstadistica());
		conexion.getSentencia().setString(5, partido.getFecha());
		conexion.getSentencia().setString(6, partido.getEstadio());
		conexion.getSentencia().setString(7, partido.getCiudad());
		conexion.modificacion();
	}
	
	public void list() throws SQLException {
		Partido partido;
		String sql = "select * from partido ";
		conexion.consulta(sql);
		java.sql.ResultSet resultSet = conexion.resultado();
		while (resultSet.next()) {
			partido = new Partido(resultSet.getInt("codigoPartido"), resultSet.getInt("codigoEquipo1"),resultSet.getInt("codigoEquipo2"),
					resultSet.getInt("codigoArbitro"),resultSet.getInt("codigoEstadistica"), resultSet.getString("fecha"),
					resultSet.getString("estadio"),resultSet.getString("ciudad"));
			System.out.println(partido);
		}
		
	}
	

}
