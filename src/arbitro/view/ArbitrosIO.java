package arbitro.view;

import java.sql.SQLException;
import java.util.Scanner;

import arbitro.entity.Arbitro;
import arbitro.entity.NoExisteArbitro;
import control.Conexion;
import partido.entity.NoExistePartido;
import view.InputTypes;
import control.Conexion;

public class ArbitrosIO {
	
	private Conexion conexion;
	private Scanner scanner;

	public ArbitrosIO(Conexion conexion, Scanner scanner) {
		this.conexion = conexion;
		this.scanner = scanner;
	}
	
	public void add() throws NoExistePartido {
		Arbitro arbitro = ArbitroIO.ingresar(scanner);
		String sql = "Insert into Arbitro (codigoPartido, DNI, nombre, fechaNacimiento, nacionalidad) values(?,?,?,?,?)";
		try {
			conexion.consulta(sql);
			conexion.getSentencia().setInt(1, arbitro.getCodigoPartido());
			conexion.getSentencia().setInt(2, arbitro.getDNI());
			conexion.getSentencia().setString(3, arbitro.getNombre());
			conexion.getSentencia().setString(4, arbitro.getFechaNacimiento());
			conexion.getSentencia().setString(5, arbitro.getNacionalidad());
			conexion.modificacion();
		} catch (SQLException e) {
			throw new NoExistePartido();
		}
	}
	
	
	public void delete() {
		int codigoArbitro = InputTypes.readInt("Código del arbitro: ", scanner);
		String sql = "delete from arbitro where codigoArbitro = ?";
		try {
			conexion.consulta(sql);
			conexion.getSentencia().setInt(1, codigoArbitro);
			conexion.modificacion();
		} catch (SQLException e) {
			System.out.println(e.getSQLState());
		}
	}
	
	public void update() throws NoExisteArbitro, SQLException, NoExistePartido {
		java.sql.ResultSet resultSet;
		Arbitro arbitro;
		int codigoPartido;
		int DNI;
		String nombre;
		String fechaNacimineto;
		String nacionalidad;
		int codigo;
		int codigoArbitro = InputTypes.readInt("Código de arbitro: ", scanner);
		String sql = "select * from arbitro where codigoArbitro = ?";
		conexion.consulta(sql);
		conexion.getSentencia().setInt(1, codigoArbitro);
		resultSet = conexion.resultado();
		if (resultSet.next()) {
			codigo = resultSet.getInt("codigoArbitro");
			codigoPartido = resultSet.getInt("codigoPartido");
			DNI = resultSet.getInt("DNI");
			nombre = resultSet.getString("nombre");
			fechaNacimineto = resultSet.getString("FechaNacimiento");
			nacionalidad = resultSet.getString("nacionalidad");
			arbitro = new Arbitro(codigo, codigoPartido, DNI, nombre, fechaNacimineto, nacionalidad);
		} else {
			throw new NoExisteArbitro();
		}

		System.out.println(arbitro);
		Menu.menuModificar(scanner, arbitro);

		sql = "update arbitro set codigoPartido = ?, DNI = ?, nombre = ?, fechaNacimiento = ?,  nacionalidad = ?  where codigoArbitro = ?";

		conexion.consulta(sql);
		conexion.getSentencia().setInt(1, arbitro.getCodigoPartido());
		conexion.getSentencia().setInt(2, arbitro.getDNI());
		conexion.getSentencia().setString(3, arbitro.getNombre());
		conexion.getSentencia().setString(4, arbitro.getFechaNacimiento());
		conexion.getSentencia().setString(5, arbitro.getNacionalidad());
		conexion.modificacion();
	}

	public void list() throws SQLException {
		Arbitro arbitro;
		String sql = "select * from arbitro ";
		conexion.consulta(sql);
		java.sql.ResultSet resultSet = conexion.resultado();
		while (resultSet.next()) {
			arbitro = new Arbitro(resultSet.getInt("codigoArbitro"), resultSet.getInt("codigoPartido"), resultSet.getInt("DNI"),
					resultSet.getString("nombre"), resultSet.getString("fechaNacimiento"), resultSet.getString("nacionalidad"));
			System.out.println(arbitro);
		}
		
	}
}
