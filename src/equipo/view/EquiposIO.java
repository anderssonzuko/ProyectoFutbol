package equipo.view;

import java.sql.SQLException;
import java.util.Scanner;

import control.Conexion;
import equipo.entity.Equipo;
import equipo.entity.NoExisteEquipo;
import view.InputTypes;

public class EquiposIO {

	private Conexion conexion;
	private Scanner scanner;

	public EquiposIO(Conexion conexion, Scanner scanner) {
		this.conexion = conexion;
		this.scanner = scanner;
	}
	
	public void add() throws SQLException {
		Equipo equipo = EquipoIO.ingresar(scanner);
		String sql = "Insert into Equipo (nombre, ciudad, presupuestoAnual) values(?,?,?)";
			conexion.consulta(sql);
			conexion.getSentencia().setString(1, equipo.getNombre());
			conexion.getSentencia().setString(2, equipo.getCiudad());
			conexion.getSentencia().setInt(3, equipo.getPresupuestoAnual());
			conexion.modificacion();
	}
	
	
	public void delete() {
		int codigoEquipo = InputTypes.readInt("Código del equipo: ", scanner);
		String sql = "delete from equipo where codigoEquipo = ?";
		try {
			conexion.consulta(sql);
			conexion.getSentencia().setInt(1, codigoEquipo);
			conexion.modificacion();
		} catch (SQLException e) {
			System.out.println(e.getSQLState());
		}
	}
	
	public void update() throws NoExisteEquipo, SQLException {
		java.sql.ResultSet resultSet;
		Equipo equipo;
		String nombre;
		String ciudad;
		int presupuestoAnual;
		int codigo;
		int codigoEquipo = InputTypes.readInt("Código del equipo: ", scanner);
		String sql = "select * from equipo where codigoEquipo = ?";
		conexion.consulta(sql);
		conexion.getSentencia().setInt(1, codigoEquipo);
		resultSet = conexion.resultado();
		if (resultSet.next()) {
			codigo = resultSet.getInt("codigoEquipo");
			nombre = resultSet.getString("nombre");
			ciudad = resultSet.getString("ciudad");
			presupuestoAnual = resultSet.getInt("presupuestoAnual");
			equipo = new Equipo(codigo, nombre, ciudad, presupuestoAnual);
		} else {
			throw new NoExisteEquipo();
		}

		System.out.println(equipo);
		Menu.menuModificar(scanner, equipo);

		sql = "update equipo set nombre = ?, ciudad = ?, presupuestoAnual = ?  where codigoEquipo = ?";

		conexion.consulta(sql);
		conexion.getSentencia().setString(1, equipo.getNombre());
		conexion.getSentencia().setString(2, equipo.getCiudad());
		conexion.getSentencia().setInt(3, equipo.getPresupuestoAnual());
		conexion.getSentencia().setInt(4, equipo.getCodigoEquipo());
		conexion.modificacion();
	}
	
	public void list() throws SQLException {
		Equipo equipo;
		String sql = "select * from equipo ";
		conexion.consulta(sql);
		java.sql.ResultSet resultSet = conexion.resultado();
		while (resultSet.next()) {
			equipo = new Equipo(resultSet.getInt("codigoEquipo"), resultSet.getString("nombre"), resultSet.getString("ciudad"),
					resultSet.getInt("presupuestoAnual"));
			System.out.println(equipo);
		}
		
	}
	
}
